package SetterMDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Controller {
    private static Service service;

    public void setService(Service service){
        this.service=service;
    }
    public static void handleReq(){
        service.doSomething();
    }

    public static void main(String[] args) {
        Controller.handleReq();
    }
}
