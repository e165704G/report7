package jp.ac.uryukyu.ie.e165723;

public class Map {
        int width; //迷路の横の大きさ
        int height; //迷路の縦の大きさ
        int[][] data;//実際の迷路データ
        int[] p ;

        public static final byte PATH = 0; //通路
        public static final byte WALL = 1; //壁
        public static final byte ENTRANCE = 2; //入り口
        public static final byte EXIT = 3; //出口

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
                                        case ENTRANCE:
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
        public void Mover(){
                //Player1でこの動きを呼び出すため

                }
        }
/*
        public void Playerpoint() {
                int row, colum, i, j;
                int[] temp;
                row = 11;
                colum = 8;
                p = new int[]{1, 1};
                temp = p;
                for(i = 0; i< width; i++){
                        for(j = 0; j< height; j++){
                                if(i == row && j == colum){
                                        System.out.print("Ｐ");
                                }
                        }
                }



        }*/

