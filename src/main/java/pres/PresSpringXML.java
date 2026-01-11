package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IMetier metier = (IMetier) context.getBean(IMetier.class);
        /*IMetier.class mache seulment s'il ya une seule classe qui implemente
        IMetier sinon il faut specifier le nom de la class a injecter */
        System.out.println("Resultat => "+metier.calcul());

    }
}
