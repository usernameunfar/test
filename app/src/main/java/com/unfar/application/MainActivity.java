package com.unfar.application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView image_one;
    private ImageView image_two;
    private ImageView image_three;
    private ImageView image_four;

    private Button btn_listview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initControls();
        initData();


    }

    //初始化控件
    private void initControls() {
        image_one = (ImageView) findViewById(R.id.img_one);
        image_two = (ImageView) findViewById(R.id.img_two);
        image_three = (ImageView) findViewById(R.id.image_three);
        image_four = (ImageView) findViewById(R.id.image_four);
        btn_listview = (Button) findViewById(R.id.btn_listview);
        btn_listview.setOnClickListener(this);


    }

    //加载数据
    private void initData() {
        /** 
         * 根据ImageView大小，显示图片 
         * .fit()                               说明：控件不能设置成wrap_content,也就是必须有大小才行,fit()才让图片的宽高等于控件的宽高，设置fit()，不能再调用resize() 
         * .placeholder(R.drawable.topic_tom)   说明：当图片没有加载上的时候，显示的图片 
         * .error(R.drawable.topic_sky)         说明：当图片加载错误的时候，显示图片 
         * .into(img_one)                       说明：将图片加载到哪个控件中 
         */
        Picasso.with(this).load("http://g.hiphotos.baidu.com/image/pic/item/c9fcc3cec3fdfc03e426845ed03f8794a5c226fd.jpg")
                .fit()
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(image_one);
        /** 
         * 通过程序代码，来显示图片大小 
         *.resize(200, 150)           说明：为图片重新定义大小 
         *.centerCrop()               说明：图片要填充整个控件，去两边留中间 
         */

        Picasso.with(this).load("http://d.hiphotos.baidu.com/image/h%3D200/sign=745574b6a2ec08fa390014a769ee3d4d/cb8065380cd79123148b447daf345982b2b78054.jpg")
                .resize(150, 150)
                .centerCrop()
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(image_two);
        /** 
         * 加载本地数据库,图片的大小，取消于控件设置的大小 
         */
        Picasso.with(this).load(R.mipmap.ic_launcher)
                .into(image_three);
        /** 
         * 截取图片 
         * .transform(new CropSquareTransformation())        说明：通过程序截取图片 
         */
        Picasso.with(this).load("http://g.hiphotos.baidu.com/image/pic/item/6c224f4a20a446230761b9b79c22720e0df3d7bf.jpg")
                .transform(new CropSquareTransformation())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(image_four);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_listview:
                ListViewActivity.ListViewStar(this);
                break;

        }

    }
}
