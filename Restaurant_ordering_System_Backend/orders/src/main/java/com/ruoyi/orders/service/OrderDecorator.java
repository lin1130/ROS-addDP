package com.ruoyi.orders.service;

import com.ruoyi.orders.domain.Orders;

public interface OrderDecorator extends IOrdersService{
    public Orders addRice(Orders orders);
}
