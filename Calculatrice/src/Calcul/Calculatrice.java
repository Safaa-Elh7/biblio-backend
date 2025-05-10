package Calcul;

public class Calculatrice {
    public int A;
    public int B;
    public Calculatrice(int A, int B) {
        this.A= A;
        this.B= B;
    }
    public double addition(){
        return A + B ;
    }
    public double soustraction(){
        return A - B ;
    }
    public double multiplication(){
        return A * B ;
    }
    public double division(){
        if (B==0){
            throw new ArithmeticException("Erreur ");
        }
        return A / B ;
    }




}
