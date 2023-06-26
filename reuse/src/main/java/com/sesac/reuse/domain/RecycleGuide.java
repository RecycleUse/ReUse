package com.sesac.reuse.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Getter
public class RecycleGuide {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    Item item;

    @OneToMany(mappedBy = "recycleGuide")
    List<RecycleGuideRevision> revisions;
}

//    //TODO: 수정 이력 기능 구현 여부(작성자가 한 명보다 더 많을 수 있음)
//    //      1. 수정 이력 기능 구현 : 작성자 목록 + 수정시간 + 작성자별 수정한 부분 저장
//    //      2. 작성자 목록 + 수정시간 목록 저장
//    //      3. 최종 수정자, 수정시간 만 저장
//    //      4. 글 작성자를 그냥 안넣는다....
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "author_id")
//    Member author;
//    Timestamp writeTime;
//    String content;
