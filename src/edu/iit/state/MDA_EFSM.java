package edu.iit.state;

import edu.iit.abstractfactory.AbstractFactory;
import edu.iit.architectures.OP;

import java.util.List;

public class MDA_EFSM {

    //Can use Object array as well and just point each after each move.

    //Account Access states
    State idle = new Idle(this);
    State checkPin = new CheckPin(this);


    //fields for MDA_EFSM
    OP p; //output
    int attempts; //variable
    State currentState; //current state of program
    AbstractFactory factory; //factory field


    //constructor
    public MDA_EFSM(OP p, AbstractFactory af) {
        this.p = p;
        this.attempts = 0;
        this.factory = af;
        //put this MDA_EFSM into current state
        this.currentState = new Start(this);
    }


    /**THESE ARE EVENTS IN MDA-EFSM**/
    public void Open() {
        currentState.Open();
    }

    public void IncorrectLogin() {
        currentState.IncorrectLogin();
    }

    public void CorrectPinAboveMin() {
        currentState.CorrectPinAboveMin();
    }

    public void CorrectPinBelowMin() {
        currentState.CorrectPinBelowMin();
    }

    public void IncorrectPin(int i) {
        currentState.IncorrectPin(2);
    }

    public void Deposit() {
        currentState.Deposit();
    }

    public void AboveMinBalance() {
        currentState.AboveMinBalance();
    }

    public void BelowMinBalance() {
        currentState.BelowMinBalance();
    }

    public void WithdrawBelowMinBalance() {
        currentState.WithdrawBelowMinBalance();
    }

    public void Balance() {
        currentState.Balance();
    }

    public void Login() {
        currentState.Login();
    }

    public void Logout() {
        currentState.Logout();
    }

    public void Lock() {
        currentState.Lock();
    }

    public void IncorrectLock() {
        currentState.IncorrectLock();
    }

    public void Unlock() {
        currentState.Unlock();
    }

    public void IncorrectUnlock() {
        currentState.IncorrectUnlock();
    }

    public void Withdraw() {
        currentState.Withdraw();
    }

    public void NoFunds() {
        currentState.NoFunds();
    }

    public void Suspend() {
        currentState.Suspend();
    }

    public void Activate() {
        currentState.Activate();
    }

    public void Close() {
        currentState.Close();
    }

    /**THESE ARE AVAILABLE STATES**/
    public void setCurrentState(State s) {
        this.currentState = s;
    }

    public State getCurrentState() {
        return currentState;
    }
    //DO NOT RETURN A START STATE

    public State getCheckPinState() {
        return checkPin;
    }

    public State getIdleState() {
        return idle;
    }

    //RETURN WITH KEYWORD NEW
    public State getLockedState() {
        return new Locked(this);
    }

    public State getOverDrawn() {
        return new OverDrawn(this);
    }

    public State getReadyState() {
        return new Ready(this);
    }

    public State getS1State() {
        return new S1(this);
    }

    public State getSuspended() {
        return new Suspended(this);
    }

    @Override
    public String toString() {
        return "MDA_EFSM { " +
                "  Attempts =" + attempts +
                ", class = " + this.currentState.getClass().getName() +
                '}';
    }
/*
     Open()
    Login()
    IncorrectLogin()
    IncorectPin(int max)
    CorrectPinBelowMin()
    CorrectPinAboveMin()
    Deposit()
    BelowMinBalance()
    AboveMinBalance()
    Logout()
    Balance()
    Withdraw()
    WithdrawBelowMinBalance()
    NoFunds()
    Lock()
    IncorrectLock()
    Unlock()
    IncorrectUnlock()
    Suspend()
    Activate()
    Close() */


}
