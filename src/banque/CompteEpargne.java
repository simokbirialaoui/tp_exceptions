package banque;

public class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    public CompteEpargne(int numCompte, double solde, String nom, double tauxInteret) {
        super(numCompte, solde, nom);
        this.tauxInteret = tauxInteret;

    }
}
