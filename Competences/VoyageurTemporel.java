package Competences;

public interface VoyageurTemporel
{
    public default void voyagerDansLeTemps(Integer anneeDestination)
    {
        System.out.println("vous voici dans l'annee " + anneeDestination);
    }
}
