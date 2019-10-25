/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.pattern;

/**
 *
 * @author MoHammeD
 */
public class SingletonPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Singleton aSingleton1 = Singleton.getSingleton();
        aSingleton1.setData("The First Variable");
        
        Singleton aSingleton2 = Singleton.getSingleton();
        aSingleton2.setData("The Second Variable");
        
        
        System.out.println(aSingleton1.getData());
        System.out.println(aSingleton2.getData());
    }
    
}
