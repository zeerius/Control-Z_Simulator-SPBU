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
	 * Method accessor untuk mengembalikan jenis kendaraan milik pelanggan
	 */
	public String getJenisKendaraan() {
		return this.jenisKendaraan;
	}

	/**
	 * Method untuk menambahkan jumlah uang Pelanggan
	 * @param uang
	 */
	@Override
	public void tambah(int uang) {
		this.uang += uang;
		System.out.println("Rp "+uang+" berhasil ditambahkan");
	}

	/**
	 * Method untuk mengurangi jumlah uang Pelanggan
	 * @param uang
	 */
	@Override
	public void kurangi(int uang) {
		this.uang -= uang;
	}
	
	/**
	 * Method untuk menampilkan uang dan jenis kendaraan milik pelanggan dalam bentuk String
	 */
	public String toString() {
		return "Pelanggan memiliki uang sejumlah Rp "+this.uang+" dan jenis kendaraan yang dimilikinya adalah "+this.jenisKendaraan;
	}
	
}
