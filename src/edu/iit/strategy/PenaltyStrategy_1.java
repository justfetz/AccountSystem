package edu.iit.strategy;

import edu.iit.dataStorage.DataStore;
import edu.iit.dataStorage.DataStoreOne;

import java.util.Scanner;

//INT PENALTY
public class PenaltyStrategy_1 implements Penalty {


    @Override
    public void Penalty(DataStore ds) {
        //implement penalty logic
        Scanner s = new Scanner(System.in);
        System.out.println("What is penalty?");
        System.out.println("Enter an integer");
        int penaltyNumber = s.nextInt();
        ((DataStoreOne)ds).penalty(penaltyNumber);
    }
}
