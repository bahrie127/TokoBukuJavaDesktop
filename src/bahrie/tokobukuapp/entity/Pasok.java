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
public class Pasok {

    private int id;
    private Distributor distributor;
    private Buku buku;
    private int jumlah;
    private Date tanggal;

    public Pasok() {
    }

    public Pasok(int id, Distributor distributor, Buku buku, int jumlah, Date tanggal) {
        this.id = id;
        this.distributor = distributor;
        this.buku = buku;
        this.jumlah = jumlah;
        this.tanggal = tanggal;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Distributor getDistributor() {
        return distributor;
    }

    public void setDistributor(Distributor distributor) {
        this.distributor = distributor;
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

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    

}
