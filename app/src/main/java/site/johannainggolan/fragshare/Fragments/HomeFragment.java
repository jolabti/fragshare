package site.johannainggolan.fragshare.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import site.johannainggolan.fragshare.R;
import site.johannainggolan.fragshare.Utilize.Function;
import site.johannainggolan.fragshare.Utilize.Param;
import site.johannainggolan.fragshare.Utilize.PrefsConf;

public class HomeFragment extends Fragment {

    AppCompatButton buttonHome, buttonAuth = null;

    Fragment fragmentAuth=null;

    PrefsConf prefsConf;

    public static HomeFragment newInstance(){
        HomeFragment fragment = new HomeFragment();
        return  fragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prefsConf = PrefsConf.getInstance(getActivity());
        fragmentAuth = AuthFragment.newInstance();

 }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View homefragmentView = inflater.inflate(R.layout.homefragment, container, false);
        //
        if(homefragmentView!=null){
                buttonHome = homefragmentView.findViewById(R.id.home_nav_home_id);
                buttonAuth=  homefragmentView.findViewById(R.id.home_nav_login_id);
        }

        return homefragmentView;


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Logic ?

        //1 . OnClick. On Drag, Double Click



        buttonAuth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Function.processAction(getActivity(),fragmentAuth, Param.FLAG_AUTH,0,null);

            }
        });




    }

}

