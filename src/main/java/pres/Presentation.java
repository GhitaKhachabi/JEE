package pres;
import Dao.DaoImp;
import ext.DaoImp2;
import metier.MetierImp;
public class Presentation {
    public static void main(String[] args) {
        DaoImp2 dao=new DaoImp2();
        DaoImp dao1=new DaoImp();
         MetierImp metier = new MetierImp(dao);
         System.out.println(metier.calcul());
        //metier.setDao(dao);
        System.out.println("Resultat:"+metier.calcul());
    }
}
