import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() throws SQLException {
        if (adsDao == null) {
            Config config = new Config();
            adsDao = new MySQLAdsDao(config);
//            adsDao = new ListAdsDao();
        }
        return adsDao;
    }
}
