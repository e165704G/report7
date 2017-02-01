package jp.ac.uryukyu.ie.e165704;

public class Map {

        int width; //迷路の横の大きさ
        int height; //迷路の縦の大きさ
        int[][] data;//実際の迷路データ
        boolean goal = false;

        public static final byte PATH = 0; //通路
        public static final byte WALL = 1; //壁
        public static final byte PLAYER = 2; //入り口
        public static final byte EXIT = 3; //出口
        //マップの中身
        public Map(){
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
        }
        //配列の中の数字に実際に表示させたい文字を出す

        public void PrintMap(){
                int i, j;
                for(i=0; i<height; i++){
                        for(j=0; j<width; j++){
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
        //playerクラスの動いた時の処理
        public int[] Mover(int row, int column, int y, int x , boolean wallbreak){
                //dataの範囲外なら終了
                int[] player = {row, column};
                if((row+y)<0 || (row+y)>height || (column+x)<0 || (column+x)>width){
                }
                //Player1でこの動きを呼び出すため
                if(data[row + y][column + x] == EXIT) {
                        data[row + y][column + x] = PLAYER;
                        data[row][column] = PATH;
                        goal = true;
                }
                if((data[row + y][column + x] == PATH)||(wallbreak)){
                        data[row + y][column + x] = PLAYER;
                        data[row][column] = PATH;
                        player[0] = row + y;
                        player[1] = column + x;
                }
                return player;
        }
}

