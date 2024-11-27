public class ChargerAdapter implements Target{
    private OldCharger oldCharger;
    ChargerAdapter(OldCharger oldCharger){
        this.oldCharger=oldCharger;
    }
    @Override
    public void connectToUsbC(){
        System.out.println("Adapter in use");
        oldCharger.connectToMicroUsb();
    }
}
