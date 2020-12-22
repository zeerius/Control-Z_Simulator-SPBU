import java.util.ArrayList;
import java.util.Scanner;

public class Solar extends SPBU
{
    private ArrayList<Pelanggan> pelangganSolar;
    private BahanBakar tangkiSolar;

    public Solar()
    {
        pelangganSolar = new ArrayList<>();
        tangkiSolar = new BahanBakar();
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
    public boolean hapusPelanggan(Pelanggan pelanggan)
    {
        if(pelangganSolar.contains(pelanggan)) {
            pelangganSolar.remove(pelanggan);
            return true;
        }
        return false;
    }

    @Override
    public void isiMinyak()
    {
        Scanner sc = new Scanner(System.in);

        if(cekIsiTangki) {
            System.out.print("Input banyak minyak (liter) : ");
            int liter = sc.nextInt();
            int biaya = liter * tangkiSolar.getHarga();
            
        } else {
            System.out.println("Tangki kosong!!");
        }
    }

    public boolean cekIsiTangki()
    {
        if(tangkiSolar.getIsiTangki() < 60) {
            return false;
        }
        return true;
    }
}