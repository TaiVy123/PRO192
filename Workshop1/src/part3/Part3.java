/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part3;

import java.util.Scanner;

/**
 *
 * @author taing
 */
public class Part3 {

    public static void main(String[] args) {
        String[] list = new String[3];
        for (int i = 0; i < list.length; i++) {
            Scanner sc = new Scanner(System.in);
            list[i] = sc.nextLine();
            list[i] = list[i].trim();// remove banlk
        }
        for (int i = 0; i < list.length; i++) {
            String name = list[i];
            String temp = "";
            for (int j = 0; j < name.length(); j++) {
                char c = name.charAt(j);
                String s = (c + "");
                if (j == 0 || (j > 0 && name.charAt(j - 1) == ' ')) {
                    s = s.toUpperCase();
                } else {
                    s = s.toLowerCase();
                }
                temp = temp + s;
            }
            list[i] = temp;
        }
        System.out.println("Danh sách: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
