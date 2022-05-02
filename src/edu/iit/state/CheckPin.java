package edu.iit.state;

public class CheckPin implements State {

    MDA_EFSM m;
    private String message = "You cannot perform this action from this state.";


    public CheckPin(MDA_EFSM m) {
        this.m = m;
    }

    @Override
    public void Open() {
        System.out.println(message);

    }

    @Override
    public void Login() {
        System.out.println(message);
    }

    @Override
    public void Logout() {
        m.setCurrentState(m.getIdleState());
    }

    @Override
    public void IncorrectLogin() {
        System.out.println(message);

    }

    @Override
    public void IncorrectPin(int max) {
        if (m.attempts < max) {
            m.p.IncorrectPinMsg();
            m.attempts += 1;
            m.setCurrentState(m.getCheckPinState());
        } else if (m.attempts == max) {
            m.p.IncorrectPinMsg();
            m.p.TooManyAttemptsMsg();
            m.setCurrentState(m.getIdleState());
        }
    }

    @Override
    public void CorrectPinAboveMin() {
        m.p.DisplayMenu();
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
        m.p.DisplayMenu();
    }

    @Override
    public String toString() {
        return "CheckPin{" +
                "m=" + m +
                "state=" + this.getClass().getName() +
                '}';
    }
}
