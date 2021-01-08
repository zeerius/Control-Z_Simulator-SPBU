public class Solar extends SPBU
{
    private BahanBakar tangkiSolar;

    public Solar()
    {
        tangkiSolar = new BahanBakar(9500, "Solar", 50, 1000);
    }

    @Override
    public BahanBakar getTangki()
    {
        return this.tangkiSolar;
    }

    @Override
    public void isiMinyak(User user, int liter, int biaya)
    {
        tangkiSolar.kurangi(liter);
        user.kurangi(biaya);
        pendapatan += biaya;
    }

    @Override
    public boolean cekIsiTangki(int liter)
    {
        return tangkiSolar.getIsiTangki() >= liter;
    }

    @Override
    public boolean cekSaldoUser(int saldo)
    {
        return saldo >= tangkiSolar.getHarga();
    }
}
