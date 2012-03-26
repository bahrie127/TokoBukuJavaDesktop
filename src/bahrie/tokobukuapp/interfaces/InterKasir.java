/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bahrie.tokobukuapp.interfaces;

import bahrie.tokobukuapp.entity.Kasir;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author bahrie
 */
public interface InterKasir {

    Kasir insert(Kasir o)throws SQLException;

    void update(Kasir o)throws SQLException;

    void delete(int o) throws SQLException;

    List<Kasir>getAll() throws SQLException;

    Kasir getByUsername(String o) throws SQLException;


}
