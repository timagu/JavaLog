package jp.techacademy.yamazawa.kouta.javalog;

/**
 * Created by 幸太 on 2018/03/30.
 */

abstract class Animal {
    // メンバ変数
    static String name;  // 名前
    static int age;    // 年齢
    static String hobby;   //考え

    abstract public void say();
}
