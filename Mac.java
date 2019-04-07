/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbolfikstur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author user
 */
public class Mac {
    static Random rand = new Random();
    
    public static void MacSimulasyon(ArrayList<Team> takimlar){
    ArrayList<Team> temp=(ArrayList<Team>) takimlar.clone();
    while(temp.size()>1){   
    Team a=temp.get(0);
    temp.remove(a);
    for (int d=0; d<temp.size(); d++){
    Team b=temp.get(d);
    int agol = getWeightedRandom(a.weight);
    int bgol = getWeightedRandom(b.weight);
    if ((agol)>(bgol)){
        a.galibiyet+=1; a.ygol+=bgol; b.ygol+=agol; a.agol+=agol; b.agol+=bgol; b.maglubiyet+=1;
        a.macsayisi+=1; b.macsayisi+=1;
    }else if ((bgol)>(agol)){
        b.galibiyet+=1; a.ygol+=bgol; a.agol=+agol; a.maglubiyet+=1; a.macsayisi+=1;
        b.macsayisi+=1;b.ygol+=agol;  b.agol+=bgol; 
    }else if((bgol)==(agol)){
        a.beraberlik+=1; b.beraberlik+=1; a.ygol+=bgol; a.agol+=agol; a.macsayisi+=1; 
        b.macsayisi+=1;b.ygol+=agol;  b.agol+=bgol; 
    }}
}
}

public static int getWeightedRandom(int weight) {
    int gol=0;
    int index = rand.nextInt(21);
    int[] sifiruc={0,0,0,0,0,0,1,1,1,1,1,2,2,2,2,3,3,3,4,4,5};
    int[] dortalti={0,0,1,1,1,1,2,2,2,2,3,3,3,3,3,4,4,4,4,5,5};
    int[] yedidokuz={0,1,1,2,2,2,3,3,3,3,4,4,4,4,4,5,5,5,5,5,5};
    if (0<=weight && weight<=3){
        gol=sifiruc[index];
    }else if(4<=weight && weight<=6){
        gol=dortalti[index];
    }else if((7<=weight && weight<=9)){
        gol=yedidokuz[index];
    }
    return gol;
}
  
 public static void FiksturYazdir(ArrayList<Team> takimlar){
     Collections.sort(takimlar, Comparator.comparing(Team::puanHesapla)); 
     Collections.reverse(takimlar);
     System.out.println(" \n");
     System.out.println("Takım                     |       OM     |"
             + "     G     |     B     |     M     |     AG     |     YG     |     AV     |     PS"); 
    for (int r = 0; r < takimlar.size(); r++)
    {
	for (int c = 0; c < 9; c++)
	{
		if(c==0){ System.out.print("    "+takimlar.get(r).name);}
                if(c==1){ System.out.print("                "+takimlar.get(r).macsayisi+"       ");}
                if(c==2){ System.out.print("       "+takimlar.get(r).galibiyet+"       ");}
                if(c==3){ System.out.print("       "+takimlar.get(r).beraberlik+"      ");}
                if(c==4){ System.out.print("       "+takimlar.get(r).maglubiyet+"      ");}
                if(c==5){ System.out.print("       "+takimlar.get(r).agol+"       ");}
                if(c==6){ System.out.print("       "+takimlar.get(r).ygol+"       ");}
                if(c==7){ System.out.print("       "+takimlar.get(r).avgHesapla()+"       ");} 
                if(c==8){ System.out.print("       "+takimlar.get(r).puanHesapla()+"       ");}
	}
           System.out.println(" "); 
    }
 
     
 }   
    
}
