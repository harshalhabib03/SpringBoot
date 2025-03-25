package FieldDI;

import org.springframework.beans.factory.annotation.Autowired;

public class Controller {
    @Autowired
    private static Service service;

    public static void handleReq(){
        service.doSomething();
    }

    public static void main(String[] args) {
        Controller.handleReq();
    }
}

