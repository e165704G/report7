package jp.ac.uryukyu.ie.e165723;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by e165723 on 2017/01/31.
 */
public class MapTest {
    /**
     * 「mapが正しく表示される」ことを確認。
     *
     * @throws Exception
     */
    @Test
    public void Map() throws Exception {
        int width; //迷路の横の大きさ
        int height; //迷路の縦の大きさ
        int[][] data;//実際の迷路データ
        final byte PATH = 0; //通路
        final byte WALL = 1; //壁
        final byte PLAYER = 2; //入り口
        final byte EXIT = 3; //出口

        width = 11; //迷路の横幅は11
        height = 8; //迷路の縦幅は8
        data = new int[height][];
        data[0] = new int[]{1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        data[1] = new int[]{1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1};  // 0 は 通路
        data[2] = new int[]{1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1};  // 1 は 壁
        data[3] = new int[]{1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1};  // 2 は 入口
        data[4] = new int[]{1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1};  // 3 は 出口
        data[5] = new int[]{1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1};
        data[6] = new int[]{1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1};
        data[7] = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1};

        int i, j;
        for (i = 0; i < height; i++) {
            for (j = 0; j < width; j++) {
                switch (data[i][j]) {
                    case PATH:
                        System.out.print("　");
                        break;
                    case WALL:
                        System.out.print("＃");
                        break;
                    case PLAYER:
                        System.out.print("Ｐ");
                        break;
                    case EXIT:
                        System.out.print("Ｇ");
                        break;
                }
            }
            System.out.println();
        }

    }
}