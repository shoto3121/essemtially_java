/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.chapter1;

/**
 *
 * @author guest1Day
 */
public class number_hit_game {
    public static void main (String[]args){
        System.out.println("【数あてゲーム】");
        int ans =new java.util.Random().nextInt(10);
        for(int i=0;i<5;i++){
            System.out.print("0～9の数字を入力してください");
            int num =new java.util.Scanner(System.in).nextInt();
            if(num==ans){
                System.out.println("アタリ！");
                break;
            }else
                System.out.println("違います");
        }
                System.out.print("ゲームを終了します。");
    }
}
