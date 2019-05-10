package sg.edu.np.practical4;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    TextView text;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.displayText);
        image = findViewById(R.id.displayImage);
    }

    public void onMeow(View v){meow();}
    public void onBark(View v) {bark();}
    public void OnCatVideo(View v){catVideo();}

    private void meow(){

        text.setText("Meow!");
        image.setVisibility(View.VISIBLE);
        image.setImageResource(R.drawable.cat);

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.meow);
        mediaPlayer.start();

    }

    private void bark(){
        text.setText("Bark!");
        image.setVisibility(View.VISIBLE);
        image.setImageResource(R.drawable.ericandre);

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.bark);
        mediaPlayer.start();
    }

    private void catVideo(){

        Intent intent = new Intent(MainActivity.this, VideoActivity.class);
        startActivity(intent);
    }

}
