package Agents;

import Competences.ExpertEnDiscretion;
import Enum.Statut;
import Facts.Anomalie;

public class AgentInfiltre extends AgentsTemporels implements ExpertEnDiscretion
{
    public AgentInfiltre(String nom, Integer niveauExp, Integer anneeRecrutement)
    {
        super(nom, niveauExp, anneeRecrutement);
    }

    @Override
    public void executerMission(Anomalie anomalie)
    {
        seFondreDansLeDecor();
        anomalie.setStatut(Statut.resolue);
    }
}
