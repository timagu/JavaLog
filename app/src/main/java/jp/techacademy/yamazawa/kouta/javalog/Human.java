package jp.techacademy.yamazawa.kouta.javalog;

import android.util.Log;

/**
 * Created by 幸太 on 2018/03/30.
 */

public class Human extends Animal implements Thinkable{
    static String name = "幸太";
    static int age = 34;
    static String hobby = "趣味";
    public void say() {
        Log.d("javatest", "私の名前は"+ name + "です。");
        Log.d("javatest", "年は"+ age + "歳です。");
    }

    public void think(){
        Log.d("javatest", "私は" + Human.hobby + "について考える");
    }
}
