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
public class Keledai extends Binatang implements IHerbivora {

    private String suara;
    private String warnaBulu;

    public Keledai(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Kedelai Merupakan Pemakan Tumbuhan");
    }

    @Override
    public void displayBinatang() {
        System.out.println("Nama : " + super.nama);
        System.out.println("Jumlah Kaki : " + super.jmlKaki);
    }

    public void displayData() {
        System.out.println("Suara : " + this.suara);
        System.out.println("Warna Bulu : " + this.warnaBulu);
    }

}
