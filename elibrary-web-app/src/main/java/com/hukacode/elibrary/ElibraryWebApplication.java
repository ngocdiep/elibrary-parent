package com.hukacode.elibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElibraryWebApplication {

  int abc;

  public static void main(String[] args) {
    SpringApplication.run(ElibraryWebApplication.class, args);
  }
}
