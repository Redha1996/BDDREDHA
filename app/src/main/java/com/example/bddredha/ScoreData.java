package com.example.bddredha;

public class ScoreData {

    private int idPersonne;
    private String nom;
    private String prenom;
    private String numero;
    private String adresse;
    private String mail;
    private String specialite;

    public ScoreData(int idPersonne, String nom, String prenom, String numero, String adresse, String mail, String specialite) {
        this.setIdPersonne(idPersonne);
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setNumero(numero);
        this.setAdresse(adresse);
        this.setMail(mail);
        this.setSpecialite(specialite);
    }

    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    @Override
    public String toString(){
    return idPersonne+":"+nom+","+prenom;
    }


    public void add(ScoreData score) {
    }
}
