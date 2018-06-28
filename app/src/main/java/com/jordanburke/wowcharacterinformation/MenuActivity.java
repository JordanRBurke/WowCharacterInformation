package com.jordanburke.wowcharacterinformation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.jordanburke.wowcharacterinformation.Reputation.ReputationInfoFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MenuActivity extends AppCompatActivity {

    @BindView(R.id.reputation_button)
    protected Button reputationButton;
    private ReputationInfoFragment reputationInfoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.reputation_button)
    protected void reputationButtonClicked() {

        reputationInfoFragment = ReputationInfoFragment.newInstance();
        getSupportFragmentManager().beginTransaction().attach(reputationInfoFragment).commit();



    }
}
