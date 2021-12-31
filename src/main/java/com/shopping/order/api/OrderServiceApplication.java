package com.shopping.order.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication; 
/**
* Some javadoc.
*
* @since Some javadoc. // OK
* @version Some javadoc. // Violation - wrong order 
* @see Some javadoc. // Violation - wrong order
* @author Some javadoc. // Violation - wrong order
*/

@SpringBootApplication 
public class OrderServiceApplication {

  public static void main(String[] args) { 

    SpringApplication.run(OrderServiceApplication.class, args);
  }

}
