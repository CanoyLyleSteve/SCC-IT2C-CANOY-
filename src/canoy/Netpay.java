
package canoy;

import java.util.Scanner;


public class Netpay {   
    public void getPay(){

         Scanner input = new Scanner(System.in);
        String name;
        int  age ;
        int per;
        int dedu;
        float total;
        float pay;
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter  Age: ");
        age = input.nextInt();
        System.out.print("Enter Rate Per Hour: ");
        per = input.nextInt();
        System.out.print("Enter total hours worked: ");
        total = input.nextInt();
        System.out.print("Enter Deduction:");
        dedu = input.nextInt();

        System.out.println("SLIP DATE ");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.printf("TOTAl Gross:$%.2f",(float)(per*total));
        System.out.println("\nTOTAl Deduction: "+dedu);
        System.out.println("-------------------------------");
        System.out.printf("Net Pay: $ %.2f ",(float)((per*total)-dedu));



    }


}
