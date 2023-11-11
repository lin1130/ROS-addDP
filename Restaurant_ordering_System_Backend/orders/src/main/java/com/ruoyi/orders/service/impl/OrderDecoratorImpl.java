package com.ruoyi.orders.service.impl;

import com.ruoyi.orders.domain.Orders;
import com.ruoyi.orders.service.OrderDecorator;

import java.util.List;

public class OrderDecoratorImpl implements OrderDecorator {
    @Override
    public int addRice() {
        System.out.println("Order add rice");
        return 1;
    }
    @Override
    public Orders selectOrdersByOrderId(Long orderId) {
        return null;
    }

    @Override
    public List<Orders> selectOrdersList(Orders orders) {
        return null;
    }

    @Override
    public Orders insertOrders(Orders orders) {
        return null;
    }

    @Override
    public int updateOrders(Orders orders) {
        return 0;
    }

    @Override
    public int deleteOrdersByOrderIds(Long[] orderIds) {
        return 0;
    }

    @Override
    public int deleteOrdersByOrderId(Long orderId) {
        return 0;
    }
}
