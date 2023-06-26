/*
package com.sesac.reuse.Item.domain;


import com.sesac.reuse.category.domain.RecycleCategory;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter @RequiredArgsConstructor
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

   @Column(name = "name")
   private String name;

   @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private RecycleCategory category;

    @ManyToOne
    @JoinColumn(name = "recycle_category_id")
    private RecycleCategory recycleCategory;

//
//   *     종이 - 신문, 책자*노트, 상자류
//   *     일반 - 기타등등 나머지 전부 다 일반
//   *     폐기 -
//   *     플라스틱
//   *     캔 - 철캔* 알류미늄캔, 부탄가스
//   *     고철 - 고철, 비철
//   *     비닐 -
//   *     스트로폼 -
//   *     종이팩* 종이컵 - 종이팩, 종이컵
//   *


}
*/
