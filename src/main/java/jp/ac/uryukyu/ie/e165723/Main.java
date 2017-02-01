package jp.ac.uryukyu.ie.e165723;

import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String arg[]) throws IOException {
        String name = new String("");
        System.out.println("名前を入力して下さい。:");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        if(name.equals(str)) {
            System.out.println("正しく文字を入力してください。");
        } else {
            System.out.println("文字の入力を確認しました。あなたの名前は" + str + "です。");
        }

        Map map = new Map();
        map.PrintMap();

        Player1 player1 = new Player1(map);


        if(player1.wallbreak == false){
            System.out.println( str + "は迷える子ひつじです。この迷宮から脱出しましょう!");
            System.out.println("動きたい方向の番号を key = の後ろに入力してください。");
        }else {
            System.out.println(str + "は巨人になったうちの一匹です街を破壊しながらウォールマリアを壊しましょう");
            System.out.println("動きたい方向の番号を key = の後ろに入力してください。");
        }

        while(!map.goal){
            player1.MovePlayer(map);
            System.out.print("\n\n\n\n\n\n\n");
            map.PrintMap();
        }
        if(player1.wallbreak == false){
            System.out.println("おめでとう君は迷宮から脱出することができたよ");
        }else {
            System.out.println("その日人類は思い出した。");
            System.out.println("ヤツらに支配されていた恐怖を...");
            System.out.println("鳥籠の中に囚われていた屈辱を...");
        }


    }
}
