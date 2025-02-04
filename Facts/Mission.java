package Facts;

import Agents.*;
import Enum.Statut;

import java.util.ArrayList;
import java.util.List;

public class Mission
{
    private String titre;
    private Anomalie anomalie;
    private List<AgentsTemporels> agents = new ArrayList<>();

    public Mission(String titre, Anomalie anomalie, AgentsTemporels agent1, AgentsTemporels agent2)
    {
        this.titre = titre;
        this.anomalie = anomalie;
        this.agents.add(agent1);
        if (!agent1.equals(agent2))
        {
            this.agents.add(agent2);
        }
    }

    public void executerMission()
    {
        Integer degats = 0;
        if (anomalie.getStatut() == Statut.non_resolue)
        {
            anomalie.setStatut(Statut.en_cours_de_resolution);
        }
        for (AgentsTemporels agent : agents)
        {
            Integer degat = agent.executerMission(anomalie);
            if (degats == 0)
            {
                degats = degat;
            }
            else
            {
                degats *= degat;
            }
        }
        System.out.println(degats);
        anomalie.takeDamage(degats);
        if (!anomalie.isAlive())
        {
            anomalie.setStatut(Statut.resolue);

        }
    }

    public void setAgent(AgentsTemporels ancienAgent, AgentsTemporels newAgent)
    {
        AgentsTemporels a = null;
        for (AgentsTemporels agent : agents)
        {
            if (ancienAgent.equals(agent))
            {
                a = agent;
            }
            if (agent.equals(newAgent))
            {
                return;
            }
        }
        if (a != null)
        {
            a = newAgent;
            System.out.println("changement de l'agent : " + ancienAgent.getNom() + ", par l'agent : " + newAgent.getNom());
        }

    }

    public String getTitre() {
        return titre;
    }

    public Anomalie getAnomalie() {
        return anomalie;
    }
}
