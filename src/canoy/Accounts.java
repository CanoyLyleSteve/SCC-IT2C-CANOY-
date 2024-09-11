package canoy;

public class Accounts {
    private double id;
    private String firstn;
    private String lastn;
    private String email;
    private String usern;
    private String password;


    public void addAccount(double id, String firstName, String lastName, String email, String username, String password) {
        this.id = id;
        this.firstn = firstName;
        this.lastn = lastName;
        this.email = email;
        this.usern = username;
        this.password = password;
    }

    
    public void viewAccount() {
        System.out.printf("%-10.0f %-10s %-10s %-10s %-10s %-10s\n",
                this.id, this.firstn, this.lastn, this.email, this.usern, this.password);
    }
}
