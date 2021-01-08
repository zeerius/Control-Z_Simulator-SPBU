/**
 * Class BahanBakar mewakili bahan bakar dari setiap jenis SPBU
 * 
 * @author (Control-Z)
 * @version (08/01/2021)
 */
public class BahanBakar implements TambahKurang
{
    private int harga;
    private String jenis;
    private int isiTangki;
    private int kapasitas;

    /**
     * Method constructor dari class BahanBakar
     * @param harga harga perliter tergantung jenis bahan bakar
     * @param jenis jenis bahan bakar
     * @param isiTangki isi tangki saat ini
     * @param kapasitas kapasitas maksimal tangki SPBU
     */
    public BahanBakar(int harga, String jenis, int isiTangki, int kapasitas)
    {
        this.harga = harga;
        this.jenis = jenis;
        this.isiTangki = isiTangki;
        this.kapasitas = kapasitas;
    }
    
    /**
     * Method getter dari harga
     * @return harga
     */
    public int getHarga()
    {
        return this.harga;
    }
    
    /**
     * Method getter dari jenis
     * @return jenis
     */
    public String getJenis()
    {
        return this.jenis;
    }
    
    /**
     * Method getter dari isiTangki
     * @return isiTangki
     */
    public int getIsiTangki()
    {
        return this.isiTangki;
    }
    
    /**
     * Method getter dari kapasitas
     * @return kapasitas
     */
    public int getKapasitas()
    {
        return this.kapasitas;
    }
    
    /**
     * Method untuk menambah isi tangki
     * @param isiTangki isi tangki tambahan
     */
    @Override
    public void tambah(int isiTangki)
    {
        this.isiTangki += isiTangki;
    }
    
    /**
     * Method untuk mengurangi isi tangki
     * @param isiTangki isi tangki yang dikurangi
     */
    @Override
    public void kurangi(int isiTangki)
    {
        this.isiTangki -= isiTangki;
    }
    
    /**
     * Method untuk memberitahukan keadaan bahan bakar
     * @return keadaan bahan bakar
     */
    @Override
    public String toString()
    {
        return "Harga: " +harga+ "\njenis: " +jenis+ "\nisi tangki: " +isiTangki+ "\nkapasitas" +kapasitas;
    }
}
