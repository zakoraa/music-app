package com.zakora.musicapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.zakora.musicapp.R;
import com.zakora.musicapp.data.AlbumData;
import com.zakora.musicapp.model.Album;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    List<Album> albums = new ArrayList<Album>();

//    String albumList[] = {"Pajama Drive", "Apricot Princess", "Unorthodox Jukebox", "Bintang Lima", "Heavy Rotation", "bcos U Will Never B Free"};
//    int albumImages[] = {R.drawable.pajama_drive, R.drawable.apricot_princess, R.drawable.unorthodox_jukebox, R.drawable.bintang_lima,R.drawable.heavy_rotation, R.drawable.bcos_u};

    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(Map<String, Object> data: AlbumData.albumList){
            String title = (String) data.get("title");
            Integer imageInteger = (Integer) data.get("image");
            int image = (imageInteger != null) ? imageInteger : 0;

            albums.add(new Album(title,image));
        }

        RecyclerView recyclerView = findViewById(R.id.rv_recently_played);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(new AlbumAdapter(getApplicationContext(), albums));
    }
}