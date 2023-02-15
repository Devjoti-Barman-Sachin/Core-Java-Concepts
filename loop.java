import java.util.Scanner;
public class loop {
    public static void main(String args[])
    {
        System.out.print("Enter patern line number:");

        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int d=w, f=w;
        

        //While loop
        while(w!=0)
        {
            int p=0;

            while(p<w)
            {
                System.out.print("* ");
                p++;
            }
            System.out.println();
            w--;
        }

        //do while
        do
        {
            int p=0;

            do
            {
                System.out.print("* ");
                p++;
            }
            while(p<d);

            System.out.println();
            d--;
        }
        while(d!=0);


        //for loop
        for( ; f!=0; f--)
        {
            for(int p=0; p<f; p++)
            {
                System.out.print("* ");
            }
            
            System.out.println();
        }



    }
    
}
