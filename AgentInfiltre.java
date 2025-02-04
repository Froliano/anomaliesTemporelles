public class AgentInfiltre extends AgentsTemporels implements ExpertEnDiscretion
{
    protected AgentInfiltre(String nom, Integer niveauExp, Integer anneeRecrutement)
    {
        super(nom, niveauExp, anneeRecrutement);
    }

    @Override
    protected void executerMission(Anomalie anomalie)
    {
        seFondreDansLeDécor();
        anomalie.setStatut(Status.resolue);
    }
}
