/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bahrie.tokobukuapp.interfaces;

import bahrie.tokobukuapp.entity.Buku;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author bahrie
 */
public interface InterBuku {

    Buku insert(Buku o) throws SQLException;

    void update(Buku o) throws SQLException;

    void delete(String o) throws SQLException;

    List<Buku> getAll() throws SQLException;

    List<Buku> getByPenulis(String penu) throws SQLException;

    List<Buku> getByPenerbit(String pener) throws SQLException;

    List<Buku> getById(String o) throws SQLException;

    Buku getByOne(String o) throws SQLException;
}
