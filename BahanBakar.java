public class BahanBakar implements TambahKurang
{
    private int harga;
    private String jenis;
    private int isiTangki;
    private int kapasitas;

    //method constructor
    public BahanBakar(int harga, String jenis, int isiTangki, int kapasitas)
    {
        this.harga = harga;
        this.jenis = jenis;
        this.isiTangki = isiTangki;
        this.kapasitas = kapasitas;
    }
    
    public int getHarga()
    {
        return this.harga;
    }

    public String getJenis()
    {
        return this.jenis;
    }

    public int getIsiTangki()
    {
        return this.isiTangki;
    }

    public int getKapasitas()
    {
        return this.kapasitas;
    }

    public void tambah(int isiTangki)
    {
        this.isiTangki += isiTangki;
    }

    public void kurangi(int isiTangki)
    {
        this.isiTangki -= isiTangki;
    }

    public String toString()
    {
        return "Harga: " +harga+ "\njenis: " +jenis+ "\nisi tangki: " +isiTangki+ "\nkapasitas" +kapasitas;
    }
}
