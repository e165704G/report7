package jp.ac.uryukyu.ie.e165723;

/**
 * Created by e165704 on 2017/01/24.
 */
public class Mapdata extends Map {
        public void init(){
            width = 9; //迷路の横幅は９
            height = 6; //迷路の縦幅は６
            data = new byte[] {
                    2, 1, 0, 1, 0, 1, 0, 0, 0,  // 0 は 通路
                    0, 1, 0, 0, 0, 0, 0, 1, 0,  // 1 は 壁
                    0, 1, 0, 1, 0, 1, 0, 1, 0,  // 2 は 入口
                    0, 0, 0, 1, 0, 1, 0, 1, 0,  // 3 は 出口
                    0, 1, 1, 1, 0, 1, 0, 1, 0,
                    0, 0, 0, 0, 1, 0, 0, 1, 3
            };
        }
    }
