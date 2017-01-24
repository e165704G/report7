package jp.ac.uryukyu.ie.e165723;

/**
 * Created by e165704 on 2017/01/24.
 */
public class Map {
        public int width; //迷路の横の大きさ
        public int height; //迷路の縦の大きさ
        public  byte[] data;//実際の迷路データ

        public static final byte PATH = 0; //通路
        public static final byte WALL = 1; //壁
        public static final byte ENTRANCE = 2; //入り口
        public static final byte EXIT = 3; //出口
    }

