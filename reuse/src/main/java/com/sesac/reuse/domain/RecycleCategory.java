package com.sesac.reuse.domain;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class RecycleCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    //TODO: cascade 제약조건 추가
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private RecycleCategory parent;

    @OneToMany(mappedBy = "parent")
    private List<RecycleCategory> subCategories = new ArrayList<>();

    @OneToMany(mappedBy = "recycleCategory")
    List<Item> item;

}
