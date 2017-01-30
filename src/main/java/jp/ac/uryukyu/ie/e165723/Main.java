package jp.ac.uryukyu.ie.e165723;

import java.io.IOException;

public class Main{

    public static void main(String arg[]) throws IOException {

        Map map = new Map();
        map.PrintMap();
        Player1 player1 = new Player1(map);


        if(player1.wallbreak == false){
            System.out.print("あなたは迷える子ひつじです。この迷宮から脱出しましょう");
        }else {
            System.out.println("あなたは巨人になったうちの一匹です街を破壊しながらウォールマリアを壊しましょう");
        }

        while(!map.goal){
            player1.MovePlayer(map);
            System.out.print("\n\n\n\n\n\n\n");
            map.PrintMap();
        }
        if(player1.wallbreak == false){
            System.out.print("おめでとう君は迷宮から脱出することができたよ");
        }else {
            System.out.println("その日人類は思い出した。");
            System.out.println("ヤツらに支配されていた恐怖を...");
            System.out.println("鳥籠の中に囚われていた屈辱を...");
        }


    }
}
