/**
 * Class User berisi data-data user.
 *
 * @author (Control-Z)
 * @version (08/01/2021)
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
    * 
    * @param email 	email user
    * @param password	password user
    */
    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.nama = "";
        this.alamat = "";
        this.jenisKendaraan = "";
        this.noHp = "";
        this.saldo = 10000;
    }
	
   /**
    * Method mutator untuk memasukkan email
    *
    * @param email email user
    */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Method accessor untuk mengembalikan email User
     * 
     * @return email 
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Method mutator untuk memasukkan password User
     * 
     * @param password password user
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Method accessor untuk mengembalikan Password User
     *
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Method mutator untuk memasukkan nama User
     *
     * @param nama nama user
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Method accessor untuk mengembalikan nama User
     *
     * @return nama
     */
    public String getNama() {
        return this.nama;
    }

    /**
     * Method mutator untuk memasukkan alamat User
     *
     * @param alamat alamat user
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * Method accessor untuk mengembalikan alamat User
     *
     * @return alamat
     */
    public String getAlamat() {
        return this.alamat;
    }
	
    /**
     * Method mutator untuk memasukkan jenis kendaraan milik User
     *
     * @param jenisKendaraan jenis kendaraan user
     */
    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    /**
     * Method accessor untuk mengembalikan jenis kendaraan milik User
     *
     * @return jenisKendaraan
     */
    public String getJenisKendaraan() {
        return this.jenisKendaraan;
    }

    /**
     * Method mutator untuk memasukkan no HP User
     *
     * @param noHp nomor hp user
     */
    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    /**
     * Method accessor untuk mengembalikan no HP User
     *
     * @return noHp
     */
    public String getNoHp() {
        return this.noHp;
    }
	
   /**
    * Method untuk menambahkan jumlah saldo User
    *
    * @param saldo saldo user
    */
   @Override
   public void tambah(int saldo) {
   	this.saldo += saldo;
   }

    /**
     * Method untuk mengurangi jumlah saldo User
     *
     * @param saldo
     */
    @Override
    public void kurangi(int saldo) {
        this.saldo -= saldo;
    }

    /**
     * Method accessor untuk mengembalikan saldo User
     *
     * @return saldo
     */
    public int getSaldo() {
        return this.saldo;
    }

    /**
     * Method untuk menampilkan saldo dan jenis kendaraan milik User dalam bentuk String
     *
     * @return saldo dan jenisKendaraan
     */
    public String toString() {
    	return "Pelanggan memiliki saldo sejumlah Rp "+this.saldo+" dan jenis kendaraan yang dimilikinya adalah "+this.jenisKendaraan;
    }
  
}
