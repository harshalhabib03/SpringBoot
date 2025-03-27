package com.example.demoAP;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    @Value("${ename}")
    String ename;

    @Value("${esal}")
    int esal;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Reading Application.properties Data");
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "MyRunner{" + "ename='" + ename + '\'' + ", esal=" + esal + '}';
    }
}
