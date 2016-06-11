package nakayoshikoyoshi.hackthon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.nifty.cloud.mb.core.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NCMB.initialize(this.getApplicationContext(),"c8f96daf588514d289221caf7a8872424ab9d3aba29b1794fb3962a1062d511c","041b0acbd4109e5f5afd560b73db53ac3e30307b4269e9f95569deeb2f435cc1");

        NCMBObject obj = new NCMBObject("TestClass");
        obj.put("message", "Hello, NCMB!");
        obj.saveInBackground(new DoneCallback() {
            @Override
            public void done(NCMBException e) {
                if(e != null){
                    //保存失敗
                }else {
                    //保存成功
                }
            }
        });

    }
}
