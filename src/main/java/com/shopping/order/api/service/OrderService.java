package com.shopping.order.api.service;

import com.shopping.order.api.entity.OrderModel;
import com.shopping.order.api.reposatary.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service .
 *
 * @author Tertioai
 *
 */

@Service
public class OrderService {
  
  @Autowired
  OrderDao orderDao;
  
  public OrderModel bookOrder(OrderModel order) {
    return orderDao.save(order);
  }

}
