package edu.iit.state;

public class Idle implements State {

    MDA_EFSM m;

    public Idle(MDA_EFSM m) {
        this.m = m;
    }

    @Override
    public void Open() {

    }

    @Override
    public void Login() {
        m.attempts = 0;

        m.p.PromptForPin();
        m.setCurrentState(m.getCheckPinState());

    }

    @Override
    public void Logout() {

    }

    @Override
    public void IncorrectLogin() {
        m.p.IncorrectIdMsg();
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

    }

    @Override
    public void IncorrectUnlock() {

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
