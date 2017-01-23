package com.example.somy.settings_saesompark;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        btn = (Button) findViewById(R.id.button);
        // 버튼을 설정해줌. 뷰를 찾아서 버튼을 찾는데
        // (Button) 를 써서 강제로 최상위 뷰 클래스를 받아서 오브젝트끼리 연결해줌
        tv = (TextView) findViewById(R.id.textView);

        btn.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button: //콜론!!
                tv.setText(BuildConfig.MyURL);
        }
    }
}
