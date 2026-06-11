/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum04062026;

/**
 *
 * @author asus-
 */
public class MainAlatMusik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gitar gitar = new Gitar(6,"Gitar Klasik","Petik");
        Keybord keybord = new Keybord(true,"Yamaha POR","Elektronik");
        
        System.out.println("----------info Gitar------------");
        gitar.info();
        gitar.mainkan();
        gitar.stem();
        
        
        System.out.println("\n----------info Keybord----------");
        keybord.info();
        keybord.nyalakan();
        keybord.mainkan();
        keybord.stem();
        keybord.matikan();
        
    }
    
}
