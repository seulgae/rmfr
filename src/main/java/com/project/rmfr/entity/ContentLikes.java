package com.project.rmfr.entity;

import com.project.rmfr.entity.ck.ContentLikesCK;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Table(name="contentLikes")
@Getter
@Setter
@DynamicInsert
public class ContentLikes {

    @EmbeddedId
    private ContentLikesCK contentLikesCK;

    @Column(columnDefinition = "VARCHAR(10)", nullable = false)
    private String contentType;
}
