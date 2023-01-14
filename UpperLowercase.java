 import java.util.Scanner;

public class Rep {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        char c= sc.next().trim().charAt(0);

        if(c>='A' && c<='Z'){
            System.out.println("Uppercase");


        }
        else {
            System.out.println("Lowercase");

        }


    }

