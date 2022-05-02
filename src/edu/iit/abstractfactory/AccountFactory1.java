package edu.iit.abstractfactory;

import edu.iit.dataStorage.*;

import edu.iit.strategy.*;

public class AccountFactory1 implements AbstractFactory {

    /**STRATEGY ONE FIELDS/methods**/

    DataStore dataStoreOne;
    StoreData sd = new StoreDataStrategy_1();
    //pass the datastore created from the Menu
    public AccountFactory1(DataStore one) {
        this.dataStoreOne = one;
    }

    /*
    FACTORY METHODS CAN ALL RETURN NEW CLASSES
    */

    /**
     * CREATE A DATA STORE
     **/

    //Will invoke relevant Strategy
    @Override
    public DataStore CreateDataStore() {
        return new DataStoreOne();
    }

    //Return the data store
    public DataStore getDataStore() {
        return dataStoreOne;
    }
    //store the data
    @Override
    public StoreData CreateStoreData() {
        return sd;
    }

    //return new strategies for corresponding methods
    //account strategies are defined in the strategy package
    @Override
    public IncorrectIDMsg CreateIncorrectIDMsg() {
        return new IncorrectIDMsgStrategy_1();
    }

    @Override
    public IncorrectPinMsg CreateIncorrectPinMsg() {
        //return ipm;
        return new IncorrectPinMsgStrategy_1();
    }

    @Override
    public DisplayMenu CreateDisplayMenu() {
        //return menu;
        return new DisplayMenuStrategy_1();
    }

    @Override
    public MakeDeposit CreateMakeDeposit() {
        //return md;
        return new MakeDepositStrategy_1();
    }

    @Override
    public DisplayBalance CreateDisplayBalance() {
        //return db;
        System.out.println("You reached the Display Balance strategy.");
        return new DisplayBalanceStrategy_1();

    }

    @Override
    public PromptForPin CreatePromptForPin() {
        //return pfp;
        return new PromptForPinStrategy_1();
    }

    @Override
    public MakeWithdraw CreateMakeWithdraw() {
        //return mw;
        return new MakeWithdrawStrategy_1();
    }

    @Override
    public Penalty CreatePenalty() {
        //return penalty;
        return new PenaltyStrategy_1();
    }

    @Override
    public IncorrectLockMsg CreateIncorrectLockMsg() {
        //return ilm;
        return new IncorrectLockMsgStrategy_1();
    }

    @Override
    public IncorrectUnlockMsg CreateIncorrectUnlockMsg() {
        //return iulm;
        return new IncorrectUnlockMsgStrategy_1();
    }

    @Override
    public NoFundsMsg CreateNoFundsMsg() {
        //return nfm;
        return new NoFundsMsgStrategy_1();
    }

    @Override
    public TooManyAttemptsMsg CreateTooManyAttemptsMsg() {
        //return tmam;
        return new TooManyAttemptsMsgStrategy_1();
    }
}
