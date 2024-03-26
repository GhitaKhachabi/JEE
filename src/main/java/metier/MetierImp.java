package metier;

import Dao.IDao;
import ext.DaoImpVWS;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImp implements IMetier{

    private IDao dao;

    public MetierImp(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }

    public void setDao(IDao dao)
    {
        this.dao=dao;
    }
}
