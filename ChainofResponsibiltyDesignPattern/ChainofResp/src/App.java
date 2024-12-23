public class App {
    public static void main(String[] args) throws Exception {

        TechnicalSupportHandler tsh = new TechnicalSupportHandler();
        BillingHandler bh = new BillingHandler();
        GeneralSupportHandler gsh = new GeneralSupportHandler();

        tsh.setNextHandler(bh);
        bh.setNextHandler(gsh);

        tsh.handleRequest("technical");
        bh.handleRequest("billing");
        gsh.handleRequest("general");

    }
}
