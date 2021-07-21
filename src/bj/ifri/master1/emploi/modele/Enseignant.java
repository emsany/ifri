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
public class Enseignant extends Dao{	
    
        private String code;
	private String nom;
	private String prenom;
	private String dateNais;
	
	public String getMatricule() {
		return code;
	}
	public void setMatricule(String matricule) {
		this.code = matricule;
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
	public String getDateNais() {
		return dateNais;
	}
	public void setDateNais(String dateNais) {
		this.dateNais = dateNais;
	}

    public Enseignant(String matricule, String nom, String prenom, String dateNais) {
        this.code = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNais = dateNais;
    }

    public Enseignant() {
    }

    public Enseignant(String matricule, String nom, String prenom) {
        this.code = matricule;
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return code + "-" + nom + " " + prenom; //To change body of generated methods, choose Tools | Templates.
    }
        
        

}
