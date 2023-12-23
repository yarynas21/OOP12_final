package apps.ucu.edu.ua.taskf;

public class ATM {
    private Tray firstTray;
    public ATM() {
        firstTray = new TrayFivehundred();
        Tray trayTwo = new TrayTwohundred();
        firstTray.setNext(trayTwo);
        Tray trayOne = new TrayOnehundred();
        trayTwo.setNext(trayOne);
        Tray trayFifty = new TrayFifty();
        trayOne.setNext(trayFifty);
        Tray trayFive = new TrayFive();
        trayFifty.setNext(trayFive);
    }

    public void process(int amount) {
        firstTray.process(amount);
    }
}
