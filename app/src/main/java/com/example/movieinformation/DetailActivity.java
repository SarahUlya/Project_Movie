package com.example.movieinformation;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);

        int image = getIntent().getIntExtra("image", 0);
        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");
        String link = getIntent().getStringExtra("link");

        ImageView viewImage = findViewById(R.id.item_image);
        TextView titleView = findViewById(R.id.item_title);
        TextView descriptionView = findViewById(R.id.item_description);
        TextView linkView = findViewById(R.id.link_item);

        viewImage.setImageResource(image);
        titleView.setText(title);
        descriptionView.setText(description);
        linkView.setText(link);

        linkView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}