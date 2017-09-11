package com.example.pc.forwardcam_01;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;


public class BluetoothFragment extends Fragment {

    public BluetoothFragment(){
    }
    @Override
    public void onCreate(Bundle savedInstanceState){  // 프래그먼트 생성시에 호출
        super.onCreate(savedInstanceState);
    }
    @Override                                         // 프래그먼트에는 onCreateView 라는 생명주기메소드가 존재, 프래그먼트 생성후 액티비티 구성시에 호출
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){ //inflater 이용해 xml 과 연결
        RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.bluetooth, container, false);
        return layout;
    }

}
