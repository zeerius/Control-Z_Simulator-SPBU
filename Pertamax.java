import java.util.ArrayList;
import java.util.Scanner;

public class Pertamax extends SPBU
{
    private ArrayList<Pelanggan> pelangganPertamax;
    private BahanBakar tangkiPertamax;

    public Pertamax()
    {
        pelangganPertamax = new ArrayList<>();
        tangkiPertamax = new BahanBakar(9000, "Pertamax", 1000, 1000);
    }

    public ArrayList<Pelanggan> getPelangganPertamax()
    {
        return this.pelangganPertamax;
    }

    public BahanBakar getTangkiPertamax()
    {
        return this.tangkiPertamax;
    }

    @Override
    public boolean tambahPelanggan(Pelanggan pelanggan)
    {
        if(pelangganPertamax.size() < 10) {
            pelangganPertamax.add(pelanggan);
            return true;
        }
        return false;
    }

    @Override
    public void hapusPelanggan()
    {
        pelangganPertamax.remove(0);
    }

    @Override
    public void isiMinyak()
    {
        Scanner sc = new Scanner(System.in);
        int biaya;
        if(!cekIsiTangki()) {
            tangkiPertamax.tambah(tangkiPertamax.getKapasitas() - tangkiPertamax.getIsiTangki());
        }

        System.out.print("Berapa liter yang ingin Anda isi? ");
        int liter = sc.nextInt();
        biaya = liter * tangkiPertamax.getHarga();
        System.out.println("Biaya untuk " + liter + " liter pertamax adalah Rp" + biaya + ",00");

        if (biaya > pelangganPertamax.get(0).getUang()) {
            int biayaKurang = biaya - pelangganPertamax.get(0).getUang();
            System.out.println("Maaf, uang yang Anda miliki kurang Rp" + biayaKurang + ",00");
            System.out.print("Apakah Anda ingin menambah uang?(y/n) ");
            String pilihan = sc.next();

            if (pilihan.equalsIgnoreCase("y")) {
                pelangganPertamax.get(0).tambah(biayaKurang);
            }
            else if(cekUangPelanggan()){
                int literCukup = pelangganPertamax.get(0).getUang() / tangkiPertamax.getHarga();
                System.out.println("Dengan uang yang Anda miliki, Anda hanya dapat mengisi " + literCukup + " liter");
                System.out.print("Apakah Anda tetap ingin mengisi?(y/n) ");
                pilihan = sc.next();

                if (pilihan.equalsIgnoreCase("y")) {
                    liter = literCukup;
                    biaya = liter * tangkiPertamax.getHarga();
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
        tangkiPertamax.kurangi(liter);
        pelangganPertamax.get(0).kurangi(biaya);
        pendapatan += biaya;
        System.out.println("Bahan bakar berhasil diisi");
        hapusPelanggan();
        sc.close();
    }

    public boolean cekIsiTangki()
    {
        return tangkiPertamax.getIsiTangki() >= 60;
    }

    public boolean cekUangPelanggan()
    {
        return pelangganPertamax.get(0).getUang() >= tangkiPertamax.getHarga();
    }

}