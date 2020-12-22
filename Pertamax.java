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
    public boolean hapusPelanggan(Pelanggan pelanggan)
    {
        if(pelangganPertamax.contains(pelanggan)) {
            pelangganPertamax.remove(pelanggan);
            return true;
        }
        return false;
    }
}