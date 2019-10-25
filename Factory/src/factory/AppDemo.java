/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author MoHammeD
 */
public class AppDemo {
    public static void main(String[] args) {
        
        Student std1 = Factory.getStudent("itStudent");
        std1.showData();
        
        Student std2 = Factory.getStudent("EngStudent");
        std2.showData();
        
        Student std3 = Factory.getStudent("ArtStudent");
        std3.showData();
    }
}
