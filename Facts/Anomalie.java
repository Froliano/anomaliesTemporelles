package Facts;

import Enum.*;

public class Anomalie {
    private String description;
    private Integer anneeApparition;
    private Dangerosite dangerosite;
    private Statut statut;
    private Integer vie;
    private boolean isAlive = true;

    public Anomalie(String description, Integer anneeApparition, Dangerosite dangerosite)
    {
        this.description = description;
        this.anneeApparition = anneeApparition;
        this.dangerosite = dangerosite;
        this.statut = Statut.non_resolue;
        this.vie = dangerosite.getVie();
    }

    public void setStatut(Statut statut)
    {
        this.statut = statut;
        System.out.println("Statut de l'anomalie " + description + " : " + statut);
    }

    public String getDescription() {
        return description;
    }

    public Integer getAnneeApparition() {
        return anneeApparition;
    }

    public Dangerosite getDangerosite() {
        return dangerosite;
    }

    public Statut getStatut() {
        return statut;
    }

    public void takeDamage(Integer degats)
    {
        this.vie -= degats;
        if (this.vie <= 0)
        {
            this.isAlive = false;
        }
    }

    public boolean isAlive() {
        return isAlive;
    }
}
