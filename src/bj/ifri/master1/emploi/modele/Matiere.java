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
public class Matiere extends Dao{
    private String code;
    private String libelle;

    public Matiere() {
    }

    public Matiere(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return code + ":" + libelle ;
    }
    
    
}
