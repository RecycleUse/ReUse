package com.sesac.reuse.domain;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
@Getter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    //TODO: 중복검사
    @NotEmpty
    @Email(regexp = "^[\\w\\.-]+@[\\w\\.-]+\\.\\w+$")
    String email;

    @NotEmpty
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[!@#$%^&*])[A-Za-z\\d!@#$%^&*]+$")
    String password;

    //TODO: 중복검사
    @NotEmpty
    String name;

    @NotEmpty
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "previlege_id")
    Privilege privilege;

    @OneToMany(mappedBy = "member")
    List<Bookmark> Bookmark;

    //TODO : 사용자 마이페이지에서 작성글 조회 기능 구현 여부 결정
    //       1. 구현 o
    //       2. 구현 x -> 사용자별 작성글 조회를 할 일이 없으므로 양방향으로 설정할 필요 없을 듯
    @OneToMany(mappedBy = "writer")
    List<RecycleGuideRevision> recycleGuideRevisions;
}
