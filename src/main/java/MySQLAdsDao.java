import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads{
    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException {
        DriverManager.registerDriver(new Driver());
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
        return statement.executeUpdate("INSERT INTO ads (user_id, title, description) VALUES(" + ad.getUserId() + ", '" + ad.getTitle() + "', '" + ad.getDescription() + "')");
    }
}
