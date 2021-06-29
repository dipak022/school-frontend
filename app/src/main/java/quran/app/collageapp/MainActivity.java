package quran.app.collageapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private BottomNavigationView bottomNavigationView;
    private NavController navController;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        drawerLayout = findViewById(R.id.DrawerLayout);
        navigationView = findViewById(R.id.navigation_view);

        toggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.start,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(this);

        navController = Navigation.findNavController(this,R.id.frame_layout);

        NavigationUI.setupWithNavController(bottomNavigationView,navController);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item)){
            return true;
        }
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nagative_developer:
                Toast.makeText(this, "Developer", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nagative_vedio:
                Toast.makeText(this, "Vedio", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nagative_rate:
                Toast.makeText(this, "Rate ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nagative_ebook:
                Toast.makeText(this, "Ebook", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nagative_themes:
                Toast.makeText(this, "Theme", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nagative_website:
                Toast.makeText(this, "Website", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nagative_sheare:
                Toast.makeText(this, "Sheare", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}