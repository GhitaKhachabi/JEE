package ext;

import Dao.IDao;

public class DaoImpVWS implements IDao {
    @Override
    public double getData() {
        System.out.println("Version web service");
        return 90;
    }
}
