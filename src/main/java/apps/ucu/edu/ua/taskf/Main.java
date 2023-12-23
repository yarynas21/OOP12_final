package apps.ucu.edu.ua.taskf;

public class Main {
    private final static int AMOUNT = 745;
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.process(AMOUNT);
    }
}