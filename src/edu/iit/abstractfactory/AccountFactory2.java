package edu.iit.abstractfactory;

import edu.iit.accounts.Account;
import edu.iit.dataStorage.DataStore;
import edu.iit.dataStorage.DataStoreOne;
import edu.iit.dataStorage.DataStoreTwo;
import edu.iit.strategy.*;

public class AccountFactory2 implements AbstractFactory {
    //FIELDS
    DataStoreTwo dataStoreTwo;
    StoreData sd = new StoreDataStrategy_2();
    //PASS DATASTORE CREATED IN MAIN
    public AccountFactory2(DataStoreTwo two) {
        this.dataStoreTwo = two;
    }
    /**
     * CREATE A DATA STORE
     **/
    @Override
    public DataStore CreateDataStore() {
        return new DataStoreTwo();
    }
    public DataStore getDataStore() {
        return dataStoreTwo;
    }

    @Override
    public StoreData CreateStoreData() {
        return new StoreDataStrategy_2();
    }

    /**
     * METHODS, ALL STRATEGIES IN STRATEGY PACKAGE
     **/
    @Override
    public IncorrectIDMsg CreateIncorrectIDMsg() {
        return new IncorrectIDMsgStrategy_2();
    }

    @Override
    public IncorrectPinMsg CreateIncorrectPinMsg() {
        return new IncorrectPinMsgStrategy_2();
    }

    @Override
    public TooManyAttemptsMsg CreateTooManyAttemptsMsg() {
        return new TooManyAttemptsMsgStrategy_2();
    }

    @Override
    public DisplayMenu CreateDisplayMenu() {
        return new DisplayMenuStrategy_2();
    }

    @Override
    public MakeDeposit CreateMakeDeposit() {
        return new MakeDepositStrategy_2();
    }

    @Override
    public DisplayBalance CreateDisplayBalance() {
        return new DisplayBalanceStrategy_2();
    }

    @Override
    public PromptForPin CreatePromptForPin() {
        return new PromptForPinStrategy_2();
    }

    @Override
    public MakeWithdraw CreateMakeWithdraw() {
        return new MakeWithdrawStrategy_2();
    }

    @Override
    public Penalty CreatePenalty() {
        return new PenaltyStrategy_2();
    }

    @Override
    public IncorrectLockMsg CreateIncorrectLockMsg() {
        return new IncorrectLockMsgStrategy_2();
    }

    @Override
    public IncorrectUnlockMsg CreateIncorrectUnlockMsg() {
        return new IncorrectUnlockMsgStrategy_2();
    }

    @Override
    public NoFundsMsg CreateNoFundsMsg() {
        return new NoFundsMsgStrategy_2();
    }
}
