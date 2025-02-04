package Competences;

public interface HackeurTemporel
{
    Integer cooldown = 2;
    Integer damage = 3;

    public default void piraterSysteme(String cible)
    {
        System.out.println(cible + " inactif");
    }
}
