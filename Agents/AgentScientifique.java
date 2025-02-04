package Agents;

import Competences.VoyageurTemporel;
import Facts.Anomalie;
import Enum.Statut;

public class AgentScientifique extends AgentsTemporels implements VoyageurTemporel
{
    public AgentScientifique(String nom, Integer niveauExp, Integer anneeRecrutement, Integer id)
    {
        super(nom, niveauExp, anneeRecrutement, id);
        super.cooldown = VoyageurTemporel.cooldown;
        super.currentCooldown = super.cooldown;
        super.damage = VoyageurTemporel.damage;
    }

    @Override
    public Integer executerMission(Anomalie anomalie)
    {
        if (capacityIsUsable())
        {
            voyagerDansLeTemps(anomalie.getAnneeApparition()-2);
            super.currentCooldown = 0;
            return super.damage;
        }
        else
        {
            super.currentCooldown += 1;
            return 0;
        }
    }
}
