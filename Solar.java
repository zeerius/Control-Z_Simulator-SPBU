import java.util.ArrayList;

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
}