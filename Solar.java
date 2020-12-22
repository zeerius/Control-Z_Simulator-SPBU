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