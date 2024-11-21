import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Departement d1 = new Departement(1, "Informatique", 50);
        Departement d2 = new Departement(2, "Marketing", 30);
        Departement d3 = new Departement(3, "RH", 10);

        DepartementHashSet departementManager = new DepartementHashSet();
        departementManager.ajouterDepartement(d1);
        departementManager.ajouterDepartement(d2);
        departementManager.ajouterDepartement(d3);

        departementManager.displayDepartement();

        // Recherche d'un département par nom
        System.out.println(departementManager.rechercherDepartement("Informatique"));

        // Trier les départements par ID
        TreeSet<Departement> sortedDepartements = departementManager.trierDepartementById();
        sortedDepartements.forEach(System.out::println);
    }
}
