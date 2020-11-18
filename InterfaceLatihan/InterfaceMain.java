/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceLatihan;
import InterfaceLatihan.ICumlaude;
import InterfaceLatihan.Mahasiswa;
import InterfaceLatihan.PascaSarjana;
import InterfaceLatihan.Rektor;

/**
 *
 * @author ASUS
 */
public class InterfaceMain {
        public static void main(String[] args) {
        Rektor pekrektor = new Rektor();
        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
//        pekrektor.beriSertifikatCumlaude mhsBiasa);
        sarjanaCumlaude.kuliahDiKampus();
        pekrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pekrektor.beriSertifikatCumlaude(masterCumlaude);
        
    }
}
