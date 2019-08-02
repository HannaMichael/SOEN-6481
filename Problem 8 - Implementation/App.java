import java.lang.management.GarbageCollectorMXBean;
import java.util.Scanner;

public class App {

    static float firstNumber=0;
    static float secondNumber=0;
    static float result;
    static Originator originator = new Originator();
    static boolean resultFlag=false;
    CareTaker careTaker = new CareTaker();

    public static void main(String[] args)
    {
        while(true) {
            System.out.println("(1) Add");
            System.out.println("(2) Subtract");
            System.out.println("(3) Multiply");
            System.out.println("(4) Divide");
            System.out.println("(5) Get Plastic Number");
            System.out.println("(6) Calculate circumradius of Snub Icosidodecadodecahedron");
            System.out.println("(7) Get Saved Result");
            System.out.println("(8) Exit");
            System.out.print("\nPlease select an operation : ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            int operationNumber = Integer.parseInt(input);

            if (operationNumber == 1) {
                EnterNumbers();
                result=Sum(firstNumber, secondNumber);
                System.out.print(firstNumber + " + " + secondNumber + " is " + result);
                System.out.println();
                SaveResults(result);
                System.out.println();

            }

            if (operationNumber == 2) {
                EnterNumbers();
                result=Difference(firstNumber, secondNumber);
                System.out.print(firstNumber + " - " + secondNumber + " is " + result);
                System.out.println();
                SaveResults(result);
                System.out.println();
            }

            if (operationNumber == 3) {
                EnterNumbers();
                result = MultiplyNumebers(firstNumber, secondNumber);
                System.out.print("The summation of " + firstNumber + " * " + secondNumber + " is " + result);
                System.out.println();
                SaveResults(result);
                System.out.println();
            }

            if (operationNumber == 4) {
                EnterNumbers();
                result=DivideNumbers(firstNumber, secondNumber);
                System.out.print("The summation of " + firstNumber + " / " + secondNumber + " is " + result);
                System.out.println();
                SaveResults(result);
                System.out.println();
            }

            if (operationNumber == 5) {

                System.out.print("The Plastic Number is " + GetPlasticNumber());
                System.out.println();
                SaveResults(result);
                System.out.println();
            }

            if (operationNumber == 6) {
                System.out.print("The circumradius of Snub Icosidodecadodecahedron is " + GetCircumradius());
                System.out.println();
                SaveResults(result);
                System.out.println();
            }

            if (operationNumber == 7) {
                if(resultFlag)
                System.out.println("Saved Results = " + GetSavedResults());
                else
                    System.out.println("No result has been saved");

            }

            if (operationNumber == 8) {
                System.exit(0);
            }
        }
    }


    public static void SaveResults(float result)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want to save the result (Y/N): ");
        String input = sc.nextLine();
        boolean flag=true;
        while(flag) {
            if (input.equals("Y")) {
                originator.setState(result);
                System.out.println("Saved");
                flag=false;
                resultFlag=true;
            } else if (input.equals("N")) {
                flag=false;

            } else {
                System.out.print("Please select a valid character: (Y/N): ");
                input = sc.nextLine();

            }
        }
    }

    public static float GetSavedResults()
    {

            return originator.getState();

    }


    public static double power (double base, double power)
    {
        double number = base;
        for(double i=0; i < (power-1);i++){
            number = number * base;
        }
        return number;
    }

    public static double GetCircumradius() {

        double x;
        x= 2*GetPlasticNumber();
        x=x-1;
        x=x/(GetPlasticNumber()-1);
        x=sqrt((float)x);
        x=x/2;
        return x;
    }

    public static double GetPlasticNumber() {
        return CubeRoot((9+sqrt(69))/18) + CubeRoot((9-sqrt(69))/18);
    }

    public static double CubeRoot(double A) {
        return CubeRoot( A, .001);
    }

    public static double CubeRoot( double base, double power) {
        if(base < 0) {
            return -1;
        } else if(base == 0) {
            return 0;
        }
        double prev = base;
        double x = base / 3;
        while(x - prev > power || prev - x > power) {
            prev = x;
            x = ((3 - 1.0) * x + base / power(x, 3 - 1.0)) / 3;
        }
        return x;
    }

    public static float DivideNumbers(float firstNumber, float secondNumber) {
        return firstNumber/secondNumber;
    }

    public static float MultiplyNumebers(float firstNumber, float secondNumber) {
        return firstNumber*secondNumber;
    }

    public static float Difference(float firstNumber, float secondNumber) {
        return firstNumber-secondNumber;
    }

    public static float Sum(float firstNumber, float secondNumber) {
        return firstNumber+secondNumber;
    }

    public static float sqrt(float number) {
        float temp;
        float squareRoot = number / 2;
        do {
            temp = squareRoot;
            squareRoot = (temp + (number / temp)) / 2;
        } while ((temp - squareRoot) != 0);
        return squareRoot;
    }

    public static void EnterNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter First Number : ");
        String input = sc.nextLine();
        firstNumber = Float.parseFloat(input);
        System.out.print("Please Enter Second Number : ");
        input = sc.nextLine();
        secondNumber = Float.parseFloat(input);
    }
}
