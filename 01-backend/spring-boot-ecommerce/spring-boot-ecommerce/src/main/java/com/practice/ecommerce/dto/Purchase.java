package com.practice.ecommerce.dto;

import com.practice.ecommerce.entity.Address;
import com.practice.ecommerce.entity.Customer;
import com.practice.ecommerce.entity.Order;
import com.practice.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;

    private Address shippingAddress;

    private Address billingAddress;

    private Order order;

    private Set<OrderItem> orderItems;
}
