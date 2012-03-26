/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bahrie.tokobukuapp.entity;

/**
 *
 * @author bahrie
 */
public class Buku {

    private String id;
    private String judul;
    private String noisbn;
    private String penulis;
    private String penerbit;
    private String tahun;
    private int stok;
    private double hargaPokok;
    private double hargaJual;
    private int ppn;
    private int diskon;


    //class buku
    public Buku() {
    }

    public Buku(String id, String judul, String noisbn, String penulis, String penerbit, String tahun, int stok, double hargaPokok, double hargaJual, int ppn, int diskon) {
        this.id = id;
        this.judul = judul;
        this.noisbn = noisbn;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.tahun = tahun;
        this.stok = stok;
        this.hargaPokok = hargaPokok;
        this.hargaJual = hargaJual;
        this.ppn = ppn;
        this.diskon = diskon;
    }

    public int getDiskon() {
        return diskon;
    }

    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }

    public double getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(double hargaJual) {
        this.hargaJual = hargaJual;
    }

    public double getHargaPokok() {
        return hargaPokok;
    }

    public void setHargaPokok(double hargaPokok) {
        this.hargaPokok = hargaPokok;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getNoisbn() {
        return noisbn;
    }

    public void setNoisbn(String noisbn) {
        this.noisbn = noisbn;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getPpn() {
        return ppn;
    }

    public void setPpn(int ppn) {
        this.ppn = ppn;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }
}
