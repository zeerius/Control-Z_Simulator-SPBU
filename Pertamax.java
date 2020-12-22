import java.util.ArrayList;

public class Pertamax
{
    private ArrayList<Pelanggan> pelangganPertamax;
    private BahanBakar tangkiPertamax;

    public Pertamax()
    {
        pelangganPertamax = new ArrayList<>();
        tangkiPertamax = new BahanBakar();
    }

    public ArrayList<Pelanggan> getPelangganPertamax()
    {
        return this.pelangganPertamax;
    }

    public BahanBakar getTangkiPertamax()
    {
        return this.tangkiPertamax;
    }
}