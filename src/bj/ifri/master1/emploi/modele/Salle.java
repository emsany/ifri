package bj.ifri.master1.emploi.modele;

public class Salle {
  private String code;
  private String libelle; 
  private String localisation;
  private int capacite;

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

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public Salle(String code, String libelle, String localisation, int capacite) {
        this.code = code;
        this.libelle = libelle;
        this.localisation = localisation;
        this.capacite = capacite;
    }

    public Salle() {
    }
  
  
}
