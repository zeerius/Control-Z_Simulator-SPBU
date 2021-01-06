import java.util.ArrayList;
import java.util.Scanner;

public class Premium extends SPBU
{
    private ArrayList<Pelanggan> pelangganPremium;
    private BahanBakar tangkiPremium;

    public Premium()
    {
        pelangganPremium = new ArrayList<>();
        tangkiPremium = new BahanBakar(6450, "Premium", 1000, 1000);
    }

    public ArrayList<Pelanggan> getPelangganPremium()
    {
        return this.pelangganPremium;
    }

    public BahanBakar getTangkiPremium()
    {
        return this.tangkiPremium;
    }

    @Override
    public boolean tambahPelanggan(Pelanggan pelanggan)
    {
        if(pelangganPremium.size() < 10) {
            pelangganPremium.add(pelanggan);
            return true;
        }
        return false;
    }

    @Override
    public void hapusPelanggan()
    {
        pelangganPremium.remove(0);
    }

    @Override
    public void isiMinyak()
    {
        Scanner sc = new Scanner(System.in);
        int biaya;
        if(!cekIsiTangki()) {
            tangkiPremium.tambah(tangkiPremium.getKapasitas() - tangkiPremium.getIsiTangki());
        }

        System.out.print("Berapa liter yang ingin Anda isi? ");
        int liter = sc.nextInt();
        biaya = liter * tangkiPremium.getHarga();
        System.out.println("Biaya untuk " + liter + " liter Premium adalah Rp" + biaya + ",00");

        if (biaya > pelangganPremium.get(0).getUang()) {
            int biayaKurang = biaya - pelangganPremium.get(0).getUang();
            System.out.println("Maaf, uang yang Anda miliki kurang Rp" + biayaKurang + ",00");
            System.out.print("Apakah Anda ingin menambah uang?(y/n) ");
            String pilihan = sc.next();

            if (pilihan.equalsIgnoreCase("y")) {
                pelangganPremium.get(0).tambah(biayaKurang);
            }
            else if(cekUangPelanggan()){
                int literCukup = pelangganPremium.get(0).getUang() / tangkiPremium.getHarga();
                System.out.println("Dengan uang yang Anda miliki, Anda hanya dapat mengisi " + literCukup + " liter");
                System.out.print("Apakah Anda tetap ingin mengisi?(y/n) ");
                pilihan = sc.next();

                if (pilihan.equalsIgnoreCase("y")) {
                    liter = literCukup;
                    biaya = liter * tangkiPremium.getHarga();
                }
                else {
                    System.out.println("Selamat tinggal");
                    hapusPelanggan();
                    sc.close();
                    return;
                }
            }
            else {
                System.out.println("Anda tidak dapat melakukan pengisian bahan bakar");
                hapusPelanggan();
                sc.close();
                return;
            }
        }
        tangkiPremium.kurangi(liter);
        pelangganPremium.get(0).kurangi(biaya);
        pendapatan += biaya;
        System.out.println("Bahan bakar berhasil diisi");
        hapusPelanggan();
        sc.close();
    }

    public boolean cekIsiTangki()
    {
        return tangkiPremium.getIsiTangki() >= 60;
    }

    public boolean cekUangPelanggan()
    {
        return pelangganPremium.get(0).getUang() >= tangkiPremium.getHarga();
    }

}