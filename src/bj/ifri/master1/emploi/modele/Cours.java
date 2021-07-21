package bj.ifri.master1.emploi.modele;

public class Cours {
    private String codeClasse;
    private String codeMatiere;
    private String codeEnseignant;
    private String objectif;

    public String getCodeClasse() {
        return codeClasse;
    }

    public void setCodeClasse(String codeClasse) {
        this.codeClasse = codeClasse;
    }

    public String getCodeMatiere() {
        return codeMatiere;
    }

    public void setCodeMatiere(String codeMatiere) {
        this.codeMatiere = codeMatiere;
    }

    public String getCodeEnseignant() {
        return codeEnseignant;
    }

    public void setCodeEnseignant(String codeEnseignant) {
        this.codeEnseignant = codeEnseignant;
    }

    public String getObjectif() {
        return objectif;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    public Cours(String codeClasse, String codeMatiere, String codeEnseignant, String objectif) {
        this.codeClasse = codeClasse;
        this.codeMatiere = codeMatiere;
        this.codeEnseignant = codeEnseignant;
        this.objectif = objectif;
    }

    public Cours() {
    }
    
    
}
