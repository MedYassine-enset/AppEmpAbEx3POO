package metier;

public class Ingenieur extends Employe{
    private String specialite;

    public Ingenieur() {

    }

    public Ingenieur(String nom, String prenom, String email, String telephone, double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    @Override
    public double calculerSalire() {
        double salaireIng=salaire+salaire*0.15;
        return salaireIng;
    }

    @Override
    public String toString() {
        return super.toString()+
                " specialite='" + specialite+
                ", Salairecal="+calculerSalire();
    }
}
