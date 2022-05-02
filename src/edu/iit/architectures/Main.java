package edu.iit.architectures;

import edu.iit.abstractfactory.*;
import edu.iit.accounts.*;
import edu.iit.dataStorage.*;
import edu.iit.state.MDA_EFSM;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Program Entry
        Scanner s = new Scanner(System.in);
        Menu.MainMenu();
        int accountSelection = s.nextInt();
        int subSelection;
        while (true) {
            if (accountSelection == 1) {
                //Account 1 operation
                //create AccountFactory
                //Create OP class * MDA_EFSM class
                //Build Account

                //references ops for Account 1
                DataStoreOne one = new DataStoreOne();
                //CAN ALSO CREATE FACTORY IN THE ACCOUNT IF NEEDED
                AccountFactory1 af = new AccountFactory1(one);
                OP p = new OP(one, af);
                MDA_EFSM m = new MDA_EFSM(p, af);
                AccountOne a = new AccountOne(m, one);
                Menu.AccountOneMenu();
                //MENU FOR ACCOUNT 1
                subSelection = s.nextInt();
                switch (subSelection) {
                    //open an account
                    case 1:
                        System.out.println("Enter p param");
                        int pParam = s.nextInt();
                        System.out.println("Enter y param");
                        int yParam = s.nextInt();
                        System.out.println("Enter a param");
                        int aParam = s.nextInt();
                        a.open(pParam, yParam, aParam);
                        System.out.println(one.getId());
                        System.out.println(one.temp_y);
                        break;
                    //pin operation
                    case 2:
                        System.out.println("Enter x param");
                        int xParam = s.nextInt();
                        a.pin(xParam);
                        break;

                    //deposit operation
                    case 3:
                        System.out.println("Enter d param");
                        int d = s.nextInt();

                        a.deposit(d);
                        break;
                        //withdraw operation
                    case 4:
                        System.out.println("Enter w param");
                        int w = s.nextInt();

                        a.withdraw(w);
                        break;

                    //balance
                    case 5:
                        System.out.println("balance()");
                        a.balance();
                        break;

                    //login
                    case 6:
                        System.out.println("Enter y param");
                        int y = s.nextInt();
                        a.login(y);
                        break;

                    //logout
                    case 7:
                        System.out.println("logout()");
                        a.logout();
                        break;

                    //lock operation
                    case 8:
                        System.out.println("Enter x (lock) param");
                        int x = s.nextInt();
                        a.lock(x);
                        break;

                    //unlock account
                    case 9:
                        System.out.println("Enter x (unlock) param");
                        int x2 = s.nextInt();
                        a.unlock(x2);

                        break;

                    //Exit Program
                    case 10:
                        System.out.println("Goodbye.");
                        System.exit(0);
                        //Main Menu Exits
                    case 11:
                        Menu.MainMenu();
                        break;
                    default:
                        Menu.MainMenu();
                        break;
                }
                //Account 2 selection
            } else if (accountSelection == 2) {
                DataStoreTwo two = new DataStoreTwo();
                AccountFactory2 af = new AccountFactory2(two);

                OP p = new OP(two, af);
                MDA_EFSM m = new MDA_EFSM(p, af);
                AccountTwo b = new AccountTwo(m, two);
                Menu.AccountTwoMenu();
                int subSelection2 = s.nextInt();
                switch (subSelection2) {
                    //open an account
                    case 1:
                        System.out.println("Enter p param");
                        int pParam = s.nextInt();
                        System.out.println("Enter y param");
                        int yParam = s.nextInt();
                        System.out.println("Enter a param");
                        float aParam = s.nextInt();
                        b.OPEN(pParam, yParam, aParam);
                        break;

                    //pin operation
                    case 2:
                        System.out.println("PIN-Enter x param");
                        int xParam = s.nextInt();
                        b.PIN(xParam);

                        break;

                    //deposit operation
                    case 3:
                        System.out.println("DEPOSIT-Enter d param");
                        float d = s.nextFloat();
                        //Menu.AccountOneMenu();
                        b.DEPOSIT(d);


                        //withdraw operation
                    case 4:
                        System.out.println("WITHDRAW-Enter w param");
                        float w = s.nextFloat();
                        b.WITHDRAW(w);
                        break;

                    //balance operation
                    case 5:
                        System.out.println("BALANCE");
                        b.BALANCE();
                        break;

                    //LOGIN operation
                    case 6:
                        System.out.println("LOGIN-Enter y param");
                        int y = s.nextInt();
                        b.LOGIN(y);

                        break;

                    //LOGOUT operation
                    case 7:
                        System.out.println("LOGOUT");
                        b.LOGOUT();
                        //Menu.AccountOneMenu();
                        break;

                    //suspend operation
                    case 8:
                        System.out.println("suspend");
                        b.suspend();
                        break;

                    //activate operation
                    case 9:
                        System.out.println("activate");
                        b.activate();

                        break;

                    //Exit Program
                    case 10:
                        System.out.println("Goodbye.");
                        System.exit(0);

                        //Main Menu Exits
                    case 11:
                        Menu.MainMenu();
                        break;
                    default:
                        Menu.MainMenu();
                        break;
                }
            } else {
                Menu.MainMenu();
            }
        }

    }
}
