package site.johannainggolan.fragshare;

import android.app.Activity;
import android.os.Build;
import android.transition.Slide;
import android.view.Gravity;

import androidx.fragment.app.Fragment;

public class Function {

    public static void processAction(final Activity activity, Fragment fragment, String action, int target, Object object) {


        /*if (target == Param.TARGET_FRAGMENT) {
            ObjectTransfer.ProductBuyOverview productBuyOverview = (ObjectTransfer.ProductBuyOverview) object;
            if (activity instanceof ProductBuyActivity) {
                Fragment newFragment = ProductBuyOverviewFragment.newInstance(productBuyOverview.amount, productBuyOverview.total, new Gson().toJson(productBuyOverview.productPreview), new Gson().toJson(productBuyOverview.subscriptionOrder));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    Slide slideStart = new Slide();
                    slideStart.setSlideEdge(Gravity.LEFT);
                    Slide slideEnd = new Slide();
                    slideEnd.setSlideEdge(Gravity.RIGHT);

                    activity.getWindow().setEnterTransition(slideEnd);
                    activity.getWindow().setExitTransition(slideStart);
                    newFragment.setEnterTransition(slideEnd);
                    newFragment.setExitTransition(slideStart);
                }

                FragmentManager fragmentManager = ((AppCompatActivity) activity).getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.layout_container, newFragment)
                        .commit();
            }
        }*/

    }
}



