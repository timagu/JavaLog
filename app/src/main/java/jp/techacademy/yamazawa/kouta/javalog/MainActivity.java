package jp.techacademy.yamazawa.kouta.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("javatest", "私の名前は"+ Human.name + "です。");
        Log.d("javatest", "年は"+ Human.age + "歳です。");
        /*Dog dog = new Dog("ポチ",3); // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        dog.say(); //ポチが吠えます。（ログ出力）
        Log.d("javatest", "犬の名前は" + dog.name + "です。");
        Log.d("javatest", "犬の年齢は" + dog.age + "歳です。");

        BigDog bigdog = new BigDog("ヨーゼフ", 15);     // 名前をヨーゼフ、年齢15歳で、BigDogのインスタンスを作る

        bigdog.say();
        Log.d("javatest", "犬の名前は" + bigdog.name + "です。");
        Log.d("javatest", "犬の年齢は" + bigdog.age + "歳です。");*/

    }

    public void think(){
        Log.d("javatest", "私は" + Human.hobby + "について考える");
    }
}
