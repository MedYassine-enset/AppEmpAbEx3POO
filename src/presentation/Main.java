package presentation;

import metier.Employe;
import metier.Ingenieur;

public class Main {
    public static void main(String[] args) {
        Employe e1 =new Ingenieur("n1","p1","n1@gmail.com","0258885",20000,"ing");
        System.out.println(e1);
        Employe e2 =new Ingenieur("n2","p2","n2@gmail.com","0256955",20000,"IT");
        System.out.println(e2);
    }
}