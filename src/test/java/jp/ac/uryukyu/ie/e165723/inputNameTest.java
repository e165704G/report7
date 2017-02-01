package jp.ac.uryukyu.ie.e165723;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by e165723 on 2017/02/01.
 */
public class inputNameTest {
    /**
     * 「PlayerNameに文字が入っていない状態」を確認。
     *
     * @throws Exception
     */
    @Test
    public void Name() throws Exception {
        //正しく「文字が入ってない状態」を表現できている場合
        String PlayerName;//PlayerNameを用意する
        PlayerName = "";//PlayerNameに""を代入する
        System.out.println("Playerの名前は" + PlayerName + "です。");//出力して中身の確認
        //正しく「文字が入っていない状態」を表現できていない場合その
        PlayerName = null;//PlayerNameにnullを代入する
        System.out.println("Playerの名前は" + PlayerName + "です。");
       //結果として空を意味する「null」は文字扱いになるため「""」で表現する必要がある
    }
}


