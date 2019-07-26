import java.lang.management.GarbageCollectorMXBean;
import java.util.Scanner;

public class App {

    static float firstNumber=0;
    static float secondNumber=0;

    public static void main(String[] args)
    {

        while(true) {
            System.out.println("(1) Add");
            System.out.println("(2) Subtract");
            System.out.println("(3) Multiply");
            System.out.println("(4) Divide");
            System.out.println("(5) Get Plastic Number");
            System.out.println("(6) Calculate circumradius of Snub Icosidodecadodecahedron");
            System.out.println("(7) Exit");
            System.out.print("\nPlease select1 an operation : ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            int operationNumber = Integer.parseInt(input);

            if (operationNumber == 1) {
                EnterNumbers();
                System.out.print("The summation of " + firstNumber + " + " + secondNumber + " is " + Sum(firstNumber, secondNumber));
                System.out.println();
                System.out.println();
            }

            if (operationNumber == 2) {
                EnterNumbers();
                System.out.print("The summation of " + firstNumber + " - " + secondNumber + " is " + Difference(firstNumber, secondNumber));
                System.out.println();
                System.out.println();
            }

            if (operationNumber == 3) {
                EnterNumbers();
                System.out.print("The summation of " + firstNumber + " * " + secondNumber + " is " + MultiplyNumebers(firstNumber, secondNumber));
                System.out.println();
                System.out.println();
            }

            if (operationNumber == 4) {
                EnterNumbers();
                System.out.print("The summation of " + firstNumber + " / " + secondNumber + " is " + DivideNumbers(firstNumber, secondNumber));
                System.out.println();
                System.out.println();
            }

            if (operationNumber == 5) {

                System.out.print("The Plastic Number is " + GetPlasticNumber());
                System.out.println();
                System.out.println();
            }

            if (operationNumber == 6) {
                System.out.print("The circumradius of Snub Icosidodecadodecahedron is " + GetCircumradius());
                System.out.println();
                System.out.println();
            }

            if (operationNumber == 7) {
                System.exit(0);
            }
        }
    }

    static double power (double num1, double num2)
    {
        double number   = num1;
        double i=0;
        for(i=0; i < (num2-1);i++){
            number = number * num1;
        }
        return (number);
    }



    private static double GetCircumradius() {

        double x;
        x= 2*GetPlasticNumber();
        x=x-1;
        x=x/(GetPlasticNumber()-1);
        x=sqrt((float)x);
        x=x/2;
        return x;
    }

    private static double GetPlasticNumber() {
        return nthroot(3,(9+sqrt(69))/18) + nthroot(3,(9-sqrt(69))/18);
    }

    public static double nthroot(int n, double A) {
        return nthroot(n, A, .001);
    }

    public static double nthroot(int n, double A, double p) {
        if(A < 0) {
            System.err.println("A < 0");// we handle only real positive numbers
            return -1;
        } else if(A == 0) {
            return 0;
        }

        double x_prev = A;
        double x = A / n;  // starting "guessed" value...
        while(x - x_prev > p || x_prev - x > p) {
            x_prev = x;
            x = ((n - 1.0) * x + A / power(x, n - 1.0)) / n;
        }
        return x;
    }

    private static float DivideNumbers(float firstNumber, float secondNumber) {
        return firstNumber/secondNumber;
    }

    private static float MultiplyNumebers(float firstNumber, float secondNumber) {
        return firstNumber*secondNumber;
    }

    private static float Difference(float firstNumber, float secondNumber) {
        return firstNumber-secondNumber;
    }

    private static float Sum(float firstNumber, float secondNumber) {
        return firstNumber+secondNumber;
    }

    public static float sqrt(float number) {
        float t;
        float squareRoot = number / 2;
        do {
            t = squareRoot;
            squareRoot = (t + (number / t)) / 2;
        } while ((t - squareRoot) != 0);
        return squareRoot;
    }

    private static void EnterNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter First Number : ");
        String input = sc.nextLine();
        firstNumber = Float.parseFloat(input);
        System.out.print("Please Enter Second Number : ");
        input = sc.nextLine();
        secondNumber = Float.parseFloat(input);
    }
}
