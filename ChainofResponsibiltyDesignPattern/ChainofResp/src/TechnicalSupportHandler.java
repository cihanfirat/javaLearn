public class TechnicalSupportHandler extends SupportHandler{
    @Override
    public void handleRequest(String request){
        if(request == "technical"){
            System.out.println("Technical: Request handled.");
        }else if(nextHandler!=null){
            nextHandler.handleRequest(request);
        }
    }
}
