package com.nttdata.afp.withdrawal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Clase principal de la aplicacion.
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableEurekaClient
public class WithdrawalApplication {
  public static void main(String[] args) {
    SpringApplication.run(WithdrawalApplication.class, args);
  }
}
