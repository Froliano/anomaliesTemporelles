package Agents;

import Competences.VoyageurTemporel;
import Facts.Anomalie;
import Enum.Statut;

public class AgentScientifique extends AgentsTemporels implements VoyageurTemporel
{
    public AgentScientifique(String nom, Integer niveauExp, Integer anneeRecrutement)
    {
        super(nom, niveauExp, anneeRecrutement);
    }

    @Override
    public void executerMission(Anomalie anomalie)
    {
        voyagerDansLeTemps(anomalie.getAnneeApparition()-2);
        anomalie.setStatut(Statut.resolue);
    }
}
