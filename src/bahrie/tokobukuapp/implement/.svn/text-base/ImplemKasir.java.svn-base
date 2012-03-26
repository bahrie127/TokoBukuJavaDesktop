/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bahrie.tokobukuapp.implement;

import bahrie.tokobukuapp.entity.Kasir;
import bahrie.tokobukuapp.interfaces.InterKasir;
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
public class ImplemKasir implements InterKasir{

    public Kasir insert(Kasir o) throws SQLException {
        PreparedStatement ps=DatabaseUtilities.getConnection().prepareStatement("insert into kasir values(null,?,?,?,?,?,?,?)");
        ps.setString(1, o.getNama());
        ps.setString(2, o.getAlamat());
        ps.setString(3, o.getTelepon());
        ps.setString(4, o.getStatus());
        ps.setString(5, o.getUsername());
        ps.setString(6, o.getPassword());
        ps.setString(7, o.getAkses());
        ps.executeUpdate();
        return o;
    }

    public void update(Kasir o) throws SQLException {
        PreparedStatement ps=DatabaseUtilities.getConnection().prepareStatement("update kasir set nama=?,alamat=?,telepon=?,status=?,"
                + "username=?,password=?,akses=? where id_kasir=?");
        ps.setString(1, o.getNama());
        ps.setString(2, o.getAlamat());
        ps.setString(3, o.getTelepon());
        ps.setString(4, o.getStatus());
        ps.setString(5, o.getUsername());
        ps.setString(6, o.getPassword());
        ps.setString(7, o.getAkses());
        ps.setInt(8, o.getId());
        ps.executeUpdate();
    }

    public void delete(int o) throws SQLException {
        PreparedStatement ps=DatabaseUtilities.getConnection().prepareStatement("delete from kasir where id_kasir=?");
        ps.setInt(1, o);
        ps.executeUpdate();
    }

    public List<Kasir> getAll() throws SQLException {
        Statement st=DatabaseUtilities.getConnection().createStatement();
        ResultSet rs=st.executeQuery("select *from kasir");
        List<Kasir>list=new ArrayList<Kasir>();
        while(rs.next()){
            Kasir o=new Kasir();
            o.setId(rs.getInt("id_kasir"));
            o.setNama(rs.getString("nama"));
            o.setAlamat(rs.getString("alamat"));
            o.setTelepon(rs.getString("telepon"));
            o.setStatus(rs.getString("status"));
            o.setUsername(rs.getString("username"));
            o.setPassword(rs.getString("password"));
            o.setAkses(rs.getString("akses"));
            list.add(o);
        }
        return list;
    }

    public Kasir getByUsername(String o) throws SQLException {
        PreparedStatement ps=DatabaseUtilities.getConnection().prepareStatement("select *from kasir where username=?");
        ps.setString(1, o);
        ResultSet rs=ps.executeQuery();
        Kasir kasir=new Kasir();
        if(rs.next()){
            kasir.setId(rs.getInt("id_kasir"));
            kasir.setNama(rs.getString("nama"));
            kasir.setAlamat(rs.getString("alamat"));
            kasir.setTelepon(rs.getString("telepon"));
            kasir.setStatus(rs.getString("status"));
            kasir.setUsername(rs.getString("username"));
            kasir.setPassword(rs.getString("password"));
            kasir.setAkses(rs.getString("akses"));
        }
        return kasir;
    }

}
