package com.example.androidterminal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class MusicFragment extends Fragment {

    private TextView musicTitle;
    private Button playButton;
    private boolean isPlaying = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_music, container, false);
        
        musicTitle = view.findViewById(R.id.music_title);
        playButton = view.findViewById(R.id.play_button);
        
        // 模拟音乐列表
        musicTitle.setText("Sample Music");
        
        // 播放/暂停按钮点击事件
        playButton.setOnClickListener(v -> {
            if (isPlaying) {
                // 暂停音乐
                playButton.setText("Play");
                isPlaying = false;
            } else {
                // 播放音乐
                playButton.setText("Pause");
                isPlaying = true;
            }
        });
        
        return view;
    }
}
