package com.sesac.reuse.domain;

import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Getter
public class RecycleGuide {
    @EmbeddedId
    ItemId id;
    @ManyToOne
    @JoinColumn(name = "writer_id")
    Member writer;
    String content;
    Timestamp latestModifiedTime;
}

@Embeddable
class ItemId implements Serializable{
    @Column(name = "item_id")
    Long id;
}
