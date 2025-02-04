package Agents;

import Competences.HackeurTemporel;
import Facts.Anomalie;
import Enum.Statut;

public class AgentTechnologique extends AgentsTemporels implements HackeurTemporel
{
    public AgentTechnologique(String nom, Integer niveauExp, Integer anneeRecrutement)
    {
        super(nom, niveauExp, anneeRecrutement);
    }

    @Override
    public void executerMission(Anomalie anomalie)
    {
        piraterSysteme(anomalie.getDescription());
        anomalie.setStatut(Statut.resolue);
    }
}
