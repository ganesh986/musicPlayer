/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers
        TextView playlist = (TextView) findViewById(R.id.playlist);

        // Set a click listener on that View
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, playlist.class);
                startActivity(playlistIntent);
            }
        });

        // Find the View that shows the artists
        TextView artists = (TextView) findViewById(R.id.artists);

        // Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artists View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, artists.class);
                startActivity(artistsIntent);
            }
        });

        // Find the View that shows the albums
        TextView albums = (TextView) findViewById(R.id.albums);

        // Set a click listener on that View
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the albums View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MainActivity.this, albums.class);
                startActivity(albumsIntent);
            }
        });

        // Find the View that shows the songs
        TextView songs = (TextView) findViewById(R.id.songs);

        // Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MainActivity.this, songs.class);
                startActivity(songsIntent);
            }
        });

        // Find the View that shows the player
        TextView player = (TextView) findViewById(R.id.player);

        // Set a click listener on that View
        player.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the help View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playerIntent = new Intent(MainActivity.this, help.class);
                startActivity(playerIntent);
            }
        });
    }

}
