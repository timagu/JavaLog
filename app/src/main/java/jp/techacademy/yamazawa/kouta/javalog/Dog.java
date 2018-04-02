package jp.techacademy.yamazawa.kouta.javalog;

/**
 * Created by 幸太 on 2018/03/01.
 */
import android.util.Log;

class Dog extends Animal {

    //クラス変数
    static String to_jp = "犬";


    //コンストラクタ
    public Dog(String name,int age){
        this.name = name;
        this.age = age;
    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは犬クラスです。");
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }

}
