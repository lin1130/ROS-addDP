package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.system.service.OrderDecorator;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Orders;
import com.ruoyi.system.service.IOrdersService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * Order ListController
 *
 * @author ruoyi
 * @date 2023-11-12
 */
@RestController
@RequestMapping("/system/orders")
public class OrdersController extends BaseController
{
    @Autowired
    private IOrdersService ordersService;

    /**
     * 查询Order List列表
     */
//    @PreAuthorize("@ss.hasPermi('system:orders:list')")
    @GetMapping("/list")
    public TableDataInfo list(Orders orders)
    {
        startPage();
        List<Orders> list = ordersService.selectOrdersList(orders);
        return getDataTable(list);
    }

    /**
     * 导出Order List列表
     */
    @PreAuthorize("@ss.hasPermi('system:orders:export')")
    @Log(title = "Order List", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Orders orders)
    {
        List<Orders> list = ordersService.selectOrdersList(orders);
        ExcelUtil<Orders> util = new ExcelUtil<Orders>(Orders.class);
        util.exportExcel(response, list, "Order List数据");
    }

    /**
     * 获取Order List详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:orders:query')")
    @GetMapping(value = "/{orderId}")
    public AjaxResult getInfo(@PathVariable("orderId") Long orderId)
    {
        return success(ordersService.selectOrdersByOrderId(orderId));
    }

    /**
     * 新增Order List
     */
    @PreAuthorize("@ss.hasPermi('orders:orders:add')")
    @Log(title = "orders", businessType = BusinessType.INSERT)
    @PostMapping
    // public AjaxResult add(@RequestBody Orders orders)
    // {
    //     return toAjax(ordersService.insertOrders(orders));
    // }
    public Orders add(@RequestBody Orders orders) {
//        System.out.println(ordersService.addRice(orders));
        return ordersService.insertOrders(orders);
    }

    //@PreAuthorize("@ss.hasPermi('orders:orders:addRice')")
    //@Log(title = "orders", businessType = BusinessType.UPDATE)
    //@PutMapping  这三行加了就报错
    public Orders addRice(@RequestBody Orders orders) {
//        System.out.println(ordersService.addRice(orders));
        return ordersService.addRice(orders);
    }

    /**
     * 修改Order List
     */
    @PreAuthorize("@ss.hasPermi('system:orders:edit')")
    @Log(title = "Order List", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Orders orders)
    {
        return toAjax(ordersService.updateOrders(orders));
    }

    /**
     * 删除Order List
     */
    @PreAuthorize("@ss.hasPermi('system:orders:remove')")
    @Log(title = "Order List", businessType = BusinessType.DELETE)
	@DeleteMapping("/{orderIds}")
    public AjaxResult remove(@PathVariable Long[] orderIds)
    {
        return toAjax(ordersService.deleteOrdersByOrderIds(orderIds));
    }
}
