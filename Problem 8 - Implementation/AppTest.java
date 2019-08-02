import static org.junit.Assert.*;

public class AppTest {


    @org.junit.Test
    public void power() {
        double num1=2;
        double num2=3;
        double result = App.power(num1,num2);
        assertEquals(8,result,0.01);
    }

    @org.junit.Test
    public void cubeRoot() {
        double num1=8;
        double result = App.CubeRoot(num1);
        assertEquals(2,result,0.01);
    }

    @org.junit.Test
    public void sqrt() {
        float num1=4;
        float result = App.sqrt(num1);
        assertEquals(2,result,.0);
    }

    @org.junit.Test
    public void TestSum()
    {
        float num1=2;
        float num2=3;
        float result = App.Sum(num1,num2);
        assertEquals(5,result,.0);
    }
    @org.junit.Test
    public void TestSub()
    {
        float num1=3;
        float num2=2;
        float result = App.Difference(num1,num2);
        assertEquals(1,result,.0);
    }
    @org.junit.Test
    public void TestDivide()
    {
        float num1=6;
        float num2=2;
        float result = App.DivideNumbers(num1,num2);
        assertEquals(3,result,.0);
    }
    @org.junit.Test
    public void TestMultiply()
    {
        float num1=5;
        float num2=2;
        float result = App.MultiplyNumebers(num1,num2);
        assertEquals(10,result,.0);
    }

    @org.junit.Test
    public void TestGetPlasticNumber()
    {
        double result = App.GetPlasticNumber();
        assertEquals(1.32471795724474602596,result,0.000001);
    }

    @org.junit.Test
    public void TestGGetCircumradius()
    {
        double result = App.GetCircumradius();
        assertEquals(1.12689791279994,result,0.000001);
    }


}