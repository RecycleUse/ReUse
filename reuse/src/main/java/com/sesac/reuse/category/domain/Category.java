package com.sesac.reuse.category.domain;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name ="category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Category parent;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private List<Category> subCategories = new ArrayList<>();

/*
* 이 클래스는 categories 테이블을 표현합니다.
*  @Entity 어노테이션은 이 클래스가 JPA 엔티티임을 나타냅니다.
* @Table 어노테이션은 이 엔티티가 매핑될 테이블의 이름을 지정합니다.
id 필드는 @Id 어노테이션으로 표시되어 있어, 이 필드가 테이블의 기본 키임을 나타냅니다.
* @GeneratedValue 어노테이션은 기본 키 값이 자동으로 생성되어야 함을 나타냅니다.
name 필드는 카테고리의 이름을 나타냅니다.
* @Column 어노테이션은 이 필드가 테이블의 열에 매핑됨을 나타냅니다.

parent 필드는 부모 카테고리를 나타냅니다.
* @ManyToOne 어노테이션은 이 필드가 다대일 관계에 있음을 나타냅니다.
*  @JoinColumn 어노테이션은 이 필드가 외래 키로 사용될 열의 이름을 지정합니다.

subCategories 필드는 하위 카테고리의 목록을 나타냅니다.
*  @OneToMany 어노테이션은 이 필드가 일대다 관계에 있음을 나타냅니다.
*  mappedBy 속성은 연관 관계의 주인이 아님을 나타냅니다.
*  이 속성의 값은 연관 관계의 주인이 가지고 있는 필드의 이름입니다.
* cascade 속성은 부모 엔티티를 저장하거나 삭제할 때 자식 엔티티도 함께 저장하거나 삭제해야 함을 나타냅니다.
* */
}
