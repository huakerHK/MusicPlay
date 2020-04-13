package com.example.musicplay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.os.Bundle;
import android.widget.FrameLayout;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

private View onlineFrame;
private View rmmFrame;
private View localFrame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(getSupportActionBar()!=null)
            getSupportActionBar().hide();
        initViews();
    }
    public void initViews(){
        onlineFrame=findViewById(R.id.online);
        rmmFrame=findViewById(R.id.rmm);
        localFrame=findViewById(R.id.local);
        onlineFrame.setOnClickListener(this);
        rmmFrame.setOnClickListener(this);
        localFrame.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        clearSelection();
switch (v.getId()){

    case R.id.online:
       /* FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.content,new onlineFrame());//这里是实列化onlineFrame类，还有另一种写法setOnlineFrame（new onlineFrame()）；
        transaction.commit();*/
        onlineFrame.setBackgroundColor(0xfafadf);//设置背景颜色
        setFrame(new onlineFrame());
        break;
    case R.id.local:
        localFrame.setBackgroundColor(0xeeffd);
        setFrame(new localFrame());
        new onlineclass();
        break;
    case R.id.rmm:
        rmmFrame.setBackgroundColor(0xfdfdf);
        setFrame(new rmmFrame());
        break;
}
    }
private void setFrame (Fragment fragment){
    FragmentManager fragmentManager=getSupportFragmentManager();
    FragmentTransaction transaction=fragmentManager.beginTransaction();
    transaction.replace(R.id.content,fragment);
    transaction.commit();
}
    private void clearSelection() {
        onlineFrame.setBackgroundColor(0xffffffff);
        localFrame.setBackgroundColor(0xffffffff);
        rmmFrame.setBackgroundColor(0xffffffff);
    }



}
