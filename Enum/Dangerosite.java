package Enum;

public enum Dangerosite
{
    BAS(6),
    MOYEN(10),
    ELEVE(15),
    VALENTIN(20);

    private final Integer vie;

    // Constructeur privé
    Dangerosite(int niveau)
    {
        this.vie = niveau;
    }

    public int getVie()
    {
        return vie;
    }

}
