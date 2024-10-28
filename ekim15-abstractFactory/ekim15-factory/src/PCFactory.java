public class PCFactory extends Factory{
    private String ram,cpu;
    PCFactory(String ram,String cpu){
        this.ram=ram;this.cpu=cpu;
    }
    @Override
    public Computer createComputer(){
        return new PC(this.ram, this.cpu);
    }
}
