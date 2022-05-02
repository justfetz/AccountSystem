package edu.iit.abstractfactory;

import edu.iit.dataStorage.*;
import edu.iit.strategy.*;

public interface AbstractFactory {

    //All of the Actions are Strategies between Accounts
    /*
    MDA-EFSM Actions:
    A1: StoreData() // stores data from temporary area in data store
    A2: IncorrectIdMsg() // displays incorrect ID message
    A3: IncorrectPinMsg() // displays incorrect pin message
    A4: TooManyAttemptsMsg() // display too many attempts message
    A5: DisplayMenu() // display a menu with a list of transactions
    A6: MakeDeposit() // makes deposit (increases balance by a value stored in temp_d in data store)
    A7: DisplayBalance() // displays the current value of the balance
    A8: PromptForPin() // prompts to enter pin
    A9: MakeWithdraw() // makes withdraw (decreases balance by a value stored in temp_w data store)
    A10: Penalty() // applies penalty (decreases balance by the amount of penalty)
    A11: IncorrectLock Msg() // displays incorrect lock msg
    A12: IncorrectUnlock Msg() // displays incorrect unlock msg
    A13: NoFundsMsg() // Displays no sufficient funds msg
    */

    /**CREATE A DATA STORE**/
    DataStore CreateDataStore();
    StoreData CreateStoreData();

    /**STRATEGIES**/

    /**FROM THE BLACKBOARD MDA-EFSM Actions Section Spring 2022**/

    /**EVENTS**/
    DisplayBalance CreateDisplayBalance();
    PromptForPin CreatePromptForPin();
    MakeWithdraw CreateMakeWithdraw();
    Penalty CreatePenalty();
    DisplayMenu CreateDisplayMenu();
    MakeDeposit CreateMakeDeposit();

    /**MESSAGES**/
    IncorrectLockMsg CreateIncorrectLockMsg();
    IncorrectUnlockMsg CreateIncorrectUnlockMsg();
    NoFundsMsg CreateNoFundsMsg();
    IncorrectIDMsg CreateIncorrectIDMsg();
    IncorrectPinMsg CreateIncorrectPinMsg();
    TooManyAttemptsMsg CreateTooManyAttemptsMsg();

}


