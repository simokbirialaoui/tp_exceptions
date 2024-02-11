package banque;

public class CompteCourant extends CompteBancaire{
    private double decouvertAutorise;
    public CompteCourant(int numCompte, double solde, String nom,double  decouvertAutorise) {
        super(numCompte, solde, nom);
        this.decouvertAutorise = decouvertAutorise;
    }
}
