package id.tam.pakarchanna;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFragment(new fragmentDaftar());

        BottomNavigationView menuNav = findViewById(R.id.MenuNavigasi);
        menuNav.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.TempatFragment,fragment).commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment terpilih = null;
        switch (item.getItemId()){
            case R.id.Daftar:
                terpilih = new fragmentDaftar();
                break;
            case R.id.Identifi:
                terpilih = new fragmentIdentifikasi();
                break;
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.TempatFragment,terpilih).commit();

        return loadFragment(terpilih);
    }


}