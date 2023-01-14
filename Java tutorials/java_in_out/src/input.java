import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("What is your name?");
        String name=scan.nextLine();
       // System.out.println("your name is: "+name);
        System.out.println("How old are you?");
        int age=scan.nextInt();
        System.out.println(" Thank you your Name is "+name+" and "+age+" years old!");

    }
}
