package Agents;

import Facts.Anomalie;

public abstract class AgentsTemporels
{
    protected String nom;
    protected Integer niveauExp;
    protected Integer anneeRecrutement;
    protected Integer id;
    protected Integer cooldown;
    protected Integer currentCooldown;
    protected Integer damage;

    public abstract Integer executerMission(Anomalie anomalie);

    protected AgentsTemporels(String nom, Integer niveauExp, Integer anneeRecrutement, Integer id)
    {
        this.nom = nom;
        this.niveauExp = niveauExp;
        this.anneeRecrutement = anneeRecrutement;
        this.id = id;
    }

    protected boolean capacityIsUsable()
    {
        return currentCooldown >= cooldown;
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

    public Integer getId() {
        return id;
    }
}
