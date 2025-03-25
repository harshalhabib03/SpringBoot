package ConstructionDI;

public class Controller {
    private static Service service;

    public Controller(Service service){
        this.service=service;
    }

    public static void handleReq(){
        service.doSomething();
    }
    public static void main(String[] args){
        Controller.handleReq();
    }
}
