package edu.iit.strategy;

import edu.iit.dataStorage.*;
;

public class MakeDepositStrategy_2 implements MakeDeposit {

    @Override
    public void MakeDeposit(DataStore ds) {
        ((DataStoreTwo)ds).deposit(((DataStoreTwo) ds).getTemp_d());
    }
}
