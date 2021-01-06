import java.util.Scanner;

public class Pertamax extends SPBU
{
    private BahanBakar tangkiPertamax;

    public Pertamax()
    {
        tangkiPertamax = new BahanBakar(9000, "Pertamax", 50, 1000);
    }

    @Override
    public BahanBakar getTangki()
    {
        return this.tangkiPertamax;
    }

    @Override
    public void isiMinyak(User user, int liter, int biaya)
    {
        tangkiPertamax.kurangi(liter);
        user.kurangi(biaya);
        pendapatan += biaya;
    }

    @Override
    public boolean cekIsiTangki(int liter)
    {
        return tangkiPertamax.getIsiTangki() >= liter;
    }

    @Override
    public boolean cekSaldoUser(int saldo)
    {
        return saldo >= tangkiPertamax.getHarga();
    }
}
