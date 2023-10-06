package com.zakora.musicapp.data;

import com.zakora.musicapp.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlbumData {
    public static List<Map<String, Object>> albumList = new ArrayList<Map<String, Object>>(){{
        add(new HashMap<String, Object>() {{
            put("title", "Pajama Drive");
            put("image", R.drawable.pajama_drive);
        }});
        add(new HashMap<String, Object>() {{
            put("title", "Heavy Rotation");
            put("image", R.drawable.heavy_rotation);
        }});
        add(new HashMap<String, Object>() {{
            put("title", "Apricot Princess");
            put("image", R.drawable.apricot_princess);
        }});
        add(new HashMap<String, Object>() {{
            put("title", "Unorthodox Jukebox");
            put("image", R.drawable.unorthodox_jukebox);
        }});
        add(new HashMap<String, Object>() {{
            put("title", "Bintang Lima");
            put("image", R.drawable.bintang_lima);
        }});
        add(new HashMap<String, Object>() {{
            put("title", "Bcos U Will Never B Free");
            put("image", R.drawable.bcos_u);
        }});
    }};
}
