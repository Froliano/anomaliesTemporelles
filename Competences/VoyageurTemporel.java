package Competences;

public interface VoyageurTemporel
{

    Integer cooldown = 4;
    Integer damage = 5;

    public default void voyagerDansLeTemps(Integer anneeDestination)
    {
        System.out.println("vous voici dans l'annee " + anneeDestination);
    }
}
