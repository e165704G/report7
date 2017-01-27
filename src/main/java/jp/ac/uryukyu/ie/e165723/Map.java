package jp.ac.uryukyu.ie.e165723;

/**
 * Created by e165704 on 2017/01/24.
 */
public class Map {
        int width; //迷路の横の大きさ
        int height; //迷路の縦の大きさ
        int[][] data;//実際の迷路データ

        public static final byte PATH = 0; //通路
        public static final byte WALL = 1; //壁
        public static final byte ENTRANCE = 2; //入り口
        public static final byte EXIT = 3; //出口

        public Map(){
                width = 9; //迷路の横幅は９
                height = 6; //迷路の縦幅は６
                data = new int[height][];
                data[0] = new int[]{2, 1, 0, 1, 0, 1, 0, 0, 0};  // 0 は 通路
                data[1] = new int[]{0, 1, 0, 0, 0, 0, 0, 1, 0};  // 1 は 壁
                data[2] = new int[]{0, 1, 0, 1, 0, 1, 0, 1, 0};  // 2 は 入口
                data[3] = new int[]{0, 0, 0, 1, 0, 1, 0, 1, 0};  // 3 は 出口
                data[4] = new int[]{0, 1, 1, 1, 0, 1, 0, 1, 0};
                data[5] = new int[]{0, 0, 0, 0, 1, 0, 0, 1, 3};

        }

        public void PrintMap(){
                int i, j;
                for(i=0; i<height; i++){
                        for(j=0; j<width; j++){
                                System.out.print(data[i][j]);
                        }
                        System.out.println();
                }
        }
}

