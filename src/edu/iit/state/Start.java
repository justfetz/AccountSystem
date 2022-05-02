package edu.iit.state;

public class Start implements State {

    private MDA_EFSM m;
    private String message = "You cannot perform this action from this state.";

    @Override
    public String toString() {
        return "Start{" +
                "m=" + m +
                ", Name='" + this.getClass().getTypeName() + '\'' +
                '}';
    }

    public Start(MDA_EFSM m) {
        this.m = m;
    }

    @Override
    public void Open() {
        //EXECUTE STRATEGY FOR ACCOUNT 1 STORING DATA
        m.p.StoreData();
        //SET THE STATE TO IDELE
        m.setCurrentState(new Idle(m));
        //NOTES TO USER
        System.out.println("You Opened Account from Start State.");
        System.out.println("State changed to: ");
        System.out.println(m.toString());
    }

    @Override
    public void Login() {
        //YOU CANNOT DO THIS FROM START
        System.out.println("You need to have an active account.");
        System.out.println(m.toString());
    }
    //GENERIC MESSAGE IF NOT AVAIABLE
    @Override
    public void Logout() {
        System.out.println("You have not logged in. \n" + message);
    }

    @Override
    public void IncorrectLogin() {
        System.out.println("Login failed.");
    }

    @Override
    public void IncorrectPin(int max) {
        System.out.println("Incorrect Pin\n " + message);
    }

    @Override
    public void CorrectPinAboveMin() {
        System.out.println(message);
    }

    @Override
    public void IncorrectLock() {
        System.out.println(message);
    }

    @Override
    public void Deposit() {
        System.out.println(message);
    }

    @Override
    public void Balance() {
        System.out.println(message);
    }

    @Override
    public void Suspend() {
        System.out.println(message);
    }

    @Override
    public void Activate() {
        System.out.println(message);
    }

    @Override
    public void Lock() {
        System.out.println(message);
    }

    @Override
    public void Withdraw() {
        System.out.println(message);
    }

    @Override
    public void AboveMinBalance() {
        System.out.println(message);
    }

    @Override
    public void NoFunds() {
        System.out.println(message);
    }

    @Override
    public void Close() {
        System.out.println(message);
    }

    @Override
    public void Unlock() {
        System.out.println(message);
    }

    @Override
    public void IncorrectUnlock() {
        System.out.println(message);
    }

    @Override
    public void WithdrawBelowMinBalance() {
        System.out.println(message);
    }

    @Override
    public void BelowMinBalance() {
        System.out.println(message);
    }

    @Override
    public void CorrectPinBelowMin() {
        System.out.println(message);
    }
}
