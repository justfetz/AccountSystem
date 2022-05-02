package edu.iit.architectures;

public class Menu {

    //Menu class to add/remove items as needed
    static void MainMenu() {
        System.out.println("Which Account?");
        System.out.println("----------");
        System.out.println("1. ACCOUNT-1");
        System.out.println("2. ACCOUNT-2");
    }

    public static void AccountOneMenu() {
        System.out.println("ACCOUNT-1");
        System.out.println("");
        System.out.println("Operations of the Input Processor");
        System.out.println("----------");
        System.out.println("1. open(int p, int y, int a)");
        System.out.println("2. pin(int x)");
        System.out.println("3. deposit(int d)");
        System.out.println("4. withdraw(int w)");
        System.out.println("5. balance()");
        System.out.println("6. login(int y)");
        System.out.println("7. logout()");
        System.out.println("8. lock(int x)");
        System.out.println("9. unlock(int x)");
        System.out.println("10. Quit the program");
        System.out.println("11. Return to Main Menu.");
    }


    public static void AccountTwoMenu() {
        System.out.println("ACCOUNT-2");
        System.out.println("");
        System.out.println("Operations of the Input Processor");
        System.out.println("----------");
        System.out.println("1. OPEN(int p, int y, float a)");
        System.out.println("2. PIN(int x)");
        System.out.println("3. DEPOSIT(float d)");
        System.out.println("4. WITHDRAW(float w)");
        System.out.println("5. BALANCE()");
        System.out.println("6. LOGIN(int y)");
        System.out.println("7. LOGOUT()");
        System.out.println("8. suspend()");
        System.out.println("9. activate()");
        System.out.println("10. close()");
        System.out.println("11. Main Menu");
    }
}
