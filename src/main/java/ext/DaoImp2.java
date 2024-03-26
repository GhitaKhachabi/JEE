package ext;

import Dao.IDao;

public class DaoImp2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Capteurs");
        double temp=6000;
        return temp;
    }
}
