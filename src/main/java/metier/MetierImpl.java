package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier{

    /*@Autowired*/
    /*@Qualifier("dao2")*/ /*Qualifier above proprety works only if we use fiel injection via setter*/
    private IDao dao;

    public MetierImpl(@Qualifier("dao2")IDao dao) {
        this.dao = dao;
    }

/*    Injection via le constructeur exige d'avoir un seul constructeur*/
   /* public MetierImpl(){}*/

    @Override
    public double calcul() {
        double temp= dao.getData();
        return temp*540/Math.cos(temp*Math.PI);
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
