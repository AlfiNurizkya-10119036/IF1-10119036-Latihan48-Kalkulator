/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan48.kalkulator;

/**
 *
 * @author Alfi Nurizkya
 * Nama     : Alfi Nurizkya
 * NIM      : 10119036
 * Kelas    : IF-1
 * Deskripsi Program : Program Membuat Kalkulator
 */
public class Kalkulator {

    private double value1, value2;

    public double getValue1() {
        return value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
        System.out.println("VALUE 1 = "+ value1);
    }

    public void setValue2(double value2) {
        this.value2 = value2;
        System.out.println("VALUE 2 = "+ value2);
    }

    public void setNameProject(){
        System.out.println("Project Calculator");
    }

    public void setNoteProject(String note){
        System.out.println(note);
    }

    public double add(double val1, double val2){
        return val1 + val2;
    }

    public double minus(double val1, double val2){
        return val1 - val2;
    }

    public double multiplication(double val1, double val2){
        return val1 * val2;
    }

    public double division(double val1, double val2){
        return val1 / val2;
    }

}