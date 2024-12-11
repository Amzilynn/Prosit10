public class Departement {
    private int id;
    private String nom;
    private int nombreEmployes;

    public Departement(int id, String nom, int nombreEmployes) {
        this.id = id;
        this.nom = nom;
        this.nombreEmployes = nombreEmployes;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    @Override
    public String toString() {
        return "Département{id=" + id + ", nom='" + nom + "', nombreEmployes=" + nombreEmployes + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Departement that = (Departement) obj;
        return id == that.id && nom.equals(that.nom);
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
