/**
 * Class Premium mewakili SPBU untuk transaksi premium
 *
 * @author (Control-Z)
 * @version (08/01/2021)
 */
public class Premium extends SPBU
{
    private BahanBakar tangkiPremium;


    /**
     * Method constructor untuk class Premium.
     * Harga premium perliter adalah Rp6500,-
     */
    public Premium()
    {
        tangkiPremium = new BahanBakar(6500, "Premium", 50, 1000);
    }
    
    /**
     * Method getter untuk tangki. 
     * @return tangkiPremium
     */    
    @Override
    public BahanBakar getTangki()
    {
        return this.tangkiPremium;
    }
    
    /**
     * Method untuk mengisi minyak user.
     * @param user pengguna jasa SPBU
     * @param liter jumlah liter bahan bakar yang akan diisi
     * @param biaya biaya transaksi
     */    
    @Override
    public void isiMinyak(User user, int liter, int biaya)
    {
        tangkiPremium.kurangi(liter);
        user.kurangi(biaya);
        pendapatan += biaya;
    }
    
    /**
    * Method untuk mengecek isi tangki.
    * @param liter jumlah liter yang akan diisi
    * @return      true jika isi tangki cukup untuk melakukan transaksi, false jika tidak
    */
    @Override
    public boolean cekIsiTangki(int liter)
    {
        return tangkiPremium.getIsiTangki() >= liter;
    }
    
    /**
    * Method untuk mengecek saldo user.
    * @param saldo saldo user
    * @return      true jika saldo user cukup untuk melakukan transaksi, false jika tidak
    */
    @Override
    public boolean cekSaldoUser(int saldo)
    {
        return saldo >= tangkiPremium.getHarga();
    }
}
