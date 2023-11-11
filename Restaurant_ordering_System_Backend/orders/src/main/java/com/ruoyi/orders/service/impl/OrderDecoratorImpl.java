package com.ruoyi.orders.service.impl;

import com.ruoyi.orders.domain.Orders;
import com.ruoyi.orders.mapper.OrdersMapper;
import com.ruoyi.orders.service.OrderDecorator;

import java.util.List;

public class OrderDecoratorImpl implements OrderDecorator {
    private OrdersMapper ordersMapper;

    @Override
    public Orders addRice(Orders orders) {
        return null;
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
