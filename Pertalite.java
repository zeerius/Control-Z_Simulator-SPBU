/**
 * Class Pertalite mewakili SPBU untuk transaksi pertalite
 *
 * @author (Control-Z)
 * @version (08/01/2021)
 */
public class Pertalite extends SPBU
{
    private BahanBakar tangkiPertalite;
    
    /**
     * Method constructor untuk class Pertalite. 
     * Harga pertalite perliter adalah Rp7650,-
     */
    public Pertalite()
    {
        tangkiPertalite = new BahanBakar(7650, "Pertalite", 50, 1000);
    }
    
    /**
     * Method getter untuk tangki. 
     * @return tangkiPertalite
     */
    @Override
    public BahanBakar getTangki()
    {
        return this.tangkiPertalite;
    }
    
    /**
     * Method untuk mengisi minyak pada tangki.
     * @param user pengguna jasa SPBU
     * @param liter jumlah liter bahan bakar yang akan diisi
     * @param biaya biaya transaksi
     */
    @Override
    public void isiMinyak(User user, int liter, int biaya)
    {
        tangkiPertalite.kurangi(liter);
        user.kurangi(biaya);
        pendapatan += biaya;
    }
    
    /**
     * Method untuk mengecek isi tangki.
     * @param liter jumlah liter bahan bakar yang akan diisi
     * @return true jika isi tangki cukup untuk melakukan transaksi, false jika tidak
     */
    @Override
    public boolean cekIsiTangki(int liter)
    {
        return tangkiPertalite.getIsiTangki() >= liter;
    }
    
    /**
     * Method untuk mengecek saldo user.
     * @param saldo saldo user
     * @return true jika saldo user cukup untuk melakukan transaksi, false jika tidak
     */
    @Override
    public boolean cekSaldoUser(int saldo)
    {
        return saldo >= tangkiPertalite.getHarga();
    }
}
