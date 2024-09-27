import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int age = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your age ");
        if(in.hasNextInt()) {
            age = in.nextInt();
            in.nextLine();
        }
        if (age >= 21){
            System.out.println("You are 21 or older, and get a wrist band");
        }
    }
}