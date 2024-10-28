public class Main {
    public static void main(String[] args) {
        Factory f1 = new ServerFactory("4gb", "i3");
        Computer server1 =  f1.createComputer();
        System.out.println(server1.getCpu() + " " + server1.getRam());
    }
}
