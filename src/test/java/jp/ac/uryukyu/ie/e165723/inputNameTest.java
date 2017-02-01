package jp.ac.uryukyu.ie.e165723;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by e165723 on 2017/02/01.
 */
public class inputNameTest {
    /**
     * 「名前が正しく入力される」ことを確認。
     *
     * @throws Exception
     */
    @Test
    public void Name() throws Exception {
        System.out.println("名前を入力して下さい。:");
        Scanner scan = new Scanner(System.in);
        String PlayerName;

        while (true) {
            PlayerName = scan.nextLine();
            if ("".equals(PlayerName)) {
                System.out.println("入力エラー：正しく文字を入力してください。");
                System.out.println("名前を入力して下さい。:");
            } else {
                System.out.println("文字の入力を確認しました。Playerの名前は" + PlayerName + "です。");
                break;
            }
        }
    }

}