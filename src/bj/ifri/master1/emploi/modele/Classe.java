package bj.ifri.master1.emploi.modele;

public class Classe {
    private String code;
    private String nom;
    private Cycle cycle;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Cycle getCycle() {
        return cycle;
    }

    public void setCycle(Cycle cycle) {
        this.cycle = cycle;
    }

    public Classe(String code, String nom, Cycle cycle) {
        this.code = code;
        this.nom = nom;
        this.cycle = cycle;
    }

    public Classe(String code, String nom) {
        this.code = code;
        this.nom = nom;
    }

    public Classe() {
    }

    
    @Override
    public String toString() {
        return code + ":" + nom; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

}
