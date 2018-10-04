package nontachai.becomedev.uninstaller;

import android.app.Activity;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class admob {
	
	private static String admBanner = "ca-app-pub-1787292132881960/2075570327";

	public static void admobBannerCall(Activity acitivty , LinearLayout linerlayout){
		
        AdView adView = new AdView(acitivty);
        adView.setAdUnitId(admBanner);
        adView.setAdSize(AdSize.BANNER);
        AdRequest.Builder builder = new AdRequest.Builder();
        adView.loadAd(builder.build());
        linerlayout.addView(adView);

	}


	public static void admob(Activity activity){
	    AdView adView = new AdView(activity);
	    adView.setAdUnitId(admBanner);
	    adView.setAdSize(AdSize.BANNER);
	    AdRequest.Builder builder = new AdRequest.Builder();
    }
	
}