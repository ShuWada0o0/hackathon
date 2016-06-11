package nakayoshikoyoshi.hackthon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;

public class TitleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent e) {

        // 戻るボタンが押されたとき
        if(e.getKeyCode() == KeyEvent.KEYCODE_BACK) {
            // 後ろは振り返らない
            return true;
        }
        return super.dispatchKeyEvent(e);
    }
}
