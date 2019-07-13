package sarthak.bhatia.bottom_navigation_drawer;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import gr.net.maroulis.library.EasySplashScreen;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private TextView mTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(this);
        if(savedInstanceState==null)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.Fragment_container,new fragment_home(),"Home").commit();
//            navView.setOnNavigationItemSelectedListener();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        FragmentManager manager=getSupportFragmentManager();
        switch (menuItem.getItemId()) {
            case R.id.navigation_home:
                manager.beginTransaction().replace(R.id.Fragment_container,new fragment_home(),"Home").commit();
                return true;
            case R.id.navigation_dashboard:
                manager.beginTransaction().replace(R.id.Fragment_container,new fragment_Dashboard(),"Dashboard").commit();
                return true;
            case R.id.navigation_notifications:
                manager.beginTransaction().replace(R.id.Fragment_container,new fragment_notifications(),"Notifications").commit();
                return true;
        }
        return false;
    }
}




