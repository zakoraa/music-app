package com.zakora.musicapp.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.zakora.musicapp.R;

public class AlbumViewHolder extends RecyclerView.ViewHolder {

    ImageView albumImage;
    TextView title;

    public AlbumViewHolder(@NonNull View itemView) {
        super(itemView);
        albumImage = itemView.findViewById(R.id.iv_album_image);
        title = itemView.findViewById(R.id.tv_album_title);

    }
}
