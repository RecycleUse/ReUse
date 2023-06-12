package com.sesac.reuse.item.service;

import com.sesac.reuse.item.model.item.Item;
import com.sesac.reuse.item.model.recycle_guide.category.RecycleSubCategory;

public class ItemService {
    Item addItem(long id, String name, RecycleSubCategory){
        new Item(id, name);
    }
}
