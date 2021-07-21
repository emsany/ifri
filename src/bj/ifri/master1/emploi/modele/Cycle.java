package bj.ifri.master1.emploi.modele;

public class Cycle {
private String code;
private String libelle;

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

    public Cycle() {
    }

    public Cycle(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }


}
