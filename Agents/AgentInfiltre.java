package Agents;

import Competences.ExpertEnDiscretion;
import Enum.Statut;
import Facts.Anomalie;

public class AgentInfiltre extends AgentsTemporels implements ExpertEnDiscretion
{
    public AgentInfiltre(String nom, Integer niveauExp, Integer anneeRecrutement, Integer id)
    {
        super(nom, niveauExp, anneeRecrutement, id);
        super.cooldown = ExpertEnDiscretion.cooldown;
        super.currentCooldown = super.cooldown;
        super.damage = ExpertEnDiscretion.damage;
    }

    @Override
    public Integer executerMission(Anomalie anomalie)
    {
        if (capacityIsUsable())
        {
            seFondreDansLeDecor();
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
