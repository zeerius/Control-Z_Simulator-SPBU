import java.util.ArrayList;
import java.util.Scanner;

public class Solar extends SPBU
{
    private ArrayList<Pelanggan> pelangganSolar;
    private BahanBakar tangkiSolar;

    public Solar()
    {
        pelangganSolar = new ArrayList<>();
        tangkiSolar = new BahanBakar(6000, "Solar", 1000, 1000);
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