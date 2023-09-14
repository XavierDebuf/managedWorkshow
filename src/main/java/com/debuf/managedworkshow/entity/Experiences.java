package com.debuf.managedworkshow.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.UUID;

@JmixEntity
@Table(name = "EXPERIENCES", indexes = {
        @Index(name = "IDX_EXPERIENCES_EXP_CONTENT", columnList = "EXP_CONTENT_ID")
})
@Entity
public class Experiences {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "TITRE")
    private String titre;

    @InstanceName
    @Column(name = "DESCRIPTION")
    @Lob
    private String description;

    @JoinColumn(name = "EXP_CONTENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Exp_content exp_content;

    public Exp_content getExp_content() {
        return exp_content;
    }

    public void setExp_content(Exp_content exp_content) {
        this.exp_content = exp_content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}