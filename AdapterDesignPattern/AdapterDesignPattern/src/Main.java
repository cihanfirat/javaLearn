public class Main {
    public static void main(String[] args) throws Exception {
        OldCharger oldCharger = new OldCharger();
        Target adapter = new ChargerAdapter(oldCharger);
        System.out.println("Connecting devide...");
        adapter.connectToUsbC();
        //oldCharger.connectToMicroUsb();
    }
}
