package com.sesac.reuse.domain;

import lombok.Getter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
public class RecycleGuideRevision {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @ManyToOne
    @JoinColumn(name = "guide_id")
    RecycleGuide recycleGuide;
    @ManyToOne
    @JoinColumn(name = "writer_id")
    Member writer;
    Integer revisionNumber;
    String content;
    Timestamp revisionTime;
}
