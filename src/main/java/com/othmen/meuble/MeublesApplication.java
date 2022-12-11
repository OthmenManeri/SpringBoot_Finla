package com.othmen.meuble;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class MeublesApplication {
@Autowired

public static void main(String[] args) {
SpringApplication.run(MeublesApplication.class, args);
}

}
