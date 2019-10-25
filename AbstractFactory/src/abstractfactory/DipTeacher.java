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
public class DipTeacher implements Teacher {

    @Override
    public void view(String hData) {
        System.out.println("Dip Course Teacher: " + hData);
    }

}
