package canoy;

import java.util.Scanner;

public class Grade {
  
    public static void genGrade() {
        Scanner sc = new Scanner(System.in);
        Grades[] gr = new Grades[100];  
        
        String name;
        int num, pid, x;
        double p, m, pf, f;
        
        System.out.print("Enter no. of Students:  ");
        num = sc.nextInt();
        
        for (x = 0; x < num; x++) {
            System.out.println("\nEnter Details of Student " + (x + 1) + ":");
           
            System.out.print("\t ID:  ");
            pid = sc.nextInt();
           
            System.out.print("\t Name: ");
            name = sc.next();
           
            System.out.print("\t Prelims: ");
            p = sc.nextDouble();
           
            System.out.print("\t Midterm: ");
            m = sc.nextDouble();
           
            System.out.print("\t Prefinals: ");
            pf = sc.nextDouble();
           
            System.out.print("\t Final: ");
            f = sc.nextDouble();
           
           
            gr[x] = new Grades();
            gr[x].addGrades(pid, name, p, m, pf, f);
        }
       
       
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", 
                          "ID", "Name", "Prelims", "Midterm", "Prefinals", "Final", "Average", "Remarks");
        for (x = 0; x < num; x++) {
            gr[x].viewGrades();
        }

        sc.close();
    }
    
    public static void main(String[] args) {
        genGrade();  
    }
}

