package com.example.a7mengineering;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.transition.Slide;

public class MainActivity extends AppCompatActivity{

    public static final String GOOGLE_ACCOUNT = "google_account";
    private GoogleSignInClient googleSignInClient;
    private NavigationView navigationView;
    private TextView profileName, profileEmail;
    private ImageView profileImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        final Context context = this.getApplicationContext();
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                 R.id.navigation_location_tag, R.id.navigation_tag,R.id.navigation_map)
                .build();
        navigationView = findViewById(R.id.navigation_drawer);
        profileImage = (ImageView) navigationView.getHeaderView(0).findViewById(R.id.profile_image1);
        profileName = navigationView.getHeaderView(0).findViewById(R.id.profileName);
        profileEmail = navigationView.getHeaderView(0).findViewById(R.id.profileMail);
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .requestProfile()
                .build();
        googleSignInClient = GoogleSignIn.getClient(this, gso);
        setDataOnView();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);


                navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.nav_item_profile:
                        break;
                    case R.id.nav_item_add_tag:
                        break;
                    case R.id.nav_item_add_location_tag:
                        break;

                    case R.id.nav_item_sign_out:
                        googleSignInClient.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {

                                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                            }
                        });
                        break;
                    case R.id.nav_item_exit:
                        finish();
                        System.exit(0);
                        break;
                    default:
                       break;
                }
                return true;
            }
        });
    }
    private void setDataOnView() {
        GoogleSignInAccount googleSignInAccount = getIntent().getParcelableExtra(GOOGLE_ACCOUNT);
        if(googleSignInAccount != null && googleSignInAccount.getPhotoUrl() != null)
        {
            Glide.with(profileImage.getContext()).load(googleSignInAccount.getPhotoUrl()).error(R.drawable.ic_launcher_background).dontAnimate().into(profileImage);
            profileName.setText(googleSignInAccount.getDisplayName());
            profileEmail.setText(googleSignInAccount.getEmail());
        }
    }
}
