/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum04062026;

/**
 *
 * @author asus-
 */
public  class Keybord extends AlatMusik implements BisaDinyalakan {
  private boolean dayaTersambung;

    public Keybord(boolean dayaTersambung, String nama, String jenis) {
        super(nama, jenis);
        this.dayaTersambung = dayaTersambung;
    }
    
    @Override
    public void mainkan() {
        System.out.println(nama+" dimainkan dengan menekan tuts.");
    }

    @Override
    public void stem() {
        System.out.println("Keyboard "+nama+" distem digital dengan aplikasi");
    }

    @Override
    public void nyalakan() {
        if(ceklistrik()){
            System.out.println(nama+" dinyalakan");
        }else{
            System.out.println(nama+" tidak ada daya");
        }
    }

    @Override
    public void matikan() {
        System.out.println(nama+"matikan");
    }

    @Override
    public boolean ceklistrik() {
        return dayaTersambung;
    }
    
}
