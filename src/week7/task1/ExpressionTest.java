package week7.task1;

public class ExpressionTest {
    public static void main(String args[]){
        try{
            int E1 = new Square(10).evaluate();
            int E2 = new Numeral(1).evaluate();
            int E3 = new Multiplication(2,3).evaluate();
            int result1 = new Substraction(E1,E2).evaluate();
            int result2 = new Addition(result1,E3).evaluate();
            int result3 = new Square(result2).evaluate();
            System.out.println("result = " + result3);
            int E5 = new Division(5,0).evaluate();

        }
        catch(ArithmeticException eA){
            System.out.println("error: " + eA.toString());
        }
    }
}
