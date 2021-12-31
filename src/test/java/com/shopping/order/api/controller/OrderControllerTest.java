package com.shopping.order.api.controller;

import com.shopping.order.api.service.OrderService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest; 

@WebMvcTest
public class OrderControllerTest {

  @InjectMocks
  private OrderController orderController;
  
  @Mock
  private OrderService orderService;
   
  @Test
  public void bookOrder() {
     
  }

}
