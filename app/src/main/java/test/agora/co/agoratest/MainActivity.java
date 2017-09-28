package test.agora.co.agoratest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import io.agora.rtc.IRtcEngineEventHandler;
import io.agora.rtc.RtcEngine;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeAgoraEngine();
    }

    private void initializeAgoraEngine() {
        try {
            mRtcEngine = RtcEngine.create(getBaseContext(), "62fc891a32704a1694ee88a00d164e6f", mRtcEventHandler);
        } catch (Exception e) {
            Log.e("log", Log.getStackTraceString(e));

            throw new RuntimeException("NEED TO check rtc sdk init fatal error\n" + Log.getStackTraceString(e));
        }
    }

    private RtcEngine mRtcEngine;// Tutorial Step 1
    private final IRtcEngineEventHandler mRtcEventHandler = new IRtcEngineEventHandler() { // Tutorial Step 1
        @Override
        public void onFirstRemoteVideoDecoded(final int uid, int width, int height, int elapsed) { // Tutorial Step 5

        }

        @Override
        public void onUserOffline(int uid, int reason) { // Tutorial Step 7

        }

        @Override
        public void onUserMuteVideo(final int uid, final boolean muted) { // Tutorial Step 10

        }

        @Override
        public void onUserJoined(int uid, int elapsed) {

        }
    };
}
