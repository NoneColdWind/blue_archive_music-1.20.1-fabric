package com.example.androidterminal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class ShellFragment extends Fragment {

    private TextView terminalOutput;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shell, container, false);
        terminalOutput = view.findViewById(R.id.terminal_output);
        
        // 初始化终端输出
        terminalOutput.setText("Welcome to Android Shell Terminal\n$ ");
        
        return view;
    }
}
