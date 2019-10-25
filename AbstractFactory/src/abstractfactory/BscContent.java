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
public class BscContent implements Content{

    @Override
    public void view(String cData) {
        
        System.out.println("Bsc Course Content :" + cData);
    }
    
}
