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
public class Factory {
    
    public static Student getStudent(String typeOfStudent){
    
           if (typeOfStudent == null){
               return null;
           }
           if (typeOfStudent.equalsIgnoreCase("ItStudent")){
               return new ItStudent();
           }else if (typeOfStudent.equalsIgnoreCase("ArtStudent")){
               return new ArtStudent();
           }else if (typeOfStudent.equalsIgnoreCase("EngStudent")){
               return new EngStudent();
           } else {
               return new ItStudent();
           }
    }
    
}
