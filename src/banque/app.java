package banque;

import java.util.ArrayList;

public class app {
    public static void main(String[] args) {
        ArrayList<CompteBancaire> comptes = new ArrayList<>();


        comptes.add(new CompteCourant(1, 1000.0, "mohamed", 500.0));
        comptes.add(new CompteEpargne(2, 2000.0, "hanan", 0.05));


        try {
            comptes.get(0).deposer(500.0);
            comptes.get(1).retirer(100.0);
            comptes.get(0).transferer(comptes.get(1), 200.0);
            comptes.get(0).transferer(comptes.get(1), 6000.0);
        } catch (FondsInsuffisantsException | CompteInexistantException e) {
            System.out.println(e.getMessage());
        }


        for (CompteBancaire compte : comptes) {
            compte.afficherSolde();
        }
    }
}
