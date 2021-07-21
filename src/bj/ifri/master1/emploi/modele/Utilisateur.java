/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.ifri.master1.emploi.modele;

/**
 *
 * @author SANNI Emmanuel
 */
public class Utilisateur {
    private String login;
    private String nom;
    private String prenom;
    private String motpasse;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getMotpasse() {
        return motpasse;
    }

    public void setMotpasse(String motpasse) {
        this.motpasse = motpasse;
    }

    public Utilisateur(String login, String nom, String prenom, String motpasse) {
        this.login = login;
        this.nom = nom;
        this.prenom = prenom;
        this.motpasse = motpasse;
    }

    public Utilisateur() {
    }
    
    
    
}
