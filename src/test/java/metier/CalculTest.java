package metier;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {

    private Calcul calcul;
    @Test
    public void TestSomme(){
        calcul = new Calcul();
        double expected=3;
        double res = calcul.somme2nbr(1,2);
        Assert.assertEquals(res, expected, 0.0);

    }
}
