import java.util.Scanner;
public class calculator_switch {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'Q' in field of operation if you want to exit Calculation");


        double num1,num2, result=0;
        String str1, str2=" ", str3;

        System.out.print("Number: ");
        str1 = sc.next();
        num1 = Double.parseDouble(str1);

        while(str2 != "Q")
        {
            System.out.print("Operation: ");
            str2 = sc.next();

            if(str2.equals("Q"))
            {
                break;
            }

            System.out.print("Number: ");
            str3 = sc.next();
            num2 = Double.parseDouble(str3);

            switch(str2)
            {
                case "+":
                    result = num1 + num2;
                    break;
                
                case "-":
                    result = num1 - num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;
                
                case "/":
                    result = num1 / num2;
                    break;
                
                default:
                    System.out.println("Invalid operation");
                
            }

            num1 = result;
        }
        System.out.println("Result: "+result);


    }
    
}

