package Competences;

public interface ExpertEnDiscretion
{
    Integer cooldown = 2;
    Integer damage = 2;

    public default void seFondreDansLeDecor()
    {
        System.out.println("pououou je suis invisible");
    }
}
