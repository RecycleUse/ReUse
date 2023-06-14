package com.sesac.reuse.item.model.category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RecycleCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int category_id;
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent")
//    @Column(name = "mainCategory")
    private RecycleCategory parent;
    @OneToMany(mappedBy = "parent")
    private List<RecycleCategory> subCategories = new ArrayList<>();

    public RecycleCategory(final String name) {
        this.name = name;
    }

    public RecycleCategory(final String name, final RecycleCategory parent) {
        this.name = name;
        this.parent = parent;
    }
}
