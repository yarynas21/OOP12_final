package apps.ucu.edu.ua.task1;

public class ATM {
    private Tray firstTray;
    public ATM() {
        firstTray = new Tray500();
        Tray tray200 = new Tray200();
        firstTray.setNext(tray200);
        Tray tray100 = new Tray100();
        tray200.setNext(tray100);
        Tray tray50 = new Tray50();
        tray100.setNext(tray50);
        Tray tray5 = new Tray5();
        tray50.setNext(tray5);
    }

    public void process(int amount) {
        firstTray.process(amount);
    }
}
