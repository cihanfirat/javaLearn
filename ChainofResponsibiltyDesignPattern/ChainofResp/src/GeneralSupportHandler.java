public class GeneralSupportHandler extends SupportHandler{
    @Override
    public void handleRequest(String request){
        if(request == "general"){
            System.out.println("General: Request handled.");
        }else if(nextHandler!=null){
            nextHandler.handleRequest(request);
        }
    }
}
