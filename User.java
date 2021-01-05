/**
 * Program yang berisi class User
 *
 * @author Siti Balqis Humaira
 */
public class User implements TambahKurang {

    private String email;
    private String password;
    private String nama;
    private String alamat;
    private String jenisKendaraan;
    private String noHp;
    private int saldo;
  
   /**
    * Method constructor User
    * @param email,password
    */
    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.nama = "";
        this.alamat = "";
        this.jenisKendaraan = "";
        this.noHp = "";
        this.saldo = 0;
    }
	
   /**
    * Method mutator untuk memasukkan email
    */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Method accessor untuk mengembalikan email User
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Method mutator untuk memasukkan password User
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Method accessor untuk mengembalikan Password User
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Method mutator untuk memasukkan nama User
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Method accessor untuk mengembalikan nama User
     */
    public String getNama() {
        return this.nama;
    }

    /**
     * Method mutator untuk memasukkan alamat User
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * Method accessor untuk mengembalikan alamat User
     */
    public String getAlamat() {
        return this.alamat;
    }
	/**
	 * Method mutator untuk memasukkan jenis kendaraan milik User
	 */
    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    /**
     * Method accessor untuk mengembalikan jenis kendaraan milik User
     */
    public String getJenisKendaraan() {
        return this.jenisKendaraan;
    }

    /**
     * Method mutator untuk memasukkan no HP User
     */
    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    /**
     * Method accessor untuk mengembalikan no HP User
     */
    public String getNoHp() {
        return this.noHp;
    }
	
   /**
    * Method untuk menambahkan jumlah saldo User
    * @param saldo
    */
   @Override
   public void tambah(int saldo) {
   this.saldo += saldo;
   }

    /**
     * Method untuk mengurangi jumlah saldo User
     * @param saldo
     */
    @Override
    public void kurangi(int saldo) {
    this.saldo -= saldo;
    }

    /**
     * Method accessor untuk mengembalikan saldo User
     */
    public int getSaldo() {
        return this.saldo;
    }

    /**
     * Method untuk menampilkan saldo dan jenis kendaraan milik User dalam bentuk String
     */
    public String toString() {
    return "Pelanggan memiliki saldo sejumlah Rp "+this.saldo+" dan jenis kendaraan yang dimilikinya adalah "+this.jenisKendaraan;
    }
  
}
