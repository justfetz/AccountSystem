package edu.iit.architectures;


import edu.iit.abstractfactory.AbstractFactory;
import edu.iit.dataStorage.*;
import edu.iit.strategy.*;

//OP class calls the strategies
public class OP {
    DataStore ds;
    AbstractFactory factory;
    //depends on factory to implement a method
    public OP(DataStore ds, AbstractFactory factory) {
        this.ds = ds;
        this.factory = factory;
    }

    //The OP class contains logic for each strategy depending
    //on the type of Account created. The factory is based on the account type.
    //generic because we know what kind of account it is
    /**
     * A1: StoreData() // stores data from temporary area in data store
     * A2: IncorrectIdMsg() // displays incorrect ID message
     * A3: IncorrectPinMsg() // displays incorrect pin message
     * A4: TooManyAttemptsMsg() // display too many attempts message
     * A5: DisplayMenu() // display a menu with a list of transactions
     * A6: MakeDeposit() // makes deposit (increases balance by a value stored in temp_d in data store)
     * A7: DisplayBalance() // displays the current value of the balance
     * A8: PromptForPin() // prompts to enter pin
     * A9: MakeWithdraw() // makes withdraw (decreases balance by a value stored in temp_w data store)
     * A10: Penalty() // applies penalty (decreases balance by the amount of penalty)
     * A11: IncorrectLockMsg() // displays incorrect lock msg
     * A12: IncorrectUnlockMsg() // displays incorrect unlock msg
     * A13: NoFundsMsg() // Displays no sufficient funds msg
     */

    public void IncorrectIdMsg() {
        System.out.println("Incorrect ID Msg");
        IncorrectIDMsg iidm = factory.CreateIncorrectIDMsg();
        iidm.IncorrectIDMsg();
    }

    public void StoreData() {
        System.out.println("Store Data");
        StoreData sd = factory.CreateStoreData();
        sd.StoreData(ds);
    }

    public void IncorrectPinMsg() {
        System.out.println("displays incorrect pin message.");
        IncorrectPinMsg ipm = factory.CreateIncorrectPinMsg();
        ipm.IncorrectPinMsg();
    }

    public void TooManyAttemptsMsg() {
        System.out.println("Too Many Attempts");
        TooManyAttemptsMsg tam = factory.CreateTooManyAttemptsMsg();
        tam.TooManyAttemptsMsg();
    }

    public void DisplayMenu() {
        System.out.println("Displaying Menu");
        DisplayMenu dm = factory.CreateDisplayMenu();
        dm.DisplayMenu();
    }

    public void MakeDeposit() {
        System.out.println("Making Deposit");
        MakeDeposit md = factory.CreateMakeDeposit();
        md.MakeDeposit(ds);
    }

    public void DisplayBalance() {
        System.out.println("Displaying Balance");
        DisplayBalance db = factory.CreateDisplayBalance();
        db.DisplayBalance(ds);
    }

    public void PromptForPin() {
        System.out.println("Prompt for pin");
        PromptForPin pfp = factory.CreatePromptForPin();
        pfp.PromptForPin(ds);
    }

    public void MakeWithdraw() {
        System.out.println("Make Withdraw");
        MakeWithdraw mw = factory.CreateMakeWithdraw();
        mw.MakeWithdraw(ds);
    }

    public void Penalty() {
        System.out.println("Penalty");
        Penalty p = factory.CreatePenalty();
        p.Penalty(ds);
    }

    public void IncorrectLockMsg() {
        System.out.println("Incorrect Lock Message");
        IncorrectLockMsg ilm = factory.CreateIncorrectLockMsg();
        ilm.IncorrectLockMsg();
    }

    public void IncorrectUnlockMsg() {
    System.out.println("Incorrect Unlock Message");
        IncorrectUnlockMsg iulm = factory.CreateIncorrectUnlockMsg();
    iulm.IncorrectUnlockMsg();

    }

    public void NoFundsMsg() {
        System.out.println("No Funds.");
        NoFundsMsg nfm = factory.CreateNoFundsMsg();
        nfm.NoFundsMsg();

    }


}
