/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment2;

import java.util.Scanner;

/**
 *
 * @author namku
 */
public class Assigment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        soNguyenTo s = new soNguyenTo();
        Scanner in = new Scanner (System.in);
        s.n = in.nextInt();
        if(s.isSoNguyenTo(s.n)== true){
            System.out.println(s.n+ " La so nguyen to");
            System.out.println("So nguyen to lien sau "+ s.n + " la: "+ s.timSoNguyenToTiepTheo(s.n));
        }else System.out.println(s.n+ " Khong phai la so nguyen to");
        if (s.setN(s.n) == 0){
            System.out.println("Khong Set");
        }
    }
    
}
