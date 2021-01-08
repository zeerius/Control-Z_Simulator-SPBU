/**
 * Class SPBU merupakan class abstract.
 *
 * @author (Control-Z)
 * @version (08/01/2021)
 */
public abstract class SPBU
{
    public static int pendapatan = 0;

    /**
     * Method constructor untuk class SPBU.
     */
    public SPBU()
    {

    }

    /**
     * Method abstrac untuk mengisi minyak.
     * 
     * @param user pengguna jasa SPBU
     * @param liter jumlah liter bahan bakar yang akan diisi
     * @param biaya biaya transaksi
     */
    public abstract void isiMinyak(User user, int liter, int biaya);

    /**
     * Method abstract getter untuk tangki.
     */
    public abstract BahanBakar getTangki();

    /**
     * Method abstract untuk mengecek isi tangki.
     * 
     * @param liter jumlah liter bahan bakar yang akan diisi
     * @return boolean
     */
    public abstract boolean cekIsiTangki(int liter);

    /**
     * Method abstract untuk mengecek saldo user.
     * 
     * @param saldo saldo user
     * @return boolean
     */
    public abstract boolean cekSaldoUser(int saldo);

    /**
     * Method untuk memberitahukan pendapatan SPBU.
     * 
     * @return pendapatan SPBU
     */
    public String toString()
    {
        return "Pendapatan sekarang adalah + " + pendapatan;
    }
}
