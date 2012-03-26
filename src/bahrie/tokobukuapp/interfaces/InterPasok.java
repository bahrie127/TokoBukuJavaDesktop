/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bahrie.tokobukuapp.interfaces;

import bahrie.tokobukuapp.entity.Pasok;
import java.sql.SQLException;

/**
 *
 * @author bahrie
 */
public interface InterPasok {

    Pasok insert(Pasok o) throws SQLException;

    void update(Pasok o) throws SQLException;
}
