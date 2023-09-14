package com.debuf.managedworkshow.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@JmixEntity
@Table(name = "EXP_CONTENT", indexes = {
        @Index(name = "IDX_EXP_CONTENT_COMPETENCES", columnList = "COMPETENCES_ID"),
        @Index(name = "IDX_EXP_CONTENT_INTERVALS_DATES", columnList = "INTERVALS_DATES_ID"),
        @Index(name = "IDX_EXP_CONTENT_CONTENT", columnList = "CONTENT_ID")
})
@Entity
public class Exp_content {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "CATEGORY_EXP", nullable = false)
    @NotNull
    private String category_exp;

    @JoinColumn(name = "COMPETENCES_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Competences competences;

    @JoinColumn(name = "INTERVALS_DATES_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Intervals_dates intervals_dates;

    @JoinColumn(name = "CONTENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Content content;

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public Intervals_dates getIntervals_dates() {
        return intervals_dates;
    }

    public void setIntervals_dates(Intervals_dates intervals_dates) {
        this.intervals_dates = intervals_dates;
    }

    public Competences getCompetences() {
        return competences;
    }

    public void setCompetences(Competences competences) {
        this.competences = competences;
    }

    public String getCategory_exp() {
        return category_exp;
    }

    public void setCategory_exp(String category_exp) {
        this.category_exp = category_exp;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}