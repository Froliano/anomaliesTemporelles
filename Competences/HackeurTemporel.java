package Competences;

public interface HackeurTemporel
{
    public default void piraterSysteme(String cible)
    {
        System.out.println(cible + " inactif");
    }
}
