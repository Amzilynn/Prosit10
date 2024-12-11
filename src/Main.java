public class Main {
    public static void main(String[] args) {
        // Create departments
        Departement dep1 = new Departement(1, "Informatique", 10);
        Departement dep2 = new Departement(2, "Ressources Humaines", 5);

        // Create employees
        Employe emp1 = new Employe(101, "Alice");
        Employe emp2 = new Employe(102, "Bob");

        // Create the AffectationHashMap instance
        AffectationHashMap affectation = new AffectationHashMap();

        // Add employees to departments
        affectation.ajouterEmployeDepartement(emp1, dep1);
        affectation.ajouterEmployeDepartement(emp2, dep2);

        // Display employees and their departments
        affectation.afficherEmployesEtDepartements();

        // Try to assign the same employee to two departments
        affectation.ajouterEmployeDepartement(emp1, dep2); // Should show an error

        // Display employees and departments again
        affectation.afficherEmployesEtDepartements();

        // Remove an employee
        affectation.supprimerEmploye(emp1);
        affectation.afficherEmployesEtDepartements();
    }
}
