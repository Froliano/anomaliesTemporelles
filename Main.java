import Agents.AgentInfiltre;
import Agents.AgentScientifique;
import Agents.AgentTechnologique;
import Facts.*;
import Enum.*;

public class Main
{
    public static void main(String[] args)
    {
        AgentInfiltre baba = new AgentInfiltre("baba", 5, 2020, 1);
        AgentTechnologique sisi = new AgentTechnologique("simon", 2, 2033, 2);
        AgentInfiltre alan = new AgentInfiltre("alan", 1, 2024, 3);
        AgentScientifique matt = new AgentScientifique("mathis", 1, 2024, 4);

        Anomalie karl = new Anomalie("attaque superflue", 2004, Dangerosite.BAS);
        Anomalie mrDuflot = new Anomalie("Debout excuse toi", 1998, Dangerosite.VALENTIN);
        Anomalie gabin = new Anomalie("campagne BO2", 2005, Dangerosite.ELEVE);
        Anomalie andy = new Anomalie("destruction de la langue anglaise", 2005, Dangerosite.MOYEN);

        Mission karlouche = new Mission("abattre l'ennemi", karl, baba, sisi);
        Mission gabinou = new Mission("desinstallation", gabin, sisi, alan);
        Mission andouille = new Mission("passer C2", andy, matt, alan);

        karlouche.executerMission();

        gabinou.executerMission();

        andouille.setAgent(alan, baba);
        andouille.executerMission();


    }
}
