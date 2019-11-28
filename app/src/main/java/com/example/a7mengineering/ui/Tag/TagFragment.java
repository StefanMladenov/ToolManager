package com.example.a7mengineering.ui.Tag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.a7mengineering.R;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;

public class TagFragment extends Fragment {

    public static final String GOOGLE_ACCOUNT = "google_account";
    private String url = "http://i.pinimg.com/originals/23/8a/0f/238a0f68fc68065399204439a0f1c0da.jpg";
    private TextView profileName, profileEmail;
    private ImageView profileImage;
    private Button signOut;
    private View root;
    private GoogleSignInClient googleSignInClient;

    private TagViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(TagViewModel.class);
        root = inflater.inflate(R.layout.fragment_location_tag, container, false);

        return root;
    }
/*        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
 /*       SetOnStart();
        return root;
    }
    private void SetOnStart()
    {
    profileName = root.findViewById(R.id.profile_text);
    profileEmail = root.findViewById(R.id.profile_email);
    profileImage = root.findViewById(R.id.profile_image);
    signOut = root.findViewById(R.id.sign_out);
    GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .requestProfile()
            .build();
    googleSignInClient = GoogleSignIn.getClient(root.getContext(), gso);
    setDataOnView();
        signOut.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          *//*
          Sign-out is initiated by simply calling the googleSignInClient.signOut API. We add a
          listener which will be invoked once the sign out is the successful
           *//*
            googleSignInClient.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    //On Succesfull signout we navigate the user back to LoginActivity
                    Intent intent = new Intent(root.getContext(), LoginActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }
            });
        }
    });
}

    private void setDataOnView() {
        GoogleSignInAccount googleSignInAccount = getActivity().getIntent().getParcelableExtra(GOOGLE_ACCOUNT);
        if(googleSignInAccount != null && googleSignInAccount.getPhotoUrl() != null)
        {
            url = googleSignInAccount.getPhotoUrl().toString();
        }
        Log.e("URL", url);
        Glide.with(profileImage.getContext()).load(googleSignInAccount.getPhotoUrl()).error(R.drawable.ic_launcher_background).dontAnimate().into(profileImage);
        profileName.setText(googleSignInAccount.getDisplayName());
        profileEmail.setText(googleSignInAccount.getEmail());
    }*/
}