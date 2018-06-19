package com.nyonyo_soft.hanashijoze9.feature;

import android.content.Context;
import android.media.MediaPlayer;

import static com.nyonyo_soft.hanashijoze9.feature.HanashiJoze.MAX_MEDIA_PLAYER_INSTANCES;

/**
 * Created by walku on 2018/02/17.
 */

public class MediaPlayerManager  {

    MediaPlayerManager mediaPlayerBuilder = new MediaPlayerManager();
    private      MediaPlayer mediaPlayers[]=null;

    public MediaPlayerManager() {

    }

    public MediaPlayerManager(Context context) {
        // MediaPlayer のInstance作成
        mediaPlayers = new MediaPlayer[MAX_MEDIA_PLAYER_INSTANCES];
        for (int counter = 0; counter < MAX_MEDIA_PLAYER_INSTANCES; counter++) {
            mediaPlayers[counter] = MediaPlayer.create(context, R.raw.agree2001_good);
        }


    }
}
