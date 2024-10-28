public class Server extends Computer{
    private String ram,cpu;
    Server(String ram,String cpu){
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
