package com.unfar.application;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {
    private ListView lv_main;
    private List<News> list_new;
    private lv_Adapter lv_adapter;

    public static void ListViewStar(Context context) {
        Intent intent = new Intent(context, ListViewActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        initControls();
        initData();
    }

    //初始化控件
    private void initControls() {
        lv_main = (ListView) findViewById(R.id.lv_main);
        list_new = new ArrayList<>();
        lv_adapter = new lv_Adapter(list_new, this);
        lv_main.setAdapter(lv_adapter);
    }

    //初始化数据
    private void initData() {
        News news = new News();
        news.setTitle("111");
        news.setContents("...........");
        news.setPicUrl("http://g.hiphotos.baidu.com/image/pic/item/6c224f4a20a446230761b9b79c22720e0df3d7bf.jpg");
        list_new.add(news);

        News news2 = new News();
        news2.setTitle("222");
        news2.setContents("...........");
        news2.setPicUrl("http://f.hiphotos.baidu.com/image/pic/item/11385343fbf2b211eee0554ac88065380dd78eec.jpg");
        list_new.add(news2);

        News news3 = new News();
        news3.setTitle("333");
        news3.setContents("...........");
        news3.setPicUrl("http://d.hiphotos.baidu.com/image/h%3D200/sign=745574b6a2ec08fa390014a769ee3d4d/cb8065380cd79123148b447daf345982b2b78054.jpg");
        list_new.add(news3);

        News news4 = new News();
        news4.setTitle("444");
        news4.setContents("...........");
        news4.setPicUrl("http://f.hiphotos.baidu.com/image/pic/item/738b4710b912c8fc6684dceaf9039245d68821a5.jpg");
        list_new.add(news4);

        News news5 = new News();
        news5.setTitle("444");
        news5.setContents("...........");
        news5.setPicUrl("http://c.hiphotos.baidu.com/image/pic/item/342ac65c10385343498219169613b07eca8088bc.jpg");
        list_new.add(news5);

        News news6 = new News();
        news6.setTitle("444");
        news6.setContents("...........");
        news6.setPicUrl("http://c.hiphotos.baidu.com/image/pic/item/a044ad345982b2b7a2f0f7cd33adcbef76099b48.jpg");
        list_new.add(news6);

        News news7 = new News();
        news7.setTitle("444");
        news7.setContents("...........");
        news7.setPicUrl("http://e.hiphotos.baidu.com/image/pic/item/8b13632762d0f7031db73fdc0afa513d2697c5ad.jpg");
        list_new.add(news7);

        News news8 = new News();
        news8.setTitle("444");
        news8.setContents("...........");
        news8.setPicUrl("http://b.hiphotos.baidu.com/image/pic/item/9825bc315c6034a857770337ce134954082376ea.jpg");
        list_new.add(news8);
        lv_adapter.notifyDataSetChanged();


    }
}
