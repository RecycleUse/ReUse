package com.sesac.reuse.recycle.model.recycle_guide;

import com.sesac.reuse.item.model.item.Item;
import com.sesac.reuse.item.model.category.RecycleCategory;
import lombok.Getter;

import javax.persistence.*;

@Getter
public class RecycleGuide {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int recycle_guide_id;

    @JoinColumn(name = "item_id")
    Item item;

    @JoinColumn(name="category_id")
    RecycleCategory category;
    String content;

    public RecycleGuide(int recycle_guide_id, Item item, RecycleCategory category, String content) {
        this.recycle_guide_id = recycle_guide_id;
        this.item = item;
        this.category = category;
        this.content = content;
    }
}
