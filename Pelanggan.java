/**
 * Program yang berisi class Pelanggan
 *
 * @author Siti Balqis Humaira
 */

public class Pelanggan implements TambahKurang {
	private int uang;
	private String jenisKendaraan;
	
	/**
	 * Method constructor Pelanggan
	 * @param uang,jenisKendaraan
	 */
	public Pelanggan(int uang, String jenisKendaraan) {
		this.uang = uang;
		this.jenisKendaraan = jenisKendaraan;
	}

	/**
	 * Method accessor untuk mengembalikan jumlah uang pelanggan
	 */
	public int getUang() {
		return this.uang;
	}
	
	/**
	 * Method untuk menambahkan jumlah uang Pelanggan
	 * @param uang
	 */
	@Override
	public void tambah(int uang) {
		this.uang += uang;
	}

	/**
	 * Method untuk mengurangi jumlah uang Pelanggan
	 * @param uang
	 */
	@Override
	public void kurangi(int uang) {
		this.uang -= uang;
	}
}
