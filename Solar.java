import java.util.ArrayList;
import java.util.Scanner;

public class Solar extends SPBU
{
    private ArrayList<Pelanggan> pelangganSolar;
    private BahanBakar tangkiSolar;

    public Solar()
    {
        pelangganSolar = new ArrayList<>();
        tangkiSolar = new BahanBakar(9500, "Solar", 1000, 1000);
    }

    public ArrayList<Pelanggan> getPelangganSolar()
    {
        return this.pelangganSolar;
    }

    public BahanBakar getTangkiSolar()
    {
        return this.tangkiSolar;
    }

    @Override
    public boolean tambahPelanggan(Pelanggan pelanggan)
    {
        if(pelangganSolar.size() < 10) {
            pelangganSolar.add(pelanggan);
            return true;
        }
        return false;
    }

    @Override
    public void hapusPelanggan()
    {
        pelangganSolar.remove(0);
    }

    @Override
    public void isiMinyak()
    {
        Scanner sc = new Scanner(System.in);
        int biaya;
        if(!cekIsiTangki()) {
            tangkiSolar.tambah(tangkiSolar.getKapasitas() - tangkiSolar.getIsiTangki());
        }

        System.out.print("Berapa liter yang ingin Anda isi? ");
        int liter = sc.nextInt();
        biaya = liter * tangkiSolar.getHarga();
        System.out.println("Biaya untuk " + liter + " liter solar adalah Rp" + biaya + ",00");

        if (biaya > pelangganSolar.get(0).getUang()) {
            int biayaKurang = biaya - pelangganSolar.get(0).getUang();
            System.out.println("Maaf, uang yang Anda miliki kurang Rp" + biayaKurang + ",00");
            System.out.print("Apakah Anda ingin menambah uang?(y/n) ");
            String pilihan = sc.next();

            if (pilihan.equalsIgnoreCase("y")) {
                pelangganSolar.get(0).tambah(biayaKurang);
            }
            else if(cekUangPelanggan()){
                int literCukup = pelangganSolar.get(0).getUang() / tangkiSolar.getHarga();
                System.out.println("Dengan uang yang Anda miliki, Anda hanya dapat mengisi " + literCukup + " liter");
                System.out.print("Apakah Anda tetap ingin mengisi?(y/n) ");
                pilihan = sc.next();

                if (pilihan.equalsIgnoreCase("y")) {
                    liter = literCukup;
                    biaya = liter * tangkiSolar.getHarga();
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
        tangkiSolar.kurangi(liter);
        pelangganSolar.get(0).kurangi(biaya);
        pendapatan += biaya;
        System.out.println("Bahan bakar berhasil diisi");
        hapusPelanggan();
        sc.close();
    }

    public boolean cekIsiTangki()
    {
        return tangkiSolar.getIsiTangki() >= 60;
    }

    public boolean cekUangPelanggan()
    {
        return pelangganSolar.get(0).getUang() >= tangkiSolar.getHarga();
    }
}