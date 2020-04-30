package com.example.modul5;

import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

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

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng sekolah = new LatLng(-7.9638034, 112.6385915);
        mMap.addMarker(new MarkerOptions().position(sekolah).title("SDN BUNULREJO 3"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sekolah));

        LatLng sekolah2 = new LatLng(-7.9637607, 112.6385915);
        mMap.addMarker(new MarkerOptions().position(sekolah2).title("SDN BUNULREJO 4"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sekolah2));

        LatLng sekolah3 = new LatLng(-7.9634765, 112.6375623);
        mMap.addMarker(new MarkerOptions().position(sekolah3).title("SDN BUNULREJO 6"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sekolah3));
    }
}
