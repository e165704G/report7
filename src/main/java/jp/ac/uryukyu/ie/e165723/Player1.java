package jp.ac.uryukyu.ie.e165723;
import java.io.*;
/**
 * Created by e165723 on 2017/01/29.
 */
public class Player1 {
    public int row; //プレイヤーの位置（行）
    public int column; //プレイヤーの位置（列）

    //プレイヤーの初期化
    public Player1(Map map) {
        int i, j;
        for (i = 0; i < map.height; i++) {
            for (j = 0; j < map.width; j++) {
                if (map.data[i][j] == map.ENTRANCE) {
                    row = i;
                    column = j;
                    break;
                }
            }
        }
    }

    public void MovePlayer() {
        int key;
        String buf;
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
        }while(key > 4 || key < 1);
    }
}
