import java.util.InputMismatchException;
import java.util.Scanner;

public class excception {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the first number?");
            int num1 = scan.nextInt();

            System.out.println("Enter the second number?");
            int num2 = scan.nextInt();
            System.out.println(num1 / num2);
        }catch (ArithmeticException e){
            System.out.println("You cant divide by zero!");
    }
        catch (InputMismatchException e){
            System.out.println("Please enter only numbers!");
        }
}}
