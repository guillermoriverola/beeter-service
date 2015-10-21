package edu.upc.eetac.dsa.beeter.dao;

import edu.upc.eetac.dsa.beeter.auth.UserInfo;
import edu.upc.eetac.dsa.beeter.entity.AuthToken;

import java.sql.SQLException;

/**
 * Created by Guillermo on 21/10/2015.
 */
public interface AuthTokenDAO {
    public UserInfo getUserByAuthToken(String token) throws SQLException;
    public AuthToken createAuthToken(String userid) throws SQLException;
    public void deleteToken(String userid) throws  SQLException;
}
