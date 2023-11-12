package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.Item;
import com.ruoyi.system.mapper.ItemMapper;
import com.ruoyi.system.service.ItemState;
import org.springframework.beans.factory.annotation.Autowired;

public class SaleOutState implements ItemState {
    @Autowired
    private Item item;
    @Override
    public void setState(Item item) {
        item.setItemState("off");
    }
}
