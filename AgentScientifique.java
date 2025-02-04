public class AgentScientifique extends AgentsTemporels implements VoyageurTemporel
{
    protected AgentScientifique(String nom, Integer niveauExp, Integer anneeRecrutement)
    {
        super(nom, niveauExp, anneeRecrutement);
    }

    @Override
    protected void executerMission(Anomalie anomalie)
    {
        voyagerDansLeTemps(anomalie.getAnneeApparition()-2);
        anomalie.setStatut(Status.resolue);
    }
}
