package nakayoshikoyoshi.hackthon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class avatar_setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatar_setting);

        // Spinnerオブジェクトを取得
        Spinner spinner = (Spinner)findViewById(R.id.ava_hed);

        // 選択されているアイテムのIndexを取得
        int idx = spinner.getSelectedItemPosition();

        // 選択されているアイテムを取得
        String item_hed = (String)spinner.getSelectedItem();

//        final TextView textView = (TextView) findViewById(R.id.text_ava);
//        TextView.setText(String.valueOf(item_hed));
    }
}
