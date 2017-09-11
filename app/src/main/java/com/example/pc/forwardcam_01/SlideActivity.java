package com.example.pc.forwardcam_01;

import android.os.Bundle;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.rd.PageIndicatorView;

public class SlideActivity extends AppCompatActivity {

    ViewPager vp; // 뷰페이지 변수 선언

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slidemain);

        // 아이디로 뷰페이지와 각 버튼을 컨트롤 할 수 있게 함
        vp=(ViewPager)findViewById(R.id.vp);
        vp.setAdapter(new pagerAdapter(getSupportFragmentManager())); // 리스트뷰에도 쓰이는 어댑터는 각 뷰에 데이터를 뿌려주는 역할을 함.
        vp.setCurrentItem(0);                                        // 앱이 실행되었을 때 첫번째 페이지로 초기화 시키는 부분


        PageIndicatorView pageIndicatorView = (PageIndicatorView) findViewById(R.id.pageIndicatorView);
        pageIndicatorView.setViewPager(vp);
    }


    private class pagerAdapter extends FragmentStatePagerAdapter
    {
        public pagerAdapter(android.support.v4.app.FragmentManager fm)
        {
            super(fm);
        }
        @Override
        public android.support.v4.app.Fragment getItem(int position)
        {
            switch(position)
            {
                case 0:
                    return new CircleFragment();  // 포지션에 따라 생성해놓은 클래스를 부름
                case 1:
                    return new HealthFragment(); // ""
                case 2:
                    return new BluetoothFragment();  // ""
                default:
                    return null;
            }
        }
        @Override
        public int getCount() // ViewPager 안에 들어가는 Page 의 갯수
        {
            return 3;
        }
    }

}
