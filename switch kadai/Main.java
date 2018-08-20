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
public class Main{
    public static void main(String[]args){
        System.out.println("[メニュー]1:検索2:登録3:削除4:変更");
        int selected = new java.util.Scanner(System.in).nextInt();
        switch(selected){
            case 1:
                System.out.print("検索します");
                break;
            case 2:
                System.out.print("登録します");
                break;
            case 3:
                System.out.print("削除します");
                break;
            case 4:
                System.out.print("変更します");
                break;
        }
    }
}
