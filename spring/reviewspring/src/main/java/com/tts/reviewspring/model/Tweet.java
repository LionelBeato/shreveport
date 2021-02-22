package com.tts.reviewspring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tweet_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id")
    @OnDelete( action = OnDeleteAction.CASCADE)
    private User user;

    @NotEmpty(message = "Tweet cannot be empty")
    @Length(max = 280, message = "Tweet cannot have more than 280 characters")
    private String message;

    @CreationTimestamp
    private Date createdAt;
}
