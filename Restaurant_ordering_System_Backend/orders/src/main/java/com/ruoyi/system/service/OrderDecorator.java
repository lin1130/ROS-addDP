package com.ruoyi.system.service;

import com.ruoyi.system.domain.Orders;

public interface OrderDecorator extends IOrdersService{
    public Orders addRice(Orders orders);
}
