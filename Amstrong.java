import java.util.Scanner;

public class Rep {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
       int New=a;
int count=0;
        while(a!=0)
           {

            int m = a % 10;
            a = a / 10;
            count = count + (m * m * m);
           }

        if  ( count== New)
            {

                System.out.println("is an amstrong no.");
            }
        else
            {
                System.out.println("not an amstrong no.");
            }




    }

    This code should be copied to IDE
