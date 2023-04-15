package isp.lab6.exercise3;

import java.util.Scanner;

public class UserInterface {
    private final LoginSystem loginSyst = new LoginSystem();
    private final OnlineStore store = new OnlineStore();
    public void loadInterface() {
        String login_menu = "What would you like to do:\n" +
                "   1.register\n" +
                "   2.login\n" +
                "   3.logout\n" +
                "   0.close menu";
        while(true) {
            System.out.println(login_menu);
            Scanner input = new Scanner(System.in);
            int myint = input.nextInt();
            if (myint == 1) {
                input.nextLine();
                System.out.print("Enter your username: ");
                String username = input.nextLine();
                System.out.print("Enter your password: ");
                String password = input.nextLine();
                loginSyst.register(username, password);
                for (User i : loginSyst.getUsers()) {
                    System.out.println(i.hashCode());
                }
                //System.out.println(loginSyst.getUsers());
            } else if (myint == 2) {
                input.nextLine();
                System.out.print("Enter your username: ");
                String username = input.nextLine();
                System.out.print("Enter your password: ");
                String password = input.nextLine();
                if (loginSyst.login(username, password)) System.out.println("You have succesfully logged in.");
                else System.out.println("Unsuccessful login attempt.");
            } else if (myint == 3) {
                input.nextLine();
                System.out.print("Enter your username: ");
                String username = input.nextLine();
                if(loginSyst.getStore().getSessions().containsKey(username)) {
                    loginSyst.logout(username);
                    System.out.println("User logged out succesfully.");
                }
                else System.out.println("User isn't active.");
            } else if (myint == 0)
                break;
              else System.out.println("Invalid input.\n");
        }
    }
}
