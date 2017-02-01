package jp.ac.uryukyu.ie.e165723;
import java.io.*;


/**
 * Created by e165723 on 2017/01/29.
 */
public class Player1 {
    boolean wallbreak = false;//壁を壊すプレイヤーの元


    public int row; //プレイヤーの位置（行）
    public int column; //プレイヤーの位置（列）

    //プレイヤーの初期化
    public Player1(Map map) {
        int i, j, rand;
        for (i = 0; i < map.height; i++) {
            for (j = 0; j < map.width; j++) {
                if (map.data[i][j] == map.PLAYER) {
                    row = i;
                    column = j;
                    break;
                }
            }
        }
        //1/4の確率でwallbreakのプレイヤーにする
        rand = (int)(Math.random()*4);
        if (rand == 0 ){
            wallbreak = true;

        }
    }
//遊ぶ人が上下左右に当てはめられた数字以外の文字を打った時にやり直す
    public void MovePlayer(Map map) {
        final int UP = 1; //上
        final int DOWN = 2; //下
        final int RIGHT = 3; //右
        final int LEFT = 4; //左
        int key;
        String buf;
        //clear();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("方向");
        System.out.println("1：上");
        System.out.println("2：下");
        System.out.println("3：右");
        System.out.println("4：左");
        do {
            System.out.print("key = ");
            try {
                buf = br.readLine();
                key = Integer.parseInt(buf);
            } catch (Exception e) {
                key = -1;
            }
        }
        while(key > 4 || key < 1);//keyが１〜４以外の時に繰り返す


        //プレイヤーの行動
        int[] player = new int[2];
        switch (key){
            case UP:
                player = map.Mover(row, column, -1, 0, wallbreak);
                break;
            case DOWN:
                player = map.Mover(row, column, 1, 0, wallbreak);
                break;
            case RIGHT:
                player = map.Mover(row, column, 0, 1, wallbreak);
                break;
            case LEFT:
                player = map.Mover(row, column, 0, -1, wallbreak);
                break;
        }
        row = player[0];
        column = player[1];
    }
}


