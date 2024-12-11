import java.util.HashMap;
import java.util.Map;

public class AffectationHashMap {
    private Map<Employe, Departement> affectations;

    public AffectationHashMap() {
        this.affectations = new HashMap<>();
    }

    // Ajouter un employé à un département
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e)) {
            System.out.println("L'employé est déjà affecté à un département.");
        } else {
            affectations.put(e, d);
        }
    }

    // Afficher tous les employés et leurs départements
    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println(entry.getKey() + " est affecté au département " + entry.getValue());
        }
    }

    // Supprimer un employé de la collection
    public void supprimerEmploye(Employe e) {
        affectations.remove(e);
    }

    // Supprimer un employé d'un département spécifique
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
        }
    }

    // Afficher la liste des employés
    public void afficherEmployes() {
        for (Employe e : affectations.keySet()) {
            System.out.println(e);
        }
    }

    // Afficher la liste des départements
    public void afficherDepartements() {
        for (Departement d : affectations.values()) {
            System.out.println(d);
        }
    }

    // Rechercher un employé dans la collection
    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    // Rechercher un département dans la collection
    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    // Trier la collection par identifiant d'employé (TreeMap)
    public Map<Employe, Departement> trierMap() {
        return new TreeMap<>(affectations);
    }
}
