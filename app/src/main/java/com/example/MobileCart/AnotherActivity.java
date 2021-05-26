package com.example.MobileCart;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {

    ImageView imageView;
    TextView title, description,price,subtitle;
    int position;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
            // aslo set in menifest
        }

        imageView = findViewById(R.id.another_imageView);
        title = findViewById(R.id.titleText);
        description = findViewById(R.id.description);
      price =findViewById(R.id.price);
      subtitle=findViewById(R.id.subtitle);

        if (position == 0) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String asubtitle = intent.getStringExtra("subtitle");
            String aDescription=intent.getStringExtra("description");
            String aprice=intent.getStringExtra("price");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
             subtitle.setText(asubtitle);
             price.setText(aprice);


            actionBar.setTitle(aTitle);
        }

        if (position == 1) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String asubtitle = intent.getStringExtra("subtitle");
            String aDescription=intent.getStringExtra("description");
            String aprice=intent.getStringExtra("price");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            subtitle.setText(asubtitle);
            price.setText(aprice);


            actionBar.setTitle(aTitle);
        }

        if (position == 2) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String asubtitle = intent.getStringExtra("subtitle");
            String aDescription=intent.getStringExtra("description");
            String aprice=intent.getStringExtra("price");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            subtitle.setText(asubtitle);
            price.setText(aprice);


            actionBar.setTitle(aTitle);
        }

        if (position == 3) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String asubtitle = intent.getStringExtra("subtitle");
            String aDescription=intent.getStringExtra("description");
            String aprice=intent.getStringExtra("price");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            subtitle.setText(asubtitle);
            price.setText(aprice);


            actionBar.setTitle(aTitle);
        }

        if (position == 4) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String asubtitle = intent.getStringExtra("subtitle");
            String aDescription=intent.getStringExtra("description");
            String aprice=intent.getStringExtra("price");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            subtitle.setText(asubtitle);
            price.setText(aprice);


            actionBar.setTitle(aTitle);
        }if (position == 5) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String asubtitle = intent.getStringExtra("subtitle");
            String aDescription=intent.getStringExtra("description");
            String aprice=intent.getStringExtra("price");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            subtitle.setText(asubtitle);
            price.setText(aprice);


            actionBar.setTitle(aTitle);
        }

        if (position == 6) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String asubtitle = intent.getStringExtra("subtitle");
            String aDescription=intent.getStringExtra("description");
            String aprice=intent.getStringExtra("price");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            subtitle.setText(asubtitle);
            price.setText(aprice);


            actionBar.setTitle(aTitle);
        }

        if (position == 7) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String asubtitle = intent.getStringExtra("subtitle");
            String aDescription=intent.getStringExtra("description");
            String aprice=intent.getStringExtra("price");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            subtitle.setText(asubtitle);
            price.setText(aprice);


            actionBar.setTitle(aTitle);
        }

        if (position == 8) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String asubtitle = intent.getStringExtra("subtitle");
            String aDescription=intent.getStringExtra("description");
            String aprice=intent.getStringExtra("price");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            subtitle.setText(asubtitle);
            price.setText(aprice);


            actionBar.setTitle(aTitle);
        }

        if (position == 9) {
            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String asubtitle = intent.getStringExtra("subtitle");
            String aDescription=intent.getStringExtra("description");
            String aprice=intent.getStringExtra("price");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);
            subtitle.setText(asubtitle);
            price.setText(aprice);


            actionBar.setTitle(aTitle);
        }

    }

    // now check it
    // so friends this works perfectly..
    // friedns i have made some changes with list view, i hope you guys like these change with listview
    // first add card library in build.gradle
    // now move in row xml
    // now in activity main.xml
}
