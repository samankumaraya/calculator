package calculator_in_java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float num1;
        float num2;



        int select=1111;
        int any =1;

        Scanner input = new Scanner(System.in);
        while (any>0) {
            select=0;
            while (( select<1) || ( select>4)) {
                System.out.println("What calculation Do you want to do ? ");
                System.out.println("Press num 1 for sum ");
                System.out.println("Press num 2 for difference ");
                System.out.println("Press num 3 for divide ");
                System.out.println("Press num 4 for multifly  \n\n select option >>>");
                select=input.nextInt();
            }
            any=0;
            System.out.println("Enter your First number :");
            num1=input.nextInt();

            System.out.println("Enter your Secound number :");
            num2=input.nextInt();

            if ( select==1) {
                System.out.println(" Answer ="+(num1+num2));
            }
            else if ( select==2) {
                System.out.println(" Answer = "+(num1-num2));
            }
            else if ( select==3) {
                System.out.println(" Answer = "+(num1/num2));
            }
            else if ( select==4){
                System.out.println(" Answer = "+(num1*num2));
            }
            else {
                System.out.println("Invalid your input calculation selection");
            }

            System.out.println("if you want to do another calculation ? \n1 to another, 0 to exit :");
            any=input.nextInt();

        }
        System.out.println(" \nThank you For using Good Luck...");
        input.close();
    }
}
