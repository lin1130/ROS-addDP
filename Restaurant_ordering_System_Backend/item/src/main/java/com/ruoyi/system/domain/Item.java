package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * item table对象 item
 * 
 * @author ruoyi
 * @date 2023-11-12
 */
public class Item extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** item id */
    private Long itemId;

    /** item picture */
    @Excel(name = "item picture")
    private String itemPic;

    /** item name */
    @Excel(name = "item name")
    private String itemName;

    /** item price */
    @Excel(name = "item price")
    private BigDecimal itemPrice;

    /** item description */
    @Excel(name = "item description")
    private String itemDescription;

    /** item state */
    @Excel(name = "item state")
    private String itemState;

    /** order number */
    @Excel(name = "order number")
    private Integer orderNum;

    public void setItemId(Long itemId) 
    {
        this.itemId = itemId;
    }

    public Long getItemId() 
    {
        return itemId;
    }
    public void setItemPic(String itemPic) 
    {
        this.itemPic = itemPic;
    }

    public String getItemPic() 
    {
        return itemPic;
    }
    public void setItemName(String itemName) 
    {
        this.itemName = itemName;
    }

    public String getItemName() 
    {
        return itemName;
    }
    public void setItemPrice(BigDecimal itemPrice) 
    {
        this.itemPrice = itemPrice;
    }

    public BigDecimal getItemPrice() 
    {
        return itemPrice;
    }
    public void setItemDescription(String itemDescription) 
    {
        this.itemDescription = itemDescription;
    }

    public String getItemDescription() 
    {
        return itemDescription;
    }
    public void setItemState(String itemState) 
    {
        this.itemState = itemState;
    }

    public String getItemState() 
    {
        return itemState;
    }
    public void setOrderNum(Integer orderNum) 
    {
        this.orderNum = orderNum;
    }

    public Integer getOrderNum() 
    {
        return orderNum;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("itemId", getItemId())
            .append("itemPic", getItemPic())
            .append("itemName", getItemName())
            .append("itemPrice", getItemPrice())
            .append("itemDescription", getItemDescription())
            .append("itemState", getItemState())
            .append("orderNum", getOrderNum())
            .toString();
    }
}
