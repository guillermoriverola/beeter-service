package edu.upc.eetac.dsa.beeter.dao;

import com.fasterxml.jackson.annotation.JsonInclude;
import edu.upc.eetac.dsa.beeter.entity.Sting;
import edu.upc.eetac.dsa.beeter.entity.StingCollection;

import java.sql.SQLException;

/**
 * Created by Guillermo on 21/10/2015.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface StingDAO {
    public Sting createSting(String userid, String subject, String content) throws SQLException;
    public Sting getStingById(String id) throws SQLException;
    /*public StingCollection getStings() throws SQLException;*/
    /*public StingCollection getStings(long before) throws SQLException;*/
    public StingCollection getStings(long timestamp, boolean before) throws SQLException;
    public Sting updateSting(String id, String subject, String content) throws SQLException;
    public boolean deleteSting(String id) throws SQLException;


}
