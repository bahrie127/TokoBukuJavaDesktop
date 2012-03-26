/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bahrie.tokobukuapp.implement;

import bahrie.tokobukuapp.entity.Distributor;
import bahrie.tokobukuapp.interfaces.InterDistributor;
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
public class ImplemDistributor implements InterDistributor{

    public Distributor insert(Distributor o) throws SQLException {
        PreparedStatement ps=DatabaseUtilities.getConnection().prepareStatement("insert into distributor values(?,?,?,?)");
        ps.setInt(1, o.getId());
        ps.setString(2, o.getNama());
        ps.setString(3, o.getAlamat());
        ps.setString(4, o.getTelepon());
        ps.executeUpdate();
        return o;
    }

    public void update(Distributor o) throws SQLException {
        PreparedStatement ps=DatabaseUtilities.getConnection().prepareStatement("update distributor set nama_distributor=?,alamat=?,telepon=? where id_distributor=?");
        ps.setString(1, o.getNama());
        ps.setString(2, o.getAlamat());
        ps.setString(3, o.getTelepon());
        ps.setInt(4, o.getId());
        ps.executeUpdate();
    }

    public void delete(int o) throws SQLException {
        PreparedStatement ps=DatabaseUtilities.getConnection().prepareStatement("delete from distributor where=?");
        ps.setInt(1, o);
        ps.executeUpdate();
    }

    public List<Distributor> getAll() throws SQLException {
        Statement st=DatabaseUtilities.getConnection().createStatement();
        ResultSet rs=st.executeQuery("select *from distributor");
        List<Distributor> list=new ArrayList<Distributor>();
        while(rs.next()){
            Distributor o=new Distributor();
            o.setId(rs.getInt("id_distributor"));
            o.setNama(rs.getString("nama_distributor"));
            o.setAlamat(rs.getString("alamat"));
            o.setTelepon(rs.getString("telepon"));
            list.add(o);
        }
        return list;
    }

    public Distributor getByNama(String o) throws SQLException {
        PreparedStatement ps=DatabaseUtilities.getConnection().prepareStatement("select id_distributor from distributor where nama_distributor=?");
        ps.setString(1, o);
        ResultSet rs=ps.executeQuery();
        Distributor d=new Distributor();
        if(rs.next()){
            d.setId(rs.getInt("id_distributor"));
        }
        return d;
    }

}
