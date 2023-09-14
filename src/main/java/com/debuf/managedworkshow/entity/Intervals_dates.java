package com.debuf.managedworkshow.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "INTERVALS_DATES")
@Entity
public class Intervals_dates {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "DATE_DEBUT", nullable = false)
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date date_debut;

    @Column(name = "DATE_FIN")
    @Temporal(TemporalType.DATE)
    private Date date_fin;

    @Column(name = "EN_COURS")
    private Boolean en_cours;

    public Boolean getEn_cours() {
        return en_cours;
    }

    public void setEn_cours(Boolean en_cours) {
        this.en_cours = en_cours;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}