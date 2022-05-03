package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Configuration
//@Import({
//        DispatcherServletAutoConfiguration.class,
//        WebMvcAutoConfiguration.class,
//        HttpMessageConvertersAutoConfiguration.class,
//        ErrorMvcAutoConfiguration.class,
//        ConfigurationPropertiesAutoConfiguration.class,
//        PropertyPlaceholderAutoConfiguration.class,
//        ServletWebServerFactoryAutoConfiguration.class,
//        RepositoryRestMvcAutoConfiguration.class,
//        JpaRepositoriesAutoConfiguration.class,
//        SecurityAutoConfiguration.class,
//        TransactionAutoConfiguration.class,
//        DataSourceAutoConfiguration.class,
//        DataSourceTransactionManagerAutoConfiguration.class,
//        HibernateJpaAutoConfiguration.class
//})
//@EnableJpaRepositories()
//@EntityScan("com.example.demo.domain.entity")
//@ComponentScan
//
////@Configuration
////@EnableJpaRepositories("com.example.demo.repository")
////@EntityScan("com.example.demo.domain.entity")
@SpringBootApplication
////@ComponentScan
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("Hello world.");
        SpringApplication.run(DemoApplication.class, args);
    }

}
