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
public class HitungKeramik {
        /* buat attribut */
        int lantai;
        int luas;
        int lebar;
        int box;
        int harga;
        
        /* buat method */
        void LuasKeramik(){
            int luas;
            luas = this.luas * this.box;
            System.out.println("Luas total keramik " + luas + "cm^2");
        }
        
        void HargaKeramik(){
            int total;
            total = this.lantai / this.luas / this.box;
            System.out.println("box keramik: " + total + " box dengan harga Rp " + harga*total + ",00");
        }
}
