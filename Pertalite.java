import java.util.ArrayList;
import java.util.Scanner;

public class Pertalite extends SPBU
{
    private ArrayList<Pelanggan> pelangganPertalite;
    private BahanBakar tangkiPertalite;

    public Pertalite()
    {
        pelangganPertalite = new ArrayList<>();
        tangkiPertalite = new BahanBakar(7650, "Pertalite", 1000, 1000);
    }

    public ArrayList<Pelanggan> getPelangganPertalite()
    {
        return this.pelangganPertalite;
    }

    public BahanBakar getTangkiPertalite()
    {
        return this.tangkiPertalite;
    }

    @Override
    public boolean tambahPelanggan(Pelanggan pelanggan)
    {
        if(pelangganPertalite.size() < 10) {
            pelangganPertalite.add(pelanggan);
            return true;
        }
        return false;
    }

    @Override
    public void hapusPelanggan()
    {
        pelangganPertalite.remove(0);
    }

    @Override
    public void isiMinyak()
    {
        Scanner sc = new Scanner(System.in);
        int biaya;
        if(!cekIsiTangki()) {
            tangkiPertalite.tambah(tangkiPertalite.getKapasitas() - tangkiPertalite.getIsiTangki());
        }

        System.out.print("Berapa liter yang ingin Anda isi? ");
        int liter = sc.nextInt();
        biaya = liter * tangkiPertalite.getHarga();
        System.out.println("Biaya untuk " + liter + " liter Pertalite adalah Rp" + biaya + ",00");

        if (biaya > pelangganPertalite.get(0).getUang()) {
            int biayaKurang = biaya - pelangganPertalite.get(0).getUang();
            System.out.println("Maaf, uang yang Anda miliki kurang Rp" + biayaKurang + ",00");
            System.out.print("Apakah Anda ingin menambah uang?(y/n) ");
            String pilihan = sc.next();

            if (pilihan.equalsIgnoreCase("y")) {
                pelangganPertalite.get(0).tambah(biayaKurang);
            }
            else if(cekUangPelanggan()){
                int literCukup = pelangganPertalite.get(0).getUang() / tangkiPertalite.getHarga();
                System.out.println("Dengan uang yang Anda miliki, Anda hanya dapat mengisi " + literCukup + " liter");
                System.out.print("Apakah Anda tetap ingin mengisi?(y/n) ");
                pilihan = sc.next();

                if (pilihan.equalsIgnoreCase("y")) {
                    liter = literCukup;
                    biaya = liter * tangkiPertalite.getHarga();
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
        tangkiPertalite.kurangi(liter);
        pelangganPertalite.get(0).kurangi(biaya);
        pendapatan += biaya;
        System.out.println("Bahan bakar berhasil diisi");
        hapusPelanggan();
        sc.close();
    }

    public boolean cekIsiTangki()
    {
        return tangkiPertalite.getIsiTangki() >= 60;
    }

    public boolean cekUangPelanggan()
    {
        return pelangganPertalite.get(0).getUang() >= tangkiPertalite.getHarga();
    }

}