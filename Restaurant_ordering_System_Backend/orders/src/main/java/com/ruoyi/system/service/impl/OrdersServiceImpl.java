package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.OrdersMapper;
import com.ruoyi.system.domain.Orders;
import com.ruoyi.system.service.IOrdersService;

/**
 * Order ListService业务层处理
 *
 * @author ruoyi
 * @date 2023-11-12
 */
@Service
public class OrdersServiceImpl implements IOrdersService
{
    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public Orders addRice(Orders orders) {
        return null;
    }

    /**
     * 查询Order List
     *
     * @param orderId Order List主键
     * @return Order List
     */
    @Override
    public Orders selectOrdersByOrderId(Long orderId)
    {
        return ordersMapper.selectOrdersByOrderId(orderId);
    }

    /**
     * 查询Order List列表
     *
     * @param orders Order List
     * @return Order List
     */
    @Override
    public List<Orders> selectOrdersList(Orders orders)
    {
        return ordersMapper.selectOrdersList(orders);
    }

    /**
     * 新增Order List
     *
     * @param orders Order List
     * @return 结果
     */
    @Override
    // public int insertOrders(Orders orders)
    // {
    //     return ordersMapper.insertOrders(orders);
    // }
    public Orders insertOrders(Orders orders) {
        int result = ordersMapper.insertOrders(orders);
        if (result > 0) {
            // Insertion successful, return the inserted order data
            return orders;
        } else {
            // Insertion failed, return null or throw an exception
            return null;
        }
    }

    /**
     * 修改Order List
     *
     * @param orders Order List
     * @return 结果
     */
    @Override
    public int updateOrders(Orders orders)
    {
        return ordersMapper.updateOrders(orders);
    }

    /**
     * 批量删除Order List
     *
     * @param orderIds 需要删除的Order List主键
     * @return 结果
     */
    @Override
    public int deleteOrdersByOrderIds(Long[] orderIds)
    {
        return ordersMapper.deleteOrdersByOrderIds(orderIds);
    }

    /**
     * 删除Order List信息
     *
     * @param orderId Order List主键
     * @return 结果
     */
    @Override
    public int deleteOrdersByOrderId(Long orderId)
    {
        return ordersMapper.deleteOrdersByOrderId(orderId);
    }
}
