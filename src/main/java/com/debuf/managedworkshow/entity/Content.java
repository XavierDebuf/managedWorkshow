package com.debuf.managedworkshow.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.UUID;

@JmixEntity
@Table(name = "CONTENT", indexes = {
        @Index(name = "IDX_CONTENT_SITES", columnList = "SITES_ID"),
        @Index(name = "IDX_CONTENT_IMAGES", columnList = "IMAGES_ID")
})
@Entity
public class Content {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "TITRE")
    @Lob
    private String titre;

    @InstanceName
    @Column(name = "DESCRIPTION")
    @Lob
    private String description;

    @Column(name = "PUBLIABLE")
    private Boolean publiable;

    @JoinColumn(name = "SITES_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Sites sites;

    @JoinColumn(name = "IMAGES_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Images images;

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public Sites getSites() {
        return sites;
    }

    public void setSites(Sites sites) {
        this.sites = sites;
    }

    public Boolean getPubliable() {
        return publiable;
    }

    public void setPubliable(Boolean publiable) {
        this.publiable = publiable;
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