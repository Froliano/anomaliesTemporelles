public class Anomalie
{
    private String description;
    private Integer anneeApparition;
    private Dangerosite dangerosite;
    private Status statut;

    public Anomalie(String description, Integer anneeApparition, Dangerosite dangerosite)
    {
        this.description = description;
        this.anneeApparition = anneeApparition;
        this.dangerosite = dangerosite;
        this.statut = Status.non_resolue;
    }

    public void setStatut(Status statut)
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

    public Status getStatut() {
        return statut;
    }
}
