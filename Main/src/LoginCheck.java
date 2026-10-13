public class LoginCheck {
    String username = "Makwarela1";
    String password = "MondayEat";

    void checkCredentials() {
        if (username.equals("Makwarela1") && password.equals("MondayEat")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid credentials");
        }
    }
}
