import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    private HashSet<Departement> departements;

    public DepartementHashSet() {
        this.departements = new HashSet<>();
    }

    // Ajouter un département
    @Override
    public void ajouterDepartement(Departement t) {
        departements.add(t);
    }

    // Rechercher un département par son nom
    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement dep : departements) {
            if (dep.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    // Rechercher un département
    @Override
    public boolean rechercherDepartement(Departement t) {
        return departements.contains(t);
    }

    // Supprimer un département
    @Override
    public void supprimerDepartement(Departement t) {
        departements.remove(t);
    }

    // Afficher tous les départements
    @Override
    public void displayDepartement() {
        Iterator<Departement> iterator = departements.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Trier les départements par id
    @Override
    public TreeSet<Departement> trierDepartementById() {
        return new TreeSet<>((d1, d2) -> Integer.compare(d1.getId(), d2.getId()));
    }
}