/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dizzay
 */
public class No2 {

    public static void main(String args[]) {
        int[] arrAsc = {0, 1, 1, 8, 7};
        int limit = 3;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arrAsc.length; i++) {
            if (i < limit) {
                int add = arrAsc[i];
                System.out.println("Add : " + add);
                list.add(add);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Antrian " + (i + 1)+" = "+list.get(i));
        }
        System.out.println("Hapus antrian");
        System.out.println("Pilih Antrian tidak boleh lebihd dari "+list.size());
        Scanner scanner = new Scanner(System.in);
        int write = scanner.nextInt();
        if (write <= 3) {
            list.remove(write-1);
        }else {
            System.out.println("Pilih antrian dibawah atau sama dengan "+list.size());
        }
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Antrian " + (i + 1)+" = "+list.get(i));
        }
        System.out.println("Hapus antrian");
        System.out.println("Pilih Antrian tidak boleh lebihd dari "+list.size());
        write = scanner.nextInt();
        if (write <= 3) {
            list.remove(write-1);
        }else {
            System.out.println("Pilih antrian dibawah atau sama dengan "+list.size());
        }
        
        for (int i = 0; i < arrAsc.length; i++) {
            if (i >= limit) {
                int add = arrAsc[i];
                System.out.println("Add : " + add);
                list.add(add);
            }
        }
        
        System.out.println("Hasil akhir antrian setelah di tambah data sisa : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Antrian " + (i + 1)+" = "+list.get(i));
        }
    }
}
