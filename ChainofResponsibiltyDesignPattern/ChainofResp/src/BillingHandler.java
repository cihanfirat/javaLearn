public class BillingHandler extends SupportHandler{
    @Override
    public void handleRequest(String request){
        if(request == "billing"){
            System.out.println("Billing: Request handled.");
        }else if(nextHandler!=null){
            nextHandler.handleRequest(request);
        }
    }
}
