import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{
    private Connection connection;

    public MySQLAdsDao() throws SQLException {
        Config config = new Config();
        connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
    }

    @Override
    public List<Ad> all() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM ads;");
        ArrayList<Ad> adsList = new ArrayList<>();
        while(rs.next()){
            Ad ad = new Ad(rs.getLong("id"), rs.getLong("user_id"), rs.getString("title"), rs.getString("description"));
            adsList.add(ad);
        }
        return adsList;
    }

    @Override
    public int insert(Ad ad) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeUpdate("INSERT INTO ads (id, user_id, title, description) VALUES(" + ad.getId() + ", " + ad.getUserId() + ", " + ad.getTitle() + ", " + ad.getDescription() + ")");
    }
}
