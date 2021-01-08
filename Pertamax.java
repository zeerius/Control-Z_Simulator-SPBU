/**
 * Class Pertamax mewakili SPBU untuk transaksi pertamax
 *
 * @author (Control-Z)
 * @version (08/01/2021)
 */
public class Pertamax extends SPBU
{
    private BahanBakar tangkiPertamax;
    
    /**
     * Method constructor untuk class Pertamax.
     * Harga pertamax perliter adalah Rp9000,-
     */
    public Pertamax()
    {
        tangkiPertamax = new BahanBakar(9000, "Pertamax", 50, 1000);
    }
    
    /**
     * Method getter untuk tangki. 
     * @return tangkiPertamax
     */    
    @Override
    public BahanBakar getTangki()
    {
        return this.tangkiPertamax;
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
        tangkiPertamax.kurangi(liter);
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
        return tangkiPertamax.getIsiTangki() >= liter;
    }

    /**
    * Method untuk mengecek saldo user.
    * @param saldo saldo user
    * @return      true jika saldo user cukup untuk melakukan transaksi, false jika tidak
    */
    @Override
    public boolean cekSaldoUser(int saldo)
    {
        return saldo >= tangkiPertamax.getHarga();
    }
}
