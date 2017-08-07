package com.baway.lizongshu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
 private TextView mtv1,mtv2,mtv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtv1=(TextView)findViewById(R.id.tv1);
        mtv2=(TextView)findViewById(R.id.tv2);
        mtv3=(TextView)findViewById(R.id.tv3);
        
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv1:
                Toast.makeText(this,"点击了返回",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv2:
                Toast.makeText(this,"点击了标题",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv3:
                Toast.makeText(this,"点击了更多",Toast.LENGTH_SHORT).show();
                break;
        }



    }
}
