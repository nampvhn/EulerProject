/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vn.pvhn.euler;

import java.math.BigInteger;
import java.util.Vector;

/**
 *
 * @author Edison
 */
public class ID002_EvenFibonacciNumbers {
    // Recursion
    public BigInteger fiboTerm(int n) {
        BigInteger fibo = BigInteger.ZERO;
        try {
            if (n == 0) {
                return BigInteger.ONE;
            } else if (n == 1) {
                return BigInteger.valueOf(2);
            } else if (n >= 2) {
                return fiboTerm(n - 1).add(fiboTerm(n - 2));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return BigInteger.ZERO;
        }
        return fibo;
    }
    
    // List of fibo
    public Vector<BigInteger> fiboList(BigInteger maxNum) {
        Vector<BigInteger> v = new Vector<>();
        try {
            for (int i = 0; i < 35; i++) {
                if (fiboTerm(i).compareTo(maxNum) < 0) {
                    v.add(fiboTerm(i));
                } else {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return v;
    }
    
    // Sum of the even-valued terms
    public BigInteger sumOfFibo(Vector<BigInteger> v) {
        BigInteger sum = BigInteger.ZERO;
        try {
            for (BigInteger term : v) {
                if (term.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
                    sum = sum.add(term);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sum;
    }
    
    public void showVector(Vector<BigInteger> v) {
        for (BigInteger term : v) {
            System.out.print(term + " ");
        }
    }
    
    public static void main(String[] args) {
        ID002_EvenFibonacciNumbers efn = new ID002_EvenFibonacciNumbers();
        Vector<BigInteger> v = efn.fiboList(BigInteger.valueOf(4000000));
        efn.showVector(v);
        System.out.println();
        System.out.println("Sum: " + efn.sumOfFibo(v));
    }
}
