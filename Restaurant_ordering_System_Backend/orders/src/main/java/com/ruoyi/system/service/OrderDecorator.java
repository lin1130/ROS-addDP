package com.ruoyi.details.service;

import com.ruoyi.orders.domain.Orders;

public interface OrderDecorator extends IOrdersService{
    public Orders addRice(Orders orders);
}
