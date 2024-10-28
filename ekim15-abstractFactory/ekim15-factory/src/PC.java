public class PC extends Computer{
    private String ram,cpu;
    PC(String ram,String cpu){
        this.ram=ram;this.cpu=cpu;
    }
    @Override
    String getRam(){
        return this.ram;
    }
    @Override
    String getCpu(){
        return this.cpu;
    }
}
