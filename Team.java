/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbolfikstur;

/**
 *
 * @author user
 */
public class Team  {
    
    String name;
    int macsayisi, weight, galibiyet, beraberlik, maglubiyet, agol, ygol, avg, puan;

    public Team(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Team() {
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getGalibiyet() {
        return galibiyet;
    }

    public void setGalibiyet(int galibiyet) {
        this.galibiyet = galibiyet;
    }

    public int getBeraberlik() {
        return beraberlik;
    }

    public void setBeraberlik(int beraberlik) {
        this.beraberlik = beraberlik;
    }

    public int getMaglubiyet() {
        return maglubiyet;
    }

    public void setMaglubiyet(int maglubiyet) {
        this.maglubiyet = maglubiyet;
    }

    public int getAgol() {
        return agol;
    }

    public void setAgol(int agol) {
        this.agol = agol;
    }

    public int getYgol() {
        return ygol;
    }

    public void setYgol(int ygol) {
        this.ygol = ygol;
    }

    public int puanHesapla(){
        puan=(galibiyet*3+beraberlik);
        return puan;
    }
    public int avgHesapla(){
        avg=Math.abs(ygol-agol);
        return avg;
    }

    public int getMacsayisi() {
        return macsayisi;
    }

    public void setMacsayisi(int macsayisi) {
        this.macsayisi = macsayisi;
    }
    
    
    
    @Override
    public String toString() {
        return "Team{" + "name=" + name + ", weight=" + weight + ", galibiyet=" + galibiyet + ", beraberlik=" + beraberlik + ", maglubiyet=" + maglubiyet + ", agol=" + agol + ", ygol=" + ygol + ", avg=" + avg + ", puan=" + puan + '}';
    }

}
