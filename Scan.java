import java.util.Scanner;
public class Scan{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a text here: ");
        String x = sc.nextLine();

        System.out.println("You have typed : "+x);
    }
}