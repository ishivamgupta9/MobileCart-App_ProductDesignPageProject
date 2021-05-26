package com.example.MobileCart;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String mTitle[] = {"Realme x ", "Realme 7 ", "Galaxy A9 ", "Iphone 12 Mini", "Nokia Max 2020","Realme 5","oppo A53","Poco x3","Vivo v11","ZX"};
    String msubtitle[] = {"(4GB/138) ", "(6GB/128)", "(6GB/128)", "(6GB/128)", "(6GB/128)","(6GB/128)", "(6GB/128)", "(6GB/128)", "(6GB/128)", "(6GB/128)"};
    int images[] = {R.drawable.realmex, R.drawable.realme7, R.drawable.ralaxya9, R.drawable.iphone12mini, R.drawable.max2020,R.drawable.realme5, R.drawable.oppoa53,  R.drawable.pocox3, R.drawable.v11,R.drawable.zx};
    String description[]={" This edition of the Realme X phone is all about offering you an immersive cinematic experience - it boasts a 91.2% screen-to-body ratio and a 16.58 cm (6.53) super AMOLED screen. Staying ahead of the game, this phone comes with a pop-up selfie camera and an in-display fingerprint scanner both of which are neatly tucked under the display. Enjoy a seamless experience, whether you’re gaming (thanks to its Hyper Boost 2.0 acceleration engine and robust hardware), or simply browsing content on your phone.", "Take advantage of this realme smartphone’s 64 MP quad camera and click stunning photos. This phone also comes with a bunch of cool filters that’ll make night photography all the more amazing. In addition, this smartphone’s Helio G95 Gaming Processor makes it one powerful performer.", "\n" +
            "With the Samsung Galaxy A9, you’ll be thoroughly entertained all day long. It comes equipped with a Quad Camera system, a fingerprint sensor, and offers a large internal storage space (128 GB) and Face Unlock to ensure that you put an end to your habit of ‘compromise’. With these features, you’ll be delighted to capture stellar images without easily running out of space. And, if you’re bored of unlocking your phone the usual way, simply hold it up to your face and unlock it with a simple glance.", "\n" +
            "Dive into a world of crystal-clear visuals with the Super Retina XDR Display of the iPhone 12 Mini. This beast of a smartphone packs the A14 Bionic chip to make for blazing-fast performance speeds. On top of that, its Dual-camera System, along with Night Mode, helps you click amazing pictures and selfies even when the lighting isn’t as good as you’d want it to be.", "Nokia Play 2 Max 2020 smartphone has a Super AMOLED display. On camera front, the buyers get a 64 MP Primary Lens, 16 MP Secondary Shooter, 8 MP Ultra-wide Lens, 2 MP Depth Sensor camera and on the rear, there's an 64 MP + 16 MP + 8 MP + 2 MP camera with features like Digital Zoom, Auto Flash, Face detection, Touch to focus. It is backed by a 8000 mAh battery. Connectivity features in the smartphone include WiFi, Bluetooth, GPS, Volte ","48 MP AI Quad Camera\n" +
            "You can capture incredible details with the 48 MP Sony IMX586 Primary Lens. The pictures will turn out to be sharp and clear, even when you zoom into them. Click great pictures from different perspectives with the Ultra Wide-angle Lens and Super Macro Lens.", "Oppo A53 2020 smartphone was launched on 20th August 2020. The phone comes with a 6.50-inch touchscreen display with a resolution of 720x1600 pixels at a pixel density of 269 pixels per inch (ppi) and an aspect ratio of 20:9. Oppo A53 2020 is powered by a 1.8GHz octa-core Qualcomm Snapdragon 460 processor. It comes with 4GB of RAM. The Oppo A53 2020 runs Android 10 and is powered by a 5000mAh battery. The Oppo A53 2020 supports proprietary fast charging.\n" +
            "\n" +
            "As far as the cameras are concerned, the Oppo A53 2020 on the rear packs a 13-megapixel primary camera with an f/2.2 aperture; a 2-megapixel camera with an f/2.4 aperture, and a 2-megapixel camera with an f/2.4 aperture. The rear camera setup has autofocus. It sports a 16-megapixel camera on the front for selfies with an f/2.0 aperture.\n" +
            "\n" +
            "The Oppo A53 2020 runs ColorOS 7.2 is based on Android 10 and packs 64GB of inbuilt storage that can be expanded via microSD card (up to 256GB). The Oppo A53 2020 is a dual-SIM (GSM and GSM) smartphone that accepts Nano-SIM and Nano-SIM cards. The Oppo A53 2020 measures 169.30 x 75.10 x 8.60mm (height x width x thickness) and weighs 186.00 grams. It was launched in Electric Black, Fairy White, and Fancy Blue colours.", "Xiaomi Poco X3 - description and parameters Xiaomi Poco X3 supports frequency bands GSM , HSPA , LTE. Official announcement date is September 22 2020. The device is working on an Android 10, MIUI 12 with a Octa-core (2x2.3 GHz Kryo 470 Gold & 6x1.8 GHz Kryo 470 Silver) processor. Xiaomi Poco X3 has 64GB 6GB RAM, 128GB 6GB RAM, 128GB 8GB RAM of built-in memory. This device has a Qualcomm SM7150-AC Snapdragon 732G (8 nm) chipset. The main screen size is 6.67 inches, 107.4 cm2 with 1080 x 2400", "vivo V11 (V11 Pro) - description and parameters vivo V11 (V11 Pro) supports frequency bands GSM , CDMA , HSPA , LTE. Official announcement date is September 2018. The device is working on an Android 8.1 (Oreo) with a Octa-core (4x2.2 GHz Kryo 260 & 4x1.8 GHz Kryo 260) processor and 6 GB RAM memory. vivo V11 (V11 Pro) has 64/128 GB of internal memory. This device has a Qualcomm SDM660 Snapdragon 660 chipset. The main screen size is 6.41 inches, 100.9 cm2 with 1080 x 2340 pixels, 19.5:9 ratio ", "Xolo ZX was launched in April 2019 & runs on Android 8.1 OS. The Smartphone is available only in one color i.e. Electric Blue and Midnight Blue & has a built in fingerprint sensor as the primary security feature, along with the host of connectivity options in terms of 3G, 4G, GPS, Wifi Bluetooth capabilities. The phone is available with 128GB of internal storage.\n" +
            "\n" +
            "The Smartphone is powered by MediaTek Helio P22 Processor. A 6GB of RAM ensures phone runs smoothly"};
    String mprice[]={" Rs.19999", "Rs.14999 ", "Rs.35000 ", "Rs.65999 ", "Rs.19999","Rs.9999", "Rs.9999", "Rs.9999 ", "Rs.9999", "Rs.29999 "};
    String mexpirydate[]={"offer valid till 11:59pm","offer valid till 11:59pm","offer valid till 11:59pm","offer valid till 11:59pm","offer valid till 11:59pm","offer valid till 11:59pm","offer valid till 11:59pm","offer valid till 11:59pm","offer valid till 11:59pm","offer valid till 11:59pm"};

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle, msubtitle, images,mprice,mexpirydate);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[0]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[0]);
                    intent.putExtra("subtitle", msubtitle[0]);
                    // also put your position
                    intent.putExtra("description", description[0]);
                    intent.putExtra("price", mprice[0]);
                    intent.putExtra("mexpiry",mexpirydate[0]);

                    intent.putExtra("position", ""+0);
                    startActivity(intent);


                }
                if (position == 1) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[1]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[1]);
                    intent.putExtra("subtitle", msubtitle[1]);
                    // also put your position
                    intent.putExtra("description", description[1]);
                    intent.putExtra("price", mprice[1]);
                    intent.putExtra("mexpiry",mexpirydate[1]);
                    // also put your position
                    intent.putExtra("position", ""+1);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[2]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[2]);
                    intent.putExtra("subtitle", msubtitle[2]);
                    // also put your position
                    intent.putExtra("description", description[2]);
                    intent.putExtra("price", mprice[2]);
                    intent.putExtra("mexpiry",mexpirydate[2]);
                    // also put your position
                    intent.putExtra("position", ""+2);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[3]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[3]);
                    intent.putExtra("subtitle", msubtitle[3]);
                    // also put your position
                    intent.putExtra("description", description[3]);
                    intent.putExtra("price", mprice[3]);
                    intent.putExtra("mexpiry",mexpirydate[3]);
                    // also put your position
                    intent.putExtra("position", ""+3);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[4]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[4]);
                    intent.putExtra("subtitle", msubtitle[4]);
                    // also put your position
                    intent.putExtra("description", description[4]);
                    intent.putExtra("price", mprice[4]);
                    intent.putExtra("mexpiry",mexpirydate[4]);
                    // also put your position
                    intent.putExtra("position", ""+4);
                    startActivity(intent);
                }

                if (position == 5) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[5]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[5]);
                    intent.putExtra("subtitle", msubtitle[5]);
                    // also put your position
                    intent.putExtra("description", description[5]);
                    intent.putExtra("price", mprice[5]);
                    intent.putExtra("mexpiry",mexpirydate[5]);
                    // also put your position
                    intent.putExtra("position", ""+5);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[6]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[6]);
                    intent.putExtra("subtitle", msubtitle[6]);
                    // also put your position
                    intent.putExtra("description", description[6]);
                    intent.putExtra("price", mprice[6]);
                    intent.putExtra("mexpiry",mexpirydate[6]);
                    // also put your position
                    intent.putExtra("position", ""+6);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[7]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[7]);
                    intent.putExtra("subtitle", msubtitle[7]);
                    // also put your position
                    intent.putExtra("description", description[7]);
                    intent.putExtra("price", mprice[7]);
                    intent.putExtra("mexpiry",mexpirydate[7]);
                    // also put your position
                    intent.putExtra("position", ""+7);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[8]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[8]);
                    intent.putExtra("subtitle", msubtitle[8]);
                    // also put your position
                    intent.putExtra("description", description[8]);
                    intent.putExtra("price", mprice[8]);
                    intent.putExtra("mexpiry",mexpirydate[8]);
                    // also put your position
                    intent.putExtra("position", ""+8);
                    startActivity(intent);
                }if (position == 9) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[9]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[9]);
                    intent.putExtra("subtitle", msubtitle[9]);
                    // also put your position
                    intent.putExtra("description", description[9]);
                    intent.putExtra("price", mprice[9]);
                    intent.putExtra("mexpiry",mexpirydate[9]);

                    intent.putExtra("position", ""+9);
                    startActivity(intent);


                }

            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImages[];
        String rPrice[];
        String rexpiry[];

        MyAdapter(Context c, String[] title, String[] description, int[] imgs, String[] mprice, String[] mexpiry) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImages = imgs;
            this.rPrice=mprice;
            this.rexpiry=mexpiry;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View row = layoutInflater.inflate(R.layout.row, parent, false);

            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);
            TextView myprice=row.findViewById(R.id.textView3);
            TextView myexpiry=row.findViewById(R.id.textView4);

            images.setImageResource(rImages[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);
            myprice.setText(rPrice[position]);
            myexpiry.setText(rexpiry[position]);


            return row;
        }
    }
}
