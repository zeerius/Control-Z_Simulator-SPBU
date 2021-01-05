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
  
}
