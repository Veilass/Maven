package org.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Review {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long review_id;

    private String title, text;

    public Long getReview_id() {
        return review_id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
