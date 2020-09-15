/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.keramik;

/**
 *
 * @author user
 */
public class ProjectKeramik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Keramik A");
        HitungKeramik p1 = new HitungKeramik();
        p1.lantai = 1000000;
        p1.luas = 900;
        p1.box = 10;
        p1.harga = 54000;
        p1.LuasKeramik();
        p1.HargaKeramik();
        
        System.out.println("Keramik B");
        HitungKeramik p2 = new HitungKeramik();
        p2.lantai = 1000000;
        p2.luas = 1600;
        p2.lebar = 40;
        p2.box = 5;
        p2.harga = 65000;
        p2.LuasKeramik();
        p2.HargaKeramik();
        
        System.out.println("Keramik C");
        HitungKeramik p3 = new HitungKeramik();
        p3.lantai = 1000000;
        p3.luas = 1200;
        p3.box = 8;
        p3.harga = 60000;
        p3.LuasKeramik();
        p3.HargaKeramik();
    }   
    
}
