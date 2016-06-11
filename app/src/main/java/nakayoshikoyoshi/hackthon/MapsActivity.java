package nakayoshikoyoshi.hackthon;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.KeyEvent;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.CameraUpdate;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // 拡大縮小、移動など全てを禁止する
        UiSettings settings = mMap.getUiSettings();
        settings.setAllGesturesEnabled(false);
        settings.setZoomControlsEnabled(true);

        // 位置をそれぞれ記憶
        LatLng tokyo = new LatLng(35.708953, 139.730978);
        LatLng hakodate = new LatLng(41.792907, 140.755731);
        LatLng hakodateStation = new LatLng(41.774048, 140.726415);
        LatLng goryokaku = new LatLng(41.798471, 140.757089);
        LatLng goryokakuStation = new LatLng(41.805079, 140.733436);


        mMap.addMarker(new MarkerOptions().position(hakodate).title("病院"));
        mMap.addMarker(new MarkerOptions().position(hakodateStation).title("函館駅"));
        mMap.addMarker(new MarkerOptions().position(goryokaku).title("五稜郭"));
        mMap.addMarker(new MarkerOptions().position(goryokakuStation).title("五稜郭駅"));

        CameraPosition cameraPosition = CameraPosition.builder()
                .target(tokyo)
                .tilt(45)
                .zoom(5f)
                .build();

        CameraUpdate update = CameraUpdateFactory.newCameraPosition(cameraPosition);

        mMap.moveCamera(update);

        cameraPosition = CameraPosition.builder()
                .target(hakodate)
                .zoom(13f)
                .bearing(0)
                .tilt(60)
                .build();

        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition),
                3000, null);

>>>>>>> 20048878a585956fd5ac47ba6a3f793f89c3ed73
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
