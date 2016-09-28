package com.academy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class SqlServerGameRepository implements GameRepository {

    @Autowired
    private DataSource dataSource;

    @Override
    public List<User> ListUsers() {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT Name FROM [dbo].[Player]")) {
            try (ResultSet rs = ps.executeQuery()){
                List<User> users = new ArrayList<>();
                while (rs.next()) {
                    users.add(rsUser(rs));
                }
                return users;
            }
        } catch (SQLException e) {
            throw new GameRepositoryException(e);
        }
    }

    @Override
    public User findUser(long userID) {
        try (Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT Name FROM [dbo].[Player] WHERE PlayerID = ?")) {
            ps.setLong(1, userID);
            try (ResultSet rs = ps.executeQuery()){
                if(!rs.next()){
                    throw new GameRepositoryException ("No player with ID: " + userID);
                }
                else return new User(rs.getString(1));
            }
        } catch (SQLException e) {
            throw new GameRepositoryException(e);
        }
    }

    private User rsUser(ResultSet rs) throws SQLException {
        return new User(rs.getString("Name"));
    }
}
