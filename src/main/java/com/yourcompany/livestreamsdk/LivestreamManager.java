
package com.yourcompany.livestreamsdk;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class LivestreamManager {

    private static LivestreamManager instance;

    public static LivestreamManager getInstance() {
        if (instance == null) {
            instance = new LivestreamManager();
        }
        return instance;
    }

    private LivestreamManager() {}

    // Initialize SDK
    public void init(Context context) {
        // Initialize WebRTC or RTMP here
    }

    // Join a room
    public void joinRoom(String roomId, String userName, FrameLayout container) {
        // Placeholder: create a video view and add to container
        VideoView videoView = new VideoView(container.getContext());
        container.addView(videoView, new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        ));
        // Connect to signaling / streaming server here
    }

    // Leave room
    public void leaveRoom(String roomId) {
        // Disconnect stream
    }

    // Start local stream
    public void startStream() {
        // Capture camera + mic and push to server
    }

    // Stop local stream
    public void stopStream() {
        // Stop capturing and streaming
    }
}
