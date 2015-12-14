/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vn.pvhn.euler;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author Edison
 */
public class ID003_LargestPrimeFactor {
    public boolean isPrime(Long num) {
        BigInteger bi;
        try {
            bi = BigInteger.valueOf(num);
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
        ArrayList<Long> factorList = new ArrayList<>();
        try {
            for (long i = 2; i <= Math.sqrt(num); i++) {
                if ((num % i == 0) && isPrime(i)) {
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
    }
    
    public static void main(String[] args) {
        ID003_LargestPrimeFactor lpf = new ID003_LargestPrimeFactor();
        ArrayList<Long> factorList = lpf.getFactor(600851475143L);
        lpf.showArrayList(factorList);
    }
}
