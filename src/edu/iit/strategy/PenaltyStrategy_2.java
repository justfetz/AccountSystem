package edu.iit.strategy;

import edu.iit.dataStorage.*;

import java.util.Scanner;

public class PenaltyStrategy_2 implements Penalty {


    @Override
    public void Penalty(DataStore ds) {
    //implement penalty logic
        Scanner s = new Scanner(System.in);
        System.out.println("What is penalty?");
        System.out.println("Enter a float");
        float penaltyNumber = s.nextFloat();
        ((DataStoreTwo)ds).penalty(penaltyNumber);
    }
}
