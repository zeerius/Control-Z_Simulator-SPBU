public abstract class SPBU 
{
    public static int pendapatan = 0;

    // constructor
    public SPBU()
    {

    }

    // abstract method
    public abstract void isiMinyak();

    public abstract boolean tambahPelanggan(Pelanggan pelanggan);
    
    // keterangan
    public String toString()
    {
        return "Pendapatan sekarang adalah + " + pendapatan;
    }
}