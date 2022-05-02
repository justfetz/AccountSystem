package edu.iit.state;

public class Locked implements State {

    public Locked(MDA_EFSM m) {
        this.m = m;
    }

    MDA_EFSM m;


    @Override
    public void Open() {

    }

    @Override
    public void Login() {

    }

    @Override
    public void Logout() {
    }

    @Override
    public void IncorrectLogin() {

    }

    @Override
    public void IncorrectPin(int max) {

    }

    @Override
    public void CorrectPinAboveMin() {

    }

    @Override
    public void IncorrectLock() {

    }

    @Override
    public void Deposit() {

    }

    @Override
    public void Balance() {

    }

    @Override
    public void Suspend() {

    }

    @Override
    public void Activate() {

    }

    @Override
    public void Lock() {

    }

    @Override
    public void Withdraw() {

    }

    @Override
    public void AboveMinBalance() {

    }

    @Override
    public void NoFunds() {

    }

    @Override
    public void Close() {

    }

    @Override
    public void Unlock() {
        m.setCurrentState(m.getS1State());
    }

    @Override
    public void IncorrectUnlock() {
        m.p.IncorrectUnlockMsg();
        m.setCurrentState(m.getLockedState());
    }

    @Override
    public void WithdrawBelowMinBalance() {

    }

    @Override
    public void BelowMinBalance() {

    }

    @Override
    public void CorrectPinBelowMin() {

    }
}
