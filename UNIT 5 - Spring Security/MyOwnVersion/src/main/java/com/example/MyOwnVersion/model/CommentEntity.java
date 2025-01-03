package com.example.MyOwnVersion.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "comment")
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long id;

    @Column(name = "comment")
    private String comment;

    // ------------- Relations ---------------
    @ManyToOne
    @JoinColumn(name = "user_id")
    UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "post_id")
    PostEntity postEntity;

    public CommentEntity() {
    }
}