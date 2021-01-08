import java.util.Scanner;

public class Premium extends SPBU
{
    private BahanBakar tangkiPremium;

    public Premium()
    {
        tangkiPremium = new BahanBakar(6500, "Premium", 50, 1000);
    }

    @Override
    public BahanBakar getTangki()
    {
        return this.tangkiPremium;
    }

    @Override
    public void isiMinyak(User user, int liter, int biaya)
    {
        tangkiPremium.kurangi(liter);
        user.kurangi(biaya);
        pendapatan += biaya;
    }

    @Override
    public boolean cekIsiTangki(int liter)
    {
        return tangkiPremium.getIsiTangki() >= liter;
    }

    @Override
    public boolean cekSaldoUser(int saldo)
    {
        return saldo >= tangkiPremium.getHarga();
    }
}
