package com.sesac.reuse.item.model.recycle_guide;

import com.sesac.reuse.item.model.item.Item;
import com.sesac.reuse.item.model.recycle_guide.category.RecycleCategory;
import com.sesac.reuse.item.model.recycle_guide.category.RecycleSubCategory;

import java.util.Arrays;

public class RecycleGuide {

    int id;
    Item item;
    RecycleSubCategory category;
    String content;

    public RecycleGuide(int id, Item item, RecycleSubCategory category, String content) {
        this.id = id;
        this.item = item;
        this.category = category;
        this.content = content;
    }
}
