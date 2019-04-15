package com.github.kotlin_studio.main_activity_and_fragment1_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Postman {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void fragmentMail (int numberOfClicks) {

        // получаем ссылку на текстовое поле
        TextView textReport = findViewById(R.id.textReport);

        // формируем сообщение
        String message = "Сколько раз была нажата кнопка? " + numberOfClicks + "!";

        // выводим сообщение в текстовом поле
        textReport.setText(message);
    }

}
