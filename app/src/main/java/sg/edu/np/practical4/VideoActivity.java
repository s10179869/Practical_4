package sg.edu.np.practical4;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        VideoView video = findViewById(R.id.videoView);
        video.setVideoURI(
                Uri.parse("android.resource://" +
                        getPackageName() +
                        "/" + R.raw.rabbid)
        );
        video.start();
    }
}
