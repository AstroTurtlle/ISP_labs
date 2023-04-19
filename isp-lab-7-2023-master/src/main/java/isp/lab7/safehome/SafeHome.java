package isp.lab7.safehome;

import java.util.Objects;
import java.util.Scanner;

import static isp.lab7.safehome.ControllerInterface.MASTER_KEY;

public class SafeHome {
    private static final String menu = "Select your user type:\n" +
            "   1. Tenant\n" +
            "   2. Admin\n" +
            "   0. Exit menu";
    private static final String pinMenu = "Please enter your pin: ";
    private static final String adminMenu = "Choose between the following:\n" +
            "   1. Add tenant\n" +
            "   2. Remove tenant\n" +
            "   3. View access logs\n" +
            "   0. Exit menu";
    public static void main(String[] args) {
        DoorLockController ctrl = new DoorLockController();
        Scanner scan = new Scanner(System.in);
        int myint = 1;
        String pin;
        while(myint != 0) {
            System.out.println(menu);
            myint = scan.nextInt();
            if (myint == 1) {
                System.out.print(pinMenu);
                pin = scan.next();
                try {
                    System.out.println("Your door is " + ctrl.enterPin(pin));
                } catch (InvalidPinException e) {
                    System.out.println("The pin you've entered is invalid.");
                } catch (Exception e) {
                    System.out.println("You've entered too many invalid attempts.");
                }
            }
            else if (myint == 2) {
                System.out.print(pinMenu);
                pin = scan.next();
                if(Objects.equals(pin, MASTER_KEY)) {
                    String name;
                    System.out.println(adminMenu);
                    int admin_int = scan.nextInt();
                    if (admin_int == 1) {
                        System.out.print("Please enter the new Tenant's name: ");
                        name = scan.next();
                        System.out.print("Please enter the new Tenant's pin: ");
                        String new_pin = scan.next();
                        try {
                            ctrl.addTenant(new_pin, name);
                            System.out.println("You have successfully added a new tenant.");
                        } catch (Exception e) {
                            System.out.println("Already existing tenant.");
                        }
                    }
                    else if (admin_int == 2) {
                        System.out.print("Please enter the name of the tenant you'd like to remove: ");
                        name = scan.next();
                        try {
                            ctrl.removeTenant(name);
                            System.out.println("You have successfully removed a tenant.");
                        } catch (Exception e) {
                            System.out.println("The tenant you've entered is not registered.");
                        }
                    }
                    else if (admin_int == 3) {
                        System.out.println(ctrl.getAccessLogs().toString());
                    }
                    else if (admin_int == 0) break;
                    else System.out.println("Invalid command.");
                }
                else System.out.println("Incorrect Admin pin.");
            }
            else if (myint == 0) break;
            else System.out.println("Invalid command.");
        }
    }
}
