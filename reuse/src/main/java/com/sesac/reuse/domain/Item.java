package com.sesac.reuse.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    Code recycleCategory;
}
