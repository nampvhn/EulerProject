/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pvhn.jv.euler;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author Edison
 */
public class LargestPrimeFactor {
    public boolean isPrime(Long num) {
        BigInteger bi;
        try {
            bi = new BigInteger(Long.toString(num));
            if (bi.isProbablePrime(1)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<Long> getFactor(long num) { // Except 1 & itself
        ArrayList<Long> factorList = new ArrayList<Long>();
        try {
            for (long i = 2; i <= Math.sqrt(num); i++) {
                if ((num % i == 0) && ((new BigInteger(Long.toString(i))).isProbablePrime(1))) {
                    factorList.add(i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return factorList;
    }
    
    public void showArrayList(ArrayList<Long> list) {
        for (Long l : list) {
            System.out.print(l + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        LargestPrimeFactor lpf = new LargestPrimeFactor();
        ArrayList<Long> factorList = lpf.getFactor(600851475143L);
        lpf.showArrayList(factorList);
    }
}
