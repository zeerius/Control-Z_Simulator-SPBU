/**
 * Class Solar mewakili SPBU untuk transaksi solar.
 *
 * @author (Control-Z)
 * @version (08/01/2021)
 */
public class Solar extends SPBU
{
    private BahanBakar tangkiSolar;
    
    /**
     * Method constructor untuk class Solar.
     * Harga solar perliter adalah Rp9500,-
     */
    public Solar()
    {
        tangkiSolar = new BahanBakar(9500, "Solar", 50, 1000);
    }
    
    /**
     * Method getter untuk tangki. 
     * @return tangkiSolar
     */   
    @Override
    public BahanBakar getTangki()
    {
        return this.tangkiSolar;
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
        tangkiSolar.kurangi(liter);
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
        return tangkiSolar.getIsiTangki() >= liter;
    }
    
    /**
    * Method untuk mengecek saldo user.
    * @param saldo saldo user
    * @return      true jika saldo user cukup untuk melakukan transaksi, false jika tidak
    */
    @Override
    public boolean cekSaldoUser(int saldo)
    {
        return saldo >= tangkiSolar.getHarga();
    }
}
