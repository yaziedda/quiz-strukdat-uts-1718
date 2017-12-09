/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Dizzay
 */
public class No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int[] arrAsc = {0, 1, 1, 8, 7};
        System.out.println("ASCENDING INSERTION SORT");
        System.out.print("ASCENDING INPUT : ");
        for (int i : arrAsc) {
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println("\n");
        int[] afterSortAsc = insertionAsc(arrAsc);
        System.out.print("\nASCENDING OUTPUT : ");
        for (int i : afterSortAsc) {
            System.out.print(i);
            System.out.print(", ");
        }

        int[] arrDesc = {0, 1, 1, 8, 7};
        System.out.println("\n\nDESCENDING INSERTION SORT");
        System.out.print("DESCENDING INPUT : ");
        for (int i : arrDesc) {
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println("\n");
        int[] afterSortDesc = insertionDesc(arrDesc);
        System.out.print("DESCENDING OUTPUT : ");
        for (int i : afterSortDesc) {
            System.out.print(i);
            System.out.print(", ");
        }
    }

    public static int[] insertionAsc(int[] input) {
        int temp;
        
        // ITERASI ARRAY yang sudah di tentukan
        for (int i = 0; i < input.length; i++) {
            // iterasi array decrement, nilai aja j itu dari index yang sedang array iterasi
            for (int j = i; j > 0; j--) {
                int inputJ = input[j];
                int inputJMin = input[j - 1];
                System.out.println("Compare : " + inputJMin + " < " + inputJ);
                // inputJ adalah nilai array dari looping yang di decrement array index tersebut
                // sedangn inputJMin adalah index inputJ di ambil 1 ( - 1)
                if (inputJ < inputJMin) {
                    // proses untuk memindahkan perbandingan bila inputJ kurang dari inputJMin
                    temp = input[j];
                    System.out.println("Move " + temp);
                    input[j] = input[j - 1];
                    System.out.println("To " + input[j]);
                    input[j - 1] = temp;
                }
            }
        }
        return input;
    }

    public static int[] insertionDesc(int[] input) {
        int temp;
        // ITERASI ARRAY yang sudah di tentukan
        for (int i = 0; i < input.length; i++) {
            // iterasi array decrement, nilai aja j itu dari index yang sedang array iterasi
            for (int j = i; j > 0; j--) {
                int inputJ = input[j];
                int inputJMin = input[j - 1];
                System.out.println("Compare : " + inputJMin + " > " + inputJ);
                // inputJ adalah nilai array dari looping yang di decrement array index tersebut
                // sedangn inputJMin adalah index inputJ di ambil 1 ( - 1)
                if (inputJ > inputJMin) {
                    // proses untuk memindahkan perbandingan bila inputJ lebih dari inputJMin
                    temp = input[j];
                    System.out.println("Move " + temp);
                    input[j] = input[j - 1];
                    System.out.println("To " + input[j]);
                    input[j - 1] = temp;
                }
            }
        }
        return input;
    }

}
