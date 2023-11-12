package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Item;

/**
 * item tableService接口
 * 
 * @author ruoyi
 * @date 2023-11-12
 */
public interface IItemService 
{
    /**
     * 查询item table
     * 
     * @param itemId item table主键
     * @return item table
     */
    public Item selectItemByItemId(Long itemId);

    /**
     * 查询item table列表
     * 
     * @param item item table
     * @return item table集合
     */
    public List<Item> selectItemList(Item item);

    /**
     * 新增item table
     * 
     * @param item item table
     * @return 结果
     */
    public int insertItem(Item item);

    /**
     * 修改item table
     * 
     * @param item item table
     * @return 结果
     */
    public int updateItem(Item item);

    /**
     * 批量删除item table
     * 
     * @param itemIds 需要删除的item table主键集合
     * @return 结果
     */
    public int deleteItemByItemIds(Long[] itemIds);

    /**
     * 删除item table信息
     * 
     * @param itemId item table主键
     * @return 结果
     */
    public int deleteItemByItemId(Long itemId);
}
