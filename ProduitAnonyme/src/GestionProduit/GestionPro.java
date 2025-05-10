package GestionProduit;

import java.awt.*;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class GestionPro {
    public static void main(String[] args){
        LinkedList<Produit> produits=new LinkedList<>();
        System.out.println("Entrer nombre de Produit:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Entrer produit:");
            int id=sc.nextInt();
            String nom=sc.next();
            String Desc=sc.next();
            double Prix=sc.nextDouble();
            produits.add(new Produit(id,nom,Desc,Prix));
        }
        produits.sort(new Comparator<Produit>(){
            @Override
            public int compare(
                    Produit p1,Produit p2){
                return Double.compare(p1.Prix,p2.Prix);
            }
        });
        for(Produit p:produits){
            System.out.println(p.Id);
            System.out.println(p.nom);
            System.out.println(p.Desc);
            System.out.println(p.Prix);
        }

    }
}
