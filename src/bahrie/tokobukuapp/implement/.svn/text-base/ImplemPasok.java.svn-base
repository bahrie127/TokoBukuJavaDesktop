/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bahrie.tokobukuapp.implement;

import bahrie.tokobukuapp.entity.Pasok;
import bahrie.tokobukuapp.interfaces.InterPasok;
import bahrie.tokobukuapp.koneksi.DatabaseUtilities;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bahrie
 */
public class ImplemPasok implements InterPasok {

    public Pasok insert(Pasok o) throws SQLException {
        PreparedStatement ps = DatabaseUtilities.getConnection().prepareStatement("insert into pasok values(null,?,?,?,?)");
        PreparedStatement ps2 = DatabaseUtilities.getConnection().prepareStatement("update buku set stok=? where id_buku=?");
        ps.setInt(1, o.getDistributor().getId());
        ps.setString(2, o.getBuku().getId());
        ps.setInt(3, o.getJumlah());
        ps.setDate(4, new java.sql.Date(o.getTanggal().getTime()));
        ps.executeUpdate();
        ps2.setInt(1, o.getBuku().getStok() + o.getJumlah());
        ps2.setString(2, o.getBuku().getId());
        ps2.executeUpdate();
        return o;
    }

    public void update(Pasok o) throws SQLException {
        // PreparedStatement ps=DatabaseUtilities.getConnection().prepareStatement("update pasok set ")
    }
}
