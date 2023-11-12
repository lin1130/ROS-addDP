package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Orders;

/**
 * Order ListMapper接口
 *
 * @author ruoyi
 * @date 2023-11-12
 */
public interface OrdersMapper
{
    /**
     * 添加rice
     *
     *
     * @return orders
     */
    public int addRice(Orders orders);

    /**
     * 查询Order List
     *
     * @param orderId Order List主键
     * @return Order List
     */
    public Orders selectOrdersByOrderId(Long orderId);

    /**
     * 查询Order List列表
     *
     * @param orders Order List
     * @return Order List集合
     */
    public List<Orders> selectOrdersList(Orders orders);

    /**
     * 新增Order List
     *
     * @param orders Order List
     * @return 结果
     */
    public int insertOrders(Orders orders);

    /**
     * 修改Order List
     *
     * @param orders Order List
     * @return 结果
     */
    public int updateOrders(Orders orders);

    /**
     * 删除Order List
     *
     * @param orderId Order List主键
     * @return 结果
     */
    public int deleteOrdersByOrderId(Long orderId);

    /**
     * 批量删除Order List
     *
     * @param orderIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOrdersByOrderIds(Long[] orderIds);
}
