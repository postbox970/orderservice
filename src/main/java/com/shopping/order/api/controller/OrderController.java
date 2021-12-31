package com.shopping.order.api.controller;

import com.shopping.order.api.entity.OrderModel;
import com.shopping.order.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





/** 
* Order Controller.
*
*
* @author Some Venkat
*
*/

@RestController
@RequestMapping("/order") 
public class OrderController {
  @Autowired
  OrderService orderService; 
  
  @PostMapping("/book")
  public OrderModel bookOrder(@RequestBody OrderModel order) {
     
    return  orderService.bookOrder(order);
  }

}
