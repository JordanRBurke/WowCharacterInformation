package com.jordanburke.wowcharacterinformation;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.character_name_edit)
    protected TextInputEditText characterName;
    @BindView(R.id.realm_name_edit)
    protected TextInputEditText realmName;
    @BindView(R.id.submit_button)
    protected Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.submit_button)
    protected void submitButtonClicked() {

        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);



    }

}
