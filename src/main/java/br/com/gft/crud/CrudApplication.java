package br.com.gft.crud;
import entities.TestCrud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {


    public static void main(String[] args) {

        SpringApplication.run(CrudApplication.class, args);
		TestCrud test = new TestCrud();
		test.test();
    }

}
