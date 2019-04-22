/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment2;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author namku
 */
public class soNguyenTo {
      public int n;
     public boolean isSoNguyenTo(int n)
{
    if (n < 2)    
        return false;

    for (int i = 2; i <= sqrt((float)n); i ++)
    {
        if (n%i==0)
        {
            return false;
        }
    }
    return true;
}
     public int timSoNguyenToTiepTheo(int n){
         n=n+1;
        while(isSoNguyenTo(n) == false){
            n++;
            if (isSoNguyenTo(n)== true) {
                return n;
            }
            break;
        }
          return n;
     }
     public int getN() {
        return n;
    }

    public int setN(int n) {
        if (isSoNguyenTo(n) == true) {
            this.n = n;
        }else return 0;
          return 0;
        
    }

    
    
}

