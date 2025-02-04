package Agents;

import Competences.HackeurTemporel;
import Facts.Anomalie;
import Enum.Statut;

public class AgentTechnologique extends AgentsTemporels implements HackeurTemporel
{
    public AgentTechnologique(String nom, Integer niveauExp, Integer anneeRecrutement, Integer id)
    {
        super(nom, niveauExp, anneeRecrutement, id);
        super.cooldown = HackeurTemporel.cooldown;
        super.currentCooldown = super.cooldown;
        super.damage = HackeurTemporel.damage;
    }

    @Override
    public Integer executerMission(Anomalie anomalie)
    {
        if (capacityIsUsable())
        {
            piraterSysteme(anomalie.getDescription());
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
