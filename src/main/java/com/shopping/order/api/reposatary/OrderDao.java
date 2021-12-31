package com.shopping.order.api.reposatary;

import com.shopping.order.api.entity.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * For Repo.
 *
 * @author Tertioai
 *
 */

public interface OrderDao extends JpaRepository<OrderModel, Integer> {

}
