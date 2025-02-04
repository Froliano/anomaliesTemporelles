public class AgentTechnologique extends AgentsTemporels implements HackeurTemporel
{
    protected AgentTechnologique(String nom, Integer niveauExp, Integer anneeRecrutement)
    {
        super(nom, niveauExp, anneeRecrutement);
    }

    @Override
    protected void executerMission(Anomalie anomalie)
    {
        piraterSysteme(anomalie.getDescription());
        anomalie.setStatut(Status.resolue);
    }
}
