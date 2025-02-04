public abstract class AgentsTemporels
{
    protected String nom;
    protected Integer niveauExp;
    protected Integer anneeRecrutement;

    protected abstract void executerMission(Anomalie anomalie);

    protected AgentsTemporels(String nom, Integer niveauExp, Integer anneeRecrutement)
    {
        this.nom = nom;
        this.niveauExp = niveauExp;
        this.anneeRecrutement = anneeRecrutement;
    }

    public Integer getAnneeRecrutement() {
        return anneeRecrutement;
    }

    public Integer getNiveauExp() {
        return niveauExp;
    }

    public String getNom() {
        return nom;
    }
}
