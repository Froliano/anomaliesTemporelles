public class Mission
{
    private String titre;
    private Anomalie anomalie;
    private AgentsTemporels agent;

    public Mission(String titre, Anomalie anomalie, AgentsTemporels agent)
    {
        this.titre = titre;
        this.anomalie = anomalie;
        this.agent = agent;
    }

    public void executerMission()
    {
        anomalie.setStatut(Status.en_cours_de_resolution);
        agent.executerMission(anomalie);
    }

    public void setAgent(AgentsTemporels agent)
    {
        System.out.println("changement de l'agent : " + this.agent.getNom() + ", par l'agent : " + agent.getNom());
        this.agent = agent;
    }

    public String getTitre() {
        return titre;
    }

    public Anomalie getAnomalie() {
        return anomalie;
    }

    public AgentsTemporels getAgent() {
        return agent;
    }
}
