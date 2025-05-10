package Biblio;

public class Main {
    public static void main(String[] args) {
        LivreRoman L = new LivreRoman("dsdfdcx","dcdyfd",2020,true,"ddffff");
        Magazine M = new Magazine("sdcdsc","fvgfds",2022,false,11111,"ertzhgf");
        L.afficher();
        System.out.println(L.emprunter());
        System.out.println(L.retourner());
        M.afficher();

        System.out.println(M.emprunter());

        System.out.println(M.retourner());

    }
}
