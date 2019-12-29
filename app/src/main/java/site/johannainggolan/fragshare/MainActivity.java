package site.johannainggolan.fragshare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import site.johannainggolan.fragshare.Fragments.AuthFragment;
import site.johannainggolan.fragshare.Fragments.HomeFragment;

public class MainActivity extends AppCompatActivity {

    Fragment myHomeFragment, myAuthFragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myHomeFragment = HomeFragment.newInstance();
        myAuthFragment = AuthFragment.newInstance();

        manageFragment(myHomeFragment);

        //

    }

    public void manageFragment(Fragment currentFragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager
                .beginTransaction()
                .replace(R.id.layout_container, currentFragment)
                .commit();
    }


    /*
    *FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.layout_main, fragment)
                        .commit();
    *
    * */
}
