/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbolfikstur;

import java.util.*;

/**
 *
 * @author user
 */
public class FutbolFikstur {
    
  static ArrayList<Team> takimlar = new ArrayList<>();
   static Scanner input = new Scanner(System.in);
   static Random rand = new Random();
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Takım eklemek istiyor musunuz? (e/h)");
        String mesaj = input.nextLine();
        while (mesaj.equalsIgnoreCase("e")){
            TakimOlustur();
            System.out.println("Takım eklemek istiyor musunuz? (e/h)");
            mesaj = input.nextLine();
        }
        
        System.out.println("Tüm takımlar eklendi.");
        
        System.out.println("Ev sahibi maçlar oynanıyor...");
        Match.MacSimulasyon(takimlar);
        System.out.println("Deplasmandaki maçlar oynayor...");
        Match.MacSimulasyon(takimlar);
        
        Match.FiksturYazdir(takimlar);
        takimlar.clear();
    }
    
public static void TakimOlustur(){
    System.out.print("Takım giriniz:");
        String isim = input.nextLine();
        System.out.print("Ağırlık ayarlanıyor...");
        int agirlik = rand.nextInt(10);
        Team yeni = new Team (isim, agirlik);
        takimlar.add(yeni);
        System.out.println("Ekleme tamamlandı!");
        
}


    
}
