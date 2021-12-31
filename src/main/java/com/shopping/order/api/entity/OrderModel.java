package com.shopping.order.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Order Model.
 *
 * @author Tertioai
 *
 */

@Entity
@Table(name = "ORDER_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderModel {
  
  @Id
  private int id;
  private String name;
  private int qty;
  private double price; 
  
}
