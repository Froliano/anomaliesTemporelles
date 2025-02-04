import Agents.AgentInfiltre;
import Agents.AgentScientifique;
import Agents.AgentTechnologique;
import Facts.*;
import Enum.*;

public class Main
{
    public static void main(String[] args)
    {
        AgentInfiltre baba = new AgentInfiltre("baba", 5, 2020);
        AgentTechnologique sisi = new AgentTechnologique("simon", 2, 2033);
        AgentInfiltre alan = new AgentInfiltre("alan", 1, 2024);
        AgentScientifique matt = new AgentScientifique("mathis", 1, 2024);

        Anomalie karl = new Anomalie("attaque superflue", 2004, Dangerosite.bas);
        Anomalie mrDuflot = new Anomalie("Debout excuse toi", 1998, Dangerosite.Valentin);
        Anomalie gabin = new Anomalie("campagne BO2", 2005, Dangerosite.eleve);
        Anomalie andy = new Anomalie("destruction de la langue anglaise", 2005, Dangerosite.moyen);

        Mission karlouche = new Mission("abattre l'ennemi", karl, baba);
        Mission gabinou = new Mission("desinstallation", gabin, sisi);
        Mission andouille = new Mission("passer C2", andy, alan);

        karlouche.executerMission();

        gabinou.executerMission();

        andouille.setAgent(matt);
        andouille.executerMission();


    }
}
