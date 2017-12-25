package com.xinzhengwei.lunbolianxi;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> list=new ArrayList<>();

    private Banner bn;
    String[] urls = {"http://img.my.csdn.net/uploads/201407/26/1406383265_8550.jpg",
            "https://lh4.googleusercontent.com/--dq8niRp7W4/URquVgmXvgI/AAAAAAAAAbs/-gnuLQfNnBA/s160-c/A%252520Song%252520of%252520Ice%252520and%252520Fire.jpg",
            "https://lh5.googleusercontent.com/-7qZeDtRKFKc/URquWZT1gOI/AAAAAAAAAbs/hqWgteyNXsg/s160-c/Another%252520Rockaway%252520Sunset.jpg",
            "https://lh3.googleusercontent.com/--L0Km39l5J8/URquXHGcdNI/AAAAAAAAAbs/3ZrSJNrSomQ/s160-c/Antelope%252520Butte.jpg",
            "https://lh6.googleusercontent.com/-8HO-4vIFnlw/URquZnsFgtI/AAAAAAAAAbs/WT8jViTF7vw/s160-c/Antelope%252520Hallway.jpg",
            "https://lh4.googleusercontent.com/-WIuWgVcU3Qw/URqubRVcj4I/AAAAAAAAAbs/YvbwgGjwdIQ/s160-c/Antelope%252520Walls.jpg"};
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bn = (Banner)findViewById(R.id.bn);
        lv = findViewById(R.id.lv);
        bn.setImageLoader(new MLoder());
        bn.setImages(Arrays.asList(urls));
        bn.start();
        lv.setAdapter(new adapter());
        init();
    }

    private void init() {

        for(int i=0;i<10;i++){
            list.add("我来了！");
        }

    }

    public class MLoder extends com.youth.banner.loader.ImageLoader{

        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            com.nostra13.universalimageloader.core.ImageLoader.getInstance().displayImage((String)path,imageView);
        }
    }

    class adapter extends BaseAdapter{

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            View view1 = View.inflate(MainActivity.this, R.layout.text_main, null);

            TextView tv = view1.findViewById(R.id.tv);

            tv.setText(list.get(i));

            return view1;
        }
    }

}
