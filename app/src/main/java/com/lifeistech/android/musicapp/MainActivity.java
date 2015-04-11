package com.lifeistech.android.musicapp;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RelativeLayout;
import java.io.IOException;
import android.widget.Toast;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class MainActivity extends Activity {

    private MediaPlayer mediaPlayer;
    RelativeLayout layout;
    public String filePath = "1.mp3";
    private SeekBar seekBar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // RelativeLayoutの関連付け
        layout = (RelativeLayout) findViewById(R.id.RelativeLayout);
        // text_viewの関連付け
        textView = (TextView)findViewById(R.id.text_view);
        // SeekBar
        seekBar = (SeekBar)findViewById(R.id.seekbar);
        // 初期値
        seekBar.setProgress(0);
        // 最大値
        seekBar.setMax(100);
        seekBar.setOnSeekBarChangeListener(
                new OnSeekBarChangeListener() {
                    // トグルがドラッグされると呼ばれる
                    @Override
                    public void onProgressChanged(SeekBar seekBar,
                        int progress, boolean fromUser) {
                        textView.setText(String.valueOf(progress)+" %");
                    }
                    // トグルがタッチされた時に呼ばれる
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }
                    // トグルがリリースされた時に呼ばれる
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }
                    });

        // 音楽開始ボタン
        Button buttonStart = (Button) findViewById(R.id.audio_start);

        // リスナーをボタンに登録
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 音楽再生
                audioPlay();
            }
        });

        // 音楽停止ボタン
        Button buttonStop = (Button) findViewById(R.id.audio_stop);

        // リスナーをボタンに登録
        buttonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null) {
                    // 音楽停止
                    audioStop();
                }
            }
        });
    }

    private void audioPlay() {
        // インタンスを生成
        mediaPlayer = new MediaPlayer();

        //音楽ファイル名, あるいはパス

        try {
            // assetsから mp3 ファイルを読み込み
            AssetFileDescriptor afdescripter = getAssets().openFd(filePath);
            //MediaPlayerに読み込んだ音楽ファイルを指定
            mediaPlayer.setDataSource(afdescripter.getFileDescriptor(),
                    afdescripter.getStartOffset(),
                    afdescripter.getLength());
            mediaPlayer.prepare();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        // 再生する
        mediaPlayer.start();
    }

    private void audioStop() {
        mediaPlayer.stop();
    }

    public void one(View v) {
        layout.setBackgroundResource(R.drawable.image1);

        Toast.makeText(this, "Summer", Toast.LENGTH_SHORT).show();
        filePath = "1.mp3";
        audioPlay();
    }

    public void two(View v){
        layout.setBackgroundResource(R.drawable.image2);
        Toast.makeText(this, "アシタカ聶記", Toast.LENGTH_SHORT).show();
        filePath  = "1.mp3";
        audioStop();
        filePath = "2.mp3";
        audioPlay();
    }

    public void thee(View v){
        layout.setBackgroundResource(R.drawable.image3);
        Toast.makeText(this, "あの夏へ", Toast.LENGTH_SHORT).show();
        filePath  = "2.mp3";
        audioStop();
        filePath = "3.mp3";
        audioPlay();
    }

    public void four(View v){
        layout.setBackgroundResource(R.drawable.image4);
        Toast.makeText(this, "アシタカとサン", Toast.LENGTH_SHORT).show();
        filePath  = "3.mp3";
        audioStop();
        filePath = "4.mp3";
        audioPlay();
    }

    public void five(View v){
        layout.setBackgroundResource(R.drawable.image5);
        Toast.makeText(this, "Spirited Away", Toast.LENGTH_SHORT).show();
        filePath  = "4.mp3";
        audioStop();
        filePath = "5.mp3";
        audioPlay();
    }

    public void six(View v){
        layout.setBackgroundResource(R.drawable.image6);
        Toast.makeText(this, "もののけ姫", Toast.LENGTH_SHORT).show();
        filePath  = "5.mp3";
        audioStop();
        filePath = "6.mp3";
        audioPlay();
    }

    public void seven(View v){
        layout.setBackgroundResource(R.drawable.image7);
        Toast.makeText(this, "海の見える街", Toast.LENGTH_SHORT).show();
        filePath  = "6.mp3";
        audioStop();
        filePath = "7.mp3";
        audioPlay();
    }

    public void eight(View v){
        layout.setBackgroundResource(R.drawable.image8
        );
        Toast.makeText(this, "旅立ちの時", Toast.LENGTH_SHORT).show();
        filePath  = "7.mp3";
        audioStop();
        filePath = "8.mp3";
        audioPlay();
    }

    public void nine(View v){
        layout.setBackgroundResource(R.drawable.image9);
        Toast.makeText(this, "風の通り道", Toast.LENGTH_SHORT).show();
        filePath  = "8.mp3";
        audioStop();
        filePath = "9.mp3";
        audioPlay();
    }

    public void ten(View v){
        layout.setBackgroundResource(R.drawable.image10);
        Toast.makeText(this, "Spring", Toast.LENGTH_SHORT).show();
        filePath  = "9.mp3";
        audioStop();
        filePath = "10.mp3";
        audioPlay();
    }

}



