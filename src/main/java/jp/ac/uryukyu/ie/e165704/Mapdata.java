package jp.ac.uryukyu.ie.e165704;

/**
 * Created by e165704 on 2017/01/24.
 */
public class Mapdata extends Map {
        public void init(){
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
    }
