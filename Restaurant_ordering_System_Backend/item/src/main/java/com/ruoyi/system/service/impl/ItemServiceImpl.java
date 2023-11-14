package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ItemMapper;
import com.ruoyi.system.domain.Item;
import com.ruoyi.system.service.IItemService;

/**
 * item tableService业务层处理
 * 
 * @author ruoyi
 * @date 2023-11-12
 */
@Service
public class ItemServiceImpl implements IItemService 
{
    @Autowired
    private ItemMapper itemMapper;

    /**
     * 查询item table
     * 
     * @param itemId item table主键
     * @return item table
     */
    @Override
    public Item selectItemByItemId(Long itemId)
    {
        return itemMapper.selectItemByItemId(itemId);
    }

    /**
     * 查询item table列表
     * 
     * @param item item table
     * @return item table
     */
    @Override
    public List<Item> selectItemList(Item item)
    {
        return itemMapper.selectItemList(item);
    }

    /**
     * 新增item table
     * 
     * @param item item table
     * @return 结果
     */
    @Override
    public int insertItem(Item item)
    {
        return itemMapper.insertItem(item);
    }

    /**
     * 修改item table
     * 
     * @param item item table
     * @return 结果
     */
    @Override
    public int updateItem(Item item)
    {
        return itemMapper.updateItem(item);
    }

    /**
     * 批量删除item table
     * 
     * @param itemIds 需要删除的item table主键
     * @return 结果
     */
    @Override
    public int deleteItemByItemIds(Long[] itemIds)
    {
        return itemMapper.deleteItemByItemIds(itemIds);
    }

    /**
     * 删除item table信息
     * 
     * @param itemId item table主键
     * @return 结果
     */
    @Override
    public int deleteItemByItemId(Long itemId)
    {
        return itemMapper.deleteItemByItemId(itemId);
    }
}
