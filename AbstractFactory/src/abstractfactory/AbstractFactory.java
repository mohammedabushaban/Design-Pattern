/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author MoHammeD
 */
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Course aCourse1 = Course.getaCourse();
        aCourse1.setaDegree(new BscDegree());
        aCourse1.view("SW Engineering 2", "Introduces design patterns ...", "MoHammeD Abu Shaban");

    }

}
