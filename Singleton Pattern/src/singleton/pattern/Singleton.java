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
public class Singleton {

    private static Singleton aSingleton;
    private String data;

    private Singleton() {

    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

  public static Singleton getSingleton (){
      
      if (aSingleton == null) 
          aSingleton = new Singleton();
          
      return aSingleton;
  }
}
