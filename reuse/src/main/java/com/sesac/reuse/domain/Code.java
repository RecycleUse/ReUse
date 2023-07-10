package com.sesac.reuse.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Code {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @ManyToOne
    @JoinColumn(name = "type_id")
    Code type;

    String value;

}
