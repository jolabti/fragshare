package site.johannainggolan.fragshare.Fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;

import site.johannainggolan.fragshare.R;
import site.johannainggolan.fragshare.Utilize.Param;
import site.johannainggolan.fragshare.Utilize.PrefsConf;

public class AuthFragment extends Fragment {

    AppCompatEditText edUsername, edPassword, edPhone = null;
    AppCompatButton btnSubmit =null;

    String username, password, phone;

    PrefsConf prefsConf;
    public static AuthFragment newInstance(){
        AuthFragment fragment = new AuthFragment();
        return  fragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        prefsConf = PrefsConf.getInstance(getActivity());
 }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View authfragmentView = inflater.inflate(R.layout.authfragment, container, false);
        //
        if(authfragmentView !=null){

            edUsername = authfragmentView.findViewById(R.id.auth_username_id);
            edPassword = authfragmentView.findViewById(R.id.auth_password_id);
            edPhone = authfragmentView.findViewById(R.id.auth_phone_id);

            btnSubmit = authfragmentView.findViewById(R.id.auth_submit_id);




        }

        return authfragmentView;


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Log.d("trace_username", edUsername.getText().toString());
//                Log.d("trace_password", edPassword.getText().toString());
//                Log.d("trace_phone", edPhone.getText().toString());
                    username = edUsername.getText().toString();
                    password =  edPassword.getText().toString();
                    phone = edPhone.getText().toString();

                  Log.d("trace_me", "asdadsa");
                  Log.d("trace_me", phone == null ? "phonul" : phone);
                  Log.d("trace_me", password == null ? "passnull" : password);
                  Log.d("trace_me", username == null ? "usernull" : username);

                  prefsConf.putString(Param.KEY_USERNAME,username);
                  prefsConf.putString(Param.KEY_PASSWORD,password);
                  prefsConf.putString(Param.KEY_PHONE,phone);
            }
        });


        // Logic ?

        //1 . OnClick. On Drag, Double Click



    }

}

