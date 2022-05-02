package edu.iit.strategy;

import edu.iit.dataStorage.DataStore;

public class PromptForPinStrategy_2 implements  PromptForPin {

    @Override
    public void PromptForPin(DataStore ds) {
        System.out.println("Enter PIN(Acct One):");
    }
}
