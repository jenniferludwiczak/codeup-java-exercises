import java.util.Scanner;

public class JavaMethodsPractice {
    public static void main(String args[]) {

        System.out.println(firstChar("Hello World!"));
        System.out.println(secondChar("Hello World!"));
        System.out.println(lastChar("Hello World!"));
        System.out.println(secondToLastChar("Hello World!"));
        System.out.println(userWantsToContinue());
        String input = "Thursday";
        System.out.println();
//        System.out.println(isEven());
//        System.out.println(isOdd());
//        System.out.println(countOdds());
//        System.out.println(countEvens());
//        System.out.println(isVowel());
//        System.out.println(hasVowels());
//        System.out.println(countVowels());
    }


//--------------------------Write a method named firstChar() that takes a string as an--------------------------------//
//-------------------------input and returns the first letter as a character data type--------------------------------//


    public static char firstChar (String input) {
        return input.charAt(0);
    }


//-------------------------Write a method named secondChar() that takes a string as an--------------------------------//
//-------------------------input and returns the second letter as a character data type-------------------------------//


    public static char secondChar (String input) {
        return input.charAt(1);
    }


//---------------------------Write a method named lastChar() that takes a string as an--------------------------------//
//---------------------------input and returns the last letter as a character data type-------------------------------//


    public static char lastChar (String input) {
        return input.charAt(input.length()-1);
    }


//------------------------Write a method named secondToLastChar() that takes a string as an---------------------------//
//-------------------------input and returns the second to letter as a character data type----------------------------//


    public static char secondToLastChar (String input) {
        return input.charAt(input.length()-2);
    }


//---------------Write a method named userWantsToContinue(). This method should prompt the user if they---------------//
//------------------want to continue and then return a boolean value if the user inputs "y" or "yes"------------------//


    public static boolean userWantsToContinue(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Would you like to continue? [Y/N]");
        String userInput = sc.next();
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")){
            return true;
        } return false;
    }


//---------------------------------Write a method named isEven() that takes in an-------------------------------------//
//----------------------------integer and returns a boolean if the input is even or not-------------------------------//


    public static boolean isEven (int input){
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
        if (input % 2 == 0){
            return true;
        } return false;
    }


//----------------------------------Write a method named isOdd() that takes in an-------------------------------------//
//-----------------------------integer and returns a boolean if the input is odd or not-------------------------------//


    public static boolean isOdd (int input){
        if (input % 2 != 0){
            return true;
        } return false;
    }


//--------------Write a method named countOdds(start, end) that returns an integer containing the integer-------------//
//------------------that is the count of all odd numbers between the start and the end input integers-----------------//


    public static int countOdds(int start, int end){
        int oddNumbers = 0;
        for(int i = start; i <= end; i++){
            if(i %2 == 1){
                oddNumbers++;
            }
        }
        return oddNumbers;
    }


//---------Write a method named countEvens(start, end) that returns an integer containing the integer that is---------//
//---------------------the count of all even numbers between the start and the end input integers---------------------//


    public static int countEvens(int start, int end) {
        int evenNumbers = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenNumbers++;
            }
        }
        return evenNumbers;
    }


//---------------------------Write a method named isVowel() that accepts a String input of----------------------------//
//----------------------length 1 and returns a boolean if that string is a vowel other than "y"-----------------------//


    public static boolean isVowel(String input) {
        if(input.length() > 1) {
            return false;
        }

        return input.equalsIgnoreCase("a") ||
                input.equalsIgnoreCase("e") ||
                input.equalsIgnoreCase("i") ||
                input.equalsIgnoreCase("o") ||
                input.equalsIgnoreCase("u");
    }


//----------------------------Write a method named hasVowels() that accepts a string of any---------------------------//
//-------------------------length and returns a boolean if there are any vowels in that string------------------------//


    public static boolean hasVowels(String input) {
        String letter = "";

        for(int i = 0; i < input.length(); i++) {

            letter = input.charAt(i) + "";
            if(isVowel(letter)) {
                return true;
            }
        }

        return false;
    }


//----------------------Write a method named countVowels() that accepts a string of any length and--------------------//
//--------------------returns an integer count of the number of vowels in the provided input String-------------------//


    public static int countVowels(String input) {
        int count = 0;
        String letter = "";
        for(int i = 0; i < input.length(); i++) {
            letter = input.charAt(i) + "";
            if(isVowel(letter)) {
                count++;
            }
        }
        return count;
    }


//----------------------------Write a solution to FizzBuzz using recursion instead of a loop--------------------------//


    public String fizzBuzz(int n){
        String s = "";
        if (n == 0)
            return s;
        if((n % 5) == 0)
            s = "Buzz" + s;
        if((n % 3) == 0)
            s = "Fizz" + s;
        if (s.equals(""))
            s = n + "";
        return fizzBuzz(n-1) +  s;
    }


//-------------------Write a method named isPrime() that that accepts in an integer number and returns----------------//
//-------------------a boolean if the number is evenly divisible only by either 1 or the number itself----------------//





//-Write a method named getTwentyPrimes() that returns a string containing the first 20 prime numbers, each separated-//
//---by a comma. Output: "1, 2, 3, 5, 7, 11, 13, 17, 19"... until we have a total count of 20 primes in the string----//




}