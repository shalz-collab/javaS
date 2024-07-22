import java.util.*; 

class UserAuthentication {
    public static void main(String[] args) {

        String username = "shalini";
        String password = "inilahs";

        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter username: ");
        String enteredUsername = sc.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = sc.nextLine();
 
        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Authentication Successful");
        } else {
            System.out.println("Username/Password not matching");
        }

           }
}
