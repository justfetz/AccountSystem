package edu.iit.strategy;

import edu.iit.dataStorage.DataStore;
import edu.iit.dataStorage.DataStoreOne;

public class MakeDepositStrategy_1 implements MakeDeposit{

    @Override
    public void MakeDeposit(DataStore ds) {
        ((DataStoreOne)ds).deposit(((DataStoreOne) ds).temp_d);
    }
}
