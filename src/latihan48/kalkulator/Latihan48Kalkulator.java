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
public class Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.setValue1(7);
        kalkulator.setValue2(5);
        kalkulator.setNameProject();
        kalkulator.setNoteProject("This project shown you how to manage method in java");
        System.out.println("Result Add is = " + kalkulator.add(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result Minus is = " + kalkulator.minus(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result Multiple is = " + kalkulator.multiplication(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result Division is = " + kalkulator.division(kalkulator.getValue1(), kalkulator.getValue2()));
    }
}
