package ex_21_Encapsulation;

public class Lab_152_Ecap_Demo {
    public static void main(String[] args) {

        // ❌ Bad encapsulation class
        VWOLogin vwoLogin = new VWOLogin("admin", "pass123");
        System.out.println(vwoLogin.password);   // Direct access (NOT SAFE)

        vwoLogin.password = "345";               // Direct modification (NOT SAFE)
        System.out.println(vwoLogin.password);


        // ✅ Good encapsulation class
        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("admin", "pwd123");
        System.out.println(vwoLogin1.getPassword()); // SAFE Access

        // vwoLogin1.setPassword("newPwd"); // If setter was available
        // System.out.println(vwoLogin1.getPassword());
    }
}

// ❌ Without Encapsulation (Bad Practice)
class VWOLogin {
    public String username;
    public String password;

    public VWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

// ✅ With Encapsulation (Good Practice)
class GoodVWOLogin {

    private String username;  // HIDDEN (Not directly accessible)
    private String password;  // HIDDEN

    // Constructor
    GoodVWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter (optional)
    // public void setPassword(String password) {
    //     this.password = password;
    // }
}
