package pres;

import ext.DaoImpl2;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        MetierImpl metier= new MetierImpl(new DaoImpl2());
        //metier.setDao(new DaoImpl2());
        System.out.println(metier.calcul());
    }
}
