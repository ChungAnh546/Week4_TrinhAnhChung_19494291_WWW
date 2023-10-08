package vn.edu.iuh.fit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.daos.ManufacturerDAO;
import vn.edu.iuh.fit.model.Manufacturer;

@SpringBootApplication
public class Week4TrinhAnhChung19494291WwwApplication {
    @Autowired
    private ManufacturerDAO manufacturerDAO;
    public static void main(String[] args) {
        SpringApplication.run(Week4TrinhAnhChung19494291WwwApplication.class, args);
        //        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
//        Person st1 = context.getBean("person", Person.class);
//        System.out.println(st1);
//        ApplicationContext context2 = new ClassPathXmlApplicationContext("bean.xml");
//        Student st2 = context2.getBean("st3", Student.class);
//        System.out.println(st2);
    }

    @Bean
    CommandLineRunner Test_1() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {

                manufacturerDAO.insert(new Manufacturer("Chung", "Chung@gmail.com"));
            }
        };
    }
}
