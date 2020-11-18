/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceLatihan.Tugas;

/**
 *
 * @author ASUS
 */
public class MainTugas {
    
    public static void main(String[] args) {
        Singa s = new Singa("Ini Singa", 4, "grarrr-grarrr", "Orange Belang Hitam");
        Keledai k = new Keledai("Ini Keledai", 4, "Hehehehe", "Abu - Abu");
        Gorila g = new Gorila("Ini Gorila", 2, "Haauumm haauumm", "Hitam Manis");
        s.displayMakan();
        s.displayBinatang();
        s.displayData();
        System.out.println("");
        k.displayMakan();
        k.displayBinatang();
        k.displayData();
        System.out.println("");
        g.displayMakan();
        g.displayBinatang();
        g.displayData();
        System.out.println("");
    }
}


