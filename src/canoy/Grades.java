
package canoy;


public class Grades {
    int id;
    String name;
    double p,m,pf,f;
    
    public void addGrades(int pid, String pname, double pp, double pm, double ppf, double ff){
       
    
    this.id = pid;
    this.name = pname;
    this.p = pp;
    this.m = pm;
    this.pf = ppf;
    this.f = ff;
    
            
    }
     public void viewGrades(){
         double ave = (this.p + this.m + this.pf + this.f)/4;
         String remarks = (ave < 3.0) ? "Passed" : "Failed";
         
         
         System.out.printf("%-10d % -10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n", 
                 this.id, this.name, this.p, this.m, this.pf, this.f, ave, remarks );
     }
    
}
