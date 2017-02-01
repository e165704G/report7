package jp.ac.uryukyu.ie.e165723;

import java.io.IOException;
import java.util.Scanner;
import java.util.jar.Attributes;

public class Main {
    public static void main(String arg[])throws IOException {

        System.out.println("名前を入力して下さい。:");
        Scanner scan = new Scanner(System.in);
        String PlayerName;

        while (true) {
            PlayerName = scan.nextLine();
            if ("".equals(PlayerName)) {
                System.out.println("入力エラー：正しく文字を入力してください。");
                System.out.println("名前を入力して下さい。:");
            } else {
                System.out.println("文字の入力を確認しました。Playerの名前は" + PlayerName + "です。");
                break;
            }
        }

        Map map = new Map();
        map.PrintMap();

        Player1 player1 = new Player1(map);


        if (player1.wallbreak == false) {
            System.out.println( PlayerName +  "は迷える子ひつじです。この迷宮から脱出しましょう!");
            System.out.println( "動きたい方向の番号を key = の後ろに入力してください。");
        } else {
            System.out.println(PlayerName + "は巨人になったうちの一匹です街を破壊しながらウォールマリアを壊しましょう");
            System.out.println("動きたい方向の番号を key = の後ろに入力してください。");
        }

        while (!map.goal) {
            player1.MovePlayer(map);
            System.out.print("\n\n\n\n\n\n\n");
            map.PrintMap();
        }
        if (player1.wallbreak == false) {
            System.out.println("おめでとう" + PlayerName + "は迷宮から脱出することができたよ");
            System.out.println("(脱出END)");
        } else {
            System.out.println("その日人類は思い出した。");
            System.out.println("ヤツらに支配されていた恐怖を...");
            System.out.println("鳥籠の中に囚われていた屈辱を...");
            System.out.println("(巨人END)");
        }


    }
}

