/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pvhn.jv.euler;

import java.util.Vector;

/**
 *
 * @author Edison
 */
public class EvenFibonacciNumbers {
    public long fiboTerm(int n) {
        long fibo = 0;
        try {
            if (n == 0) {
                return 1;
            } else if (n == 1) {
                return 2;
            } else if (n >= 2) {
                return fiboTerm(n - 1) + fiboTerm(n - 2);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return fibo;
    }
    
    public Vector<Long> fiboList(long maxNum) {
        Vector<Long> v = new Vector<Long>();
        try {
            for (int i = 0; i < 35; i++) {
                if (fiboTerm(i) < maxNum) {
                    v.add(fiboTerm(i));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return v;
    }
    
    public long sumOfFibo(Vector<Long> v) {
        long sum = 0;
        try {
            for (Long term : v) {
                if (term % 2 == 0) {
                    sum += term;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sum;
    }
    
    public void showVector(Vector<Long> v) {
        for (Long term : v) {
            System.out.print(term + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        EvenFibonacciNumbers efn = new EvenFibonacciNumbers();
        long fibo = efn.fiboTerm(31);
        System.out.println("fibo(31) = " + fibo);
        Vector<Long> v = efn.fiboList(4000000);
        efn.showVector(v);
        System.out.println("Sum of the even-valued terms in the Fibonacci sequence whose values do not exceed four million: " + efn.sumOfFibo(v));
    }
}
