/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bahrie.tokobukuapp.entity;

import java.util.Date;

/**
 *
 * @author bahrie
 */
public class Penjualan {

    private int id;
    private Buku buku;
    private Kasir kasir;
    private int jumlah;
    private double total;
    private Date tanggal;

    public Penjualan() {
    }

    public Penjualan(int id, Buku buku, Kasir kasir, int jumlah, double total, Date tanggal) {
        this.id = id;
        this.buku = buku;
        this.kasir = kasir;
        this.jumlah = jumlah;
        this.total = total;
        this.tanggal = tanggal;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public Kasir getKasir() {
        return kasir;
    }

    public void setKasir(Kasir kasir) {
        this.kasir = kasir;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
