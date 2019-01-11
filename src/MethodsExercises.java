import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        rollDice(getInteger(1, 10), scan);

        factorial(getInteger(1, 10));

        getInteger(1, 10);

      int sumResult = addition(2, 3);
        subtraction(5, 4);
        multiplication(3, 4);
        division(6, 2);
        modulus(3, 1);
    }


//---------------------------------------------------ADDITION---------------------------------------------------------//


    public static int addition(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b){
        return a + b;
    }

    public static long add(long a, long b){
        return a + b;
    }


//-------------------------------------------------SUBTRACTION--------------------------------------------------------//


    public static int subtraction(int a, int b) {
        return a - b;
    }


//-----------------------------------------------MULTIPLICATION-------------------------------------------------------//


    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double multiple(double a, double b){
        return a * b;
    }


                               //----------WITHOUT TIMES MULTIPLIER----------//


    public static long multiply(long a, long b) {
        if(a == 0 || b == 0) {
            return 0;
        }

        long product = 0;

        if(b > 1) {
            do {
                product += a;
                b--;

            } while(b >= 1);
        } else {
            do {
                product -= a;
                b++;

            } while(b <= -1);
        }

        return product;
    }


//-------------------------------------------------DIVISION-----------------------------------------------------------//


    public static int division(int a, int b) {
        return a / b;
    }

    public static double divide (int numerator, int denominator){
        return numerator / denominator;
    }


//-------------------------------------------------MODULUS------------------------------------------------------------//


    public static int modulus(int a, int b) {
        return a % b;
    }


//-----------------------------------------------GET INTEGER----------------------------------------------------------//


    public static int getInteger(int min, int max) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " and " + max);
        int userInt = scan.nextInt();
        scan.nextLine();

        if (userInt < min || userInt > max) {
           System.out.println("Outside of range");
           getInteger(min, max);
        } else {
            System.out.println("Within range");
            return userInt;
        }
            return 0;
     }


//------------------------------------------------FACTORIAL-----------------------------------------------------------//


    public static void factorial(int number) {

        int acum = 1;
            String details = " ";
        for (int i = 1; i <= number; i++) {
            details += (i == 1) ? i : " x " + i;
            System.out.println(i + "! = " + details + " = " + ( acum *= i ) );
        }
    }


//------------------------------------------------DICE ROLL-----------------------------------------------------------//


    public static void rollDice(int sides, Scanner input) {

        System.out.println("Type roll to start");
        String usersInput = input.nextLine();

        if (usersInput.trim().equalsIgnoreCase("roll")){
            int dice1 = 1 + (int)(Math.random() * ((sides -1) +1));
            int dice2 = 1 + (int)(Math.random() * ((sides -1) +1));

            System.out.println(dice1 + " " + dice2);

            }
                while (true) {

        }
    }
}