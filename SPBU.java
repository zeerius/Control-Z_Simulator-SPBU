public abstract class SPBU
{
    public static int pendapatan = 0;

    // constructor
    public SPBU()
    {

    }

    // abstract method
    public abstract void isiMinyak(User user, int liter, int biaya);

    public abstract BahanBakar getTangki();

    public abstract boolean cekIsiTangki(int liter);

    public abstract boolean cekSaldoUser(int saldo);

    // keterangan
    public String toString()
    {
        return "Pendapatan sekarang adalah + " + pendapatan;
    }
}
