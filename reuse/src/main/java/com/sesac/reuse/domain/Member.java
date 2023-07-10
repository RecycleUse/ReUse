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
    Code privilege;

    @OneToMany(mappedBy = "writer")
    List<RecycleGuide> recycleGuides;
}
