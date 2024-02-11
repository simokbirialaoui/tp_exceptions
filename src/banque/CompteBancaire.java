package banque;

public class CompteBancaire {
    private int numCompte;
    private double solde;
    private String nom;

    public CompteBancaire(int numCompte, double solde, String nom) {
        this.numCompte = numCompte;
        this.solde = solde;
        this.nom = nom;
    }

    public int getNumCompte() {
        return numCompte;
    }

    public double getSolde() {
        return solde;
    }

    public String getNom() {
        return nom;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void deposer(double argent) {
        solde = solde + argent;
    }

    public void retirer(double argent) throws FondsInsuffisantsException {
        if (solde<argent) throw new FondsInsuffisantsException("fonds insuffisants");
        solde = solde - argent;
    }

    public void afficherSolde() {
        System.out.println("votre solde est " + solde);

    }

    public void transferer(CompteBancaire autreCompte, double montant) throws FondsInsuffisantsException, CompteInexistantException {
        if (montant > this.solde) {
            throw new FondsInsuffisantsException("Solde insuffisant pour effectuer le transfert.");
        }
        if (autreCompte == null) {
            throw new CompteInexistantException("Compte destinataire inexistant.");
        }
        this.retirer(montant);
        autreCompte.deposer(montant);
    }

}
