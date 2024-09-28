/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Population {
    private int idr;
    private String prenom;
    private String nom;
    private Date dateNais;
    private String lieuNais;
    private String region;
    private String sexe;
    private String domicile;
    private String profession;
    private String nomPere;
    private String dateEnreg;

    public Population() {
    }

    public Population(String prenom, String nom, Date dateNais, String lieuNais, String region, String sexe, String domicile, String profession, String nomPere, String dateEnreg) {
        this.prenom = prenom;
        this.nom = nom;
        this.dateNais = dateNais;
        this.lieuNais = lieuNais;
        this.region = region;
        this.sexe = sexe;
        this.domicile = domicile;
        this.profession = profession;
        this.nomPere = nomPere;
        this.dateEnreg = dateEnreg;
    }

    public Population(int idr, String prenom, String nom, Date dateNais, String lieuNais, String region, String sexe, String domicile, String profession, String nomPere, String dateEnreg) {
        this.idr = idr;
        this.prenom = prenom;
        this.nom = nom;
        this.dateNais = dateNais;
        this.lieuNais = lieuNais;
        this.region = region;
        this.sexe = sexe;
        this.domicile = domicile;
        this.profession = profession;
        this.nomPere = nomPere;
        this.dateEnreg = dateEnreg;
    }

    public int getIdr() {
        return idr;
    }

    public void setIdr(int idr) {
        this.idr = idr;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateNais() {
        return dateNais;
    }

    public void setDateNais(Date dateNais) {
        this.dateNais = dateNais;
    }

    public String getLieuNais() {
        return lieuNais;
    }

    public void setLieuNais(String lieuNais) {
        this.lieuNais = lieuNais;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getDomicile() {
        return domicile;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    public String getprofession() {
        return profession;
    }

    public void setprofession(String profession) {
        this.profession = profession;
    }

    public String getNomPere() {
        return nomPere;
    }

    public void setNomPere(String nomPere) {
        this.nomPere = nomPere;
    }

    public String getDateEnreg() {
        return dateEnreg;
    }

    public void setDateEnreg(String dateEnreg) {
        this.dateEnreg = dateEnreg;
    }
    
    
}
