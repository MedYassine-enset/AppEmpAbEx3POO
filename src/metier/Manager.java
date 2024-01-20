package metier;

public class Manager extends Employe{
    private String service;

    public Manager() {

    }

    public Manager(String nom, String prenom, String email, String telephone, double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    @Override
    public double calculerSalire() {
        double salaireIng=salaire+salaire*0.2;
        return salaireIng;
    }

    @Override
    public String toString() {
        return super.toString()+
                "service='" + service + '\'' +
                ", salairemanager=" + calculerSalire()
                ;
    }
}
