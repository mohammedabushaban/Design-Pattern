/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author MoHammeD
 */
public class Grading {

    private Student aStudent;

    public void setaStudent(Student aStudent) {
        this.aStudent = aStudent;
    }

    public Grading(Student aStudent) {
        this.aStudent = aStudent;
    }

    public double computeGrade(int mid, int lab, int fin) {
        return this.aStudent.calcGrade(mid, lab, fin);
    }

}
