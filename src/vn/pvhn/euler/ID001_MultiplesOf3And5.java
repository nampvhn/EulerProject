/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.pvhn.euler;

import java.util.ArrayList;

/**
 *
 * @author Edison
 */
public class ID001_MultiplesOf3And5 {

    public ArrayList<Integer> multiplesOfNum(int num1, int num2, int maxNum) {
        // List of numbers multiple 3 or 5
        ArrayList<Integer> list = new ArrayList<>();
        try {
            for (int i = 1; i < maxNum; i++) {
                if ((i % num1 == 0) || (i % num2 == 0)) {
                    list.add(i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void showArrayList(ArrayList<Integer> list) {
        for (Integer l : list) {
            System.out.print(l + " ");
        }
    }

    public int sumOfNums(ArrayList<Integer> list) {
        int sum = 0;
        try {
            if (!list.isEmpty()) {
                for (Integer l : list) {
                    sum += l;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sum;
    }

    public static void main(String[] args) {
        ID001_MultiplesOf3And5 m = new ID001_MultiplesOf3And5();
        ArrayList list = m.multiplesOfNum(3, 5, 1000);
        System.out.println("Sum of all the multiples of 3 or 5 below 1000: " + m.sumOfNums(list));
    }
}
