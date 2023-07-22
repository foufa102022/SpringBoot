package com.foufa.chetouiiftikhar.Produitmodel;

import jakarta.persistence.*;

@Entity
@Table(name = "produiit")


public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produiit_SEQ")
    @SequenceGenerator(name = "produiit_SEQ", sequenceName = "produiit_id_seq", allocationSize = 1)
    @Column(name="id")
    private Integer ProdId;

    @Column(name ="nom")
    private String nom;
    @Column(name ="description")
    private String description;
    @Column(name ="Prix")
    private int Prix;

    public Produit() {
    }

    public Produit(Integer prodId, String nom, String description, int prix) {
        ProdId = prodId;
        this.nom = nom;
        this.description = description;
        Prix = prix;
    }

    public Integer getProdId() {
        return ProdId;
    }

    public void setProdId(Integer prodId) {
        ProdId = prodId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrix() {
        return Prix;
    }

    public void setPrix(int prix) {
        Prix = prix;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "ProdId=" + ProdId +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", Prix=" + Prix +
                '}';
    }
}
