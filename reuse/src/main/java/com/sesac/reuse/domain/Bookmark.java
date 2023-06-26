package com.sesac.reuse.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Bookmark {
    //TODO: 북마크 그룹(북마크 폴더) 기능 구현 여부 결정
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    Item item;
}
