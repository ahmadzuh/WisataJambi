package com.example.wisatajambi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private Toolbar mTopToolbarDetail;

    ImageView imageView;
    TextView nature, description;

    String natures, descriptions;
    int images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mTopToolbarDetail = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mTopToolbarDetail);
        getSupportActionBar().setTitle("Detail");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageView = findViewById(R.id.image);
        nature = findViewById(R.id.nature);
        description = findViewById(R.id.description);

        natures = getIntent().getStringExtra("nature");
        descriptions = getIntent().getStringExtra("description");

        images = getIntent().getIntExtra("image", 0);

        nature.setText(natures);
        description.setText(descriptions);

        imageView.setImageResource(images);

    }
}

