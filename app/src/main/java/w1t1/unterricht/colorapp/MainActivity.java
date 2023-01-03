package w1t1.unterricht.colorapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView tv1, tv2, tv3;
    private SeekBar seekBar, seekBar2, seekBar3;
    private View view;

    int red = 255, green = 255, blue = 255;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setMin(0);
        seekBar.setMax(255);
        seekBar2 = (SeekBar) findViewById(R.id.seekBar2);
        seekBar2.setMin(0);
        seekBar2.setMax(255);
        seekBar3 = (SeekBar) findViewById(R.id.seekBar3);
        seekBar3.setMin(0);
        seekBar3.setMax(255);

        view = (View) findViewById(R.id.view);
        tv1.setText("Rot = "+red);
        tv2.setText("Grün = "+green);
        tv3.setText("Blau = "+blue);

        view.setBackgroundColor(Color.rgb(red, green, blue));

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                red=progress;
                tv1.setText("Rot = "+red);
                view.setBackgroundColor(Color.rgb(red, green, blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {

            }
        });
        //-----------------------------------------------------------------------------------------
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                green=progress;
                tv2.setText("Green = "+green);
                view.setBackgroundColor(Color.rgb(red, green, blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {

            }
        });
        //------------------------------------------------------------------------------------------
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                blue=progress;
                tv3.setText("Blau = "+blue);
                view.setBackgroundColor(Color.rgb(red, green, blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {

            }
        });
    }
}