package br.com.gft.crud;

import entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {


    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
        User u = new User("marlon","marlon@gmail.com");
        System.out.println("testandohhgjh");
    }

}
