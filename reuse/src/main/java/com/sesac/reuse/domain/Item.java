package com.sesac.reuse.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Getter
public class Item {
    @Id
    //TODO: identity vs sequence
    //      키 생성 방식 어떻게 해야할까요?
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotNull
    String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    RecycleCategory recycleCategory;

    @OneToOne(mappedBy = "item")
    RecycleGuide recycleGuide;
}
