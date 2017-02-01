package jp.ac.uryukyu.ie.e165704;
import jp.ac.uryukyu.ie.e165704.Map;
import org.junit.Test;

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
            Map map = new Map();//Mapクラスのインスタンスを作成
            map.PrintMap();//Mapクラスに格納されているmapのデータを図に置き換えたPrintMapの結果を表示する
        }
}


