public class SmartHomeFacade {
    private Light light;
    private MusicSystem musicSystem;
    private SecuritySystem securitySystem;

    public SmartHomeFacade(){
        this.light=new Light();
        this.musicSystem=new MusicSystem();
        this.securitySystem=new SecuritySystem();
    }

    public void startEveningMode(){
        System.out.println("Evening mode is starting...");
        light.turnOn();
        musicSystem.playMusic();
        securitySystem.arm();
    }
    public void stopEveningMode(){
        System.out.println("Evening mode is stopping...");
        light.turnOff();
        musicSystem.stopMusic();
        securitySystem.disarm();
    }
}
