/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bahrie.tokobukuapp.implement;

import bahrie.tokobukuapp.entity.Buku;
import bahrie.tokobukuapp.interfaces.InterBuku;
import bahrie.tokobukuapp.koneksi.DatabaseUtilities;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bahrie
 */
public class ImplemBuku implements InterBuku{

    public Buku insert(Buku o) throws SQLException {
       PreparedStatement ps=DatabaseUtilities.getConnection().prepareStatement("insert buku values(?,?,?,?,?,?,?,?,?,?,?)");
       ps.setString(1, o.getId());
       ps.setString(2, o.getJudul());
       ps.setString(3, o.getNoisbn());
       ps.setString(4, o.getPenulis());
       ps.setString(5, o.getPenerbit());
       ps.setString(6, o.getTahun());
       ps.setInt(7, o.getStok());
       ps.setDouble(8, o.getHargaPokok());
       ps.setDouble(9, o.getHargaJual());
       ps.setInt(10, o.getPpn());
       ps.setInt(11, o.getDiskon());
       ps.executeUpdate();
        return o;
    }

    public void update(Buku o) throws SQLException {
        PreparedStatement ps=DatabaseUtilities.getConnection().prepareStatement("update buku set judul=?,noisbn=?,penulis=?,penerbit=?,tahun=?,"
                + "stok=?,harga_pokok=?,harga_jual=?,ppn=?,diskon=? where id_buku=?");
        ps.setString(1, o.getJudul());
       ps.setString(2, o.getNoisbn());
       ps.setString(3, o.getPenulis());
       ps.setString(4, o.getPenerbit());
       ps.setString(5, o.getTahun());
       ps.setInt(6, o.getStok());
       ps.setDouble(7, o.getHargaPokok());
       ps.setDouble(8, o.getHargaJual());
       ps.setInt(9, o.getPpn());
       ps.setInt(10, o.getDiskon());
       ps.setString(11, o.getId());
       ps.executeUpdate();
    }

    public void delete(String o) throws SQLException {
        PreparedStatement ps=DatabaseUtilities.getConnection().prepareStatement("delete from buku where id_buku=?");
        ps.setString(1, o);
        ps.executeUpdate();
    }

    public List<Buku> getAll() throws SQLException {
        Statement st=DatabaseUtilities.getConnection().createStatement();
        ResultSet rs=st.executeQuery("select *from buku");
        List<Buku> list=new ArrayList<Buku>();
        while(rs.next()){
            Buku o=new Buku();
            o.setId(rs.getString("id_buku"));
            o.setJudul(rs.getString("judul"));
            o.setNoisbn(rs.getString("noisbn"));
            o.setPenulis(rs.getString("penulis"));
            o.setPenerbit(rs.getString("penerbit"));
            o.setTahun(rs.getString("tahun"));
            o.setStok(rs.getInt("stok"));
            o.setHargaPokok(rs.getDouble("harga_pokok"));
            o.setHargaJual(rs.getDouble("harga_jual"));
            o.setPpn(rs.getInt("ppn"));
            o.setDiskon(rs.getInt("diskon"));
            list.add(o);
        }
        return list;
    }

    public List<Buku> getByPenulis(String penu) throws SQLException {
        PreparedStatement ps=DatabaseUtilities.getConnection().prepareStatement("select *from buku where penulis like ?");
        ps.setString(1, "%"+penu+"%");
        ResultSet rs=ps.executeQuery();
        List<Buku> list=new ArrayList<Buku>();
        while(rs.next()){
            Buku o=new Buku();
            o.setId(rs.getString("id_buku"));
            o.setJudul(rs.getString("judul"));
            o.setNoisbn(rs.getString("noisbn"));
            o.setPenulis(rs.getString("penulis"));
            o.setPenerbit(rs.getString("penerbit"));
            o.setTahun(rs.getString("tahun"));
            o.setStok(rs.getInt("stok"));
            o.setHargaPokok(rs.getDouble("harga_pokok"));
            o.setHargaJual(rs.getDouble("harga_jual"));
            o.setPpn(rs.getInt("ppn"));
            o.setDiskon(rs.getInt("diskon"));
            list.add(o);
        }
        return list;
    }

    public List<Buku> getByPenerbit(String pener) throws SQLException {
        PreparedStatement ps=DatabaseUtilities.getConnection().prepareStatement("select *from buku where penerbit like ?");
        ps.setString(1, "%"+pener+"%");
        ResultSet rs=ps.executeQuery();
        List<Buku> list=new ArrayList<Buku>();
        while(rs.next()){
            Buku o=new Buku();
            o.setId(rs.getString("id_buku"));
            o.setJudul(rs.getString("judul"));
            o.setNoisbn(rs.getString("noisbn"));
            o.setPenulis(rs.getString("penulis"));
            o.setPenerbit(rs.getString("penerbit"));
            o.setTahun(rs.getString("tahun"));
            o.setStok(rs.getInt("stok"));
            o.setHargaPokok(rs.getDouble("harga_pokok"));
            o.setHargaJual(rs.getDouble("harga_jual"));
            o.setPpn(rs.getInt("ppn"));
            o.setDiskon(rs.getInt("diskon"));
            list.add(o);
        }
        return list;
    }

    public List<Buku> getById(String o) throws SQLException {
        PreparedStatement ps=DatabaseUtilities.getConnection().prepareStatement("select *from buku where id_buku like ?");
        ps.setString(1,"%"+o+"%");
        ResultSet rs=ps.executeQuery();
        List<Buku> list=new ArrayList<Buku>();
        if(rs.next()){
            Buku bk=new Buku();
            bk.setId(rs.getString("id_buku"));
            bk.setJudul(rs.getString("judul"));
            bk.setNoisbn(rs.getString("noisbn"));
            bk.setPenulis(rs.getString("penulis"));
            bk.setPenerbit(rs.getString("penerbit"));
            bk.setTahun(rs.getString("tahun"));
            bk.setStok(rs.getInt("stok"));
            bk.setHargaPokok(rs.getDouble("harga_pokok"));
            bk.setHargaJual(rs.getDouble("harga_jual"));
            bk.setPpn(rs.getInt("ppn"));
            bk.setDiskon(rs.getInt("diskon"));
            list.add(bk);
        }
        return list;

    }

    public Buku getByOne(String o) throws SQLException {
        PreparedStatement ps=DatabaseUtilities.getConnection().prepareStatement("select *from buku where id_buku=?");
        ps.setString(1,o);
        ResultSet rs=ps.executeQuery();
        Buku bk=new Buku();
        if(rs.next()){

            bk.setId(rs.getString("id_buku"));
            bk.setJudul(rs.getString("judul"));
            bk.setNoisbn(rs.getString("noisbn"));
            bk.setPenulis(rs.getString("penulis"));
            bk.setPenerbit(rs.getString("penerbit"));
            bk.setTahun(rs.getString("tahun"));
            bk.setStok(rs.getInt("stok"));
            bk.setHargaPokok(rs.getDouble("harga_pokok"));
            bk.setHargaJual(rs.getDouble("harga_jual"));
            bk.setPpn(rs.getInt("ppn"));
            bk.setDiskon(rs.getInt("diskon"));

        }
        return bk;
    }

}
