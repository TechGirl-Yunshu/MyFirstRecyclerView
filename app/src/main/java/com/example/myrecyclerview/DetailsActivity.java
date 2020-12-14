package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailsActivity extends AppCompatActivity {
    private TextView dName, dDescription, dRating;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        extras = getIntent().getExtras();

        dName = (TextView) findViewById(R.id.dNameID);
        dDescription = (TextView) findViewById(R.id.dDescriptionID);
        dRating = (TextView) findViewById(R.id.dRatingID);

        if (extras != null) {
            dName.setText(extras.getString("name"));
            dDescription.setText(extras.getString("description"));
            dRating.setText(extras.getString("rating"));
        }

    }
}