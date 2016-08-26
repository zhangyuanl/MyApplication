package zz.com.seekbar;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private SeekBar sb_normal;
    private Context mContext;
    private TextView tv_progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = MainActivity.this;
        initView();

    }

    private void initView() {
        sb_normal = (SeekBar) findViewById(R.id.sb_normal);
        tv_progress = (TextView) findViewById(R.id.tv_progress);
        sb_normal.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            /**
             * 进度发生改变时会触发
             */

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                tv_progress.setText("当前进度值:" + progress + "  / 100 ");
            }

            /**
             * 按住SeekBar时会触发
             * @param seekBar
             */
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(mContext, "触碰SeekBar", Toast.LENGTH_SHORT).show();
            }

            /**
             * 松开SeekBar时会触发
             * @param seekBar
             */
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(mContext, "放开SeekBar", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
