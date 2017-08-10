package com.hukacode.elibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElibraryWebApplication {

  private static int abc = 123;

  public static void main(String[] args) {
    SpringApplication.run(ElibraryWebApplication.class, args);
    System.out.print(abc);
  }
}
