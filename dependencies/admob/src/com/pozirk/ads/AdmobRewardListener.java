package com.pozirk.ads;

//import android.util.Log;
import com.google.android.gms.ads.RewardedVideoAdListener;
import com.google.android.gms.ads.AdRequest;
import org.haxe.lime.HaxeObject;

public class AdmobRewardListener extends RewardedVideoAdListener
{
	protected HaxeObject _callback = null;
	protected String _who = null;
	
	public AdmobListener(HaxeObject callback, String who)
	{
		_callback = callback;
		_who = who;
	}

@Override
public void onRewarded(RewardItem reward) {
    _callback.call("onStatus", new Object[] {_who+"_ON_REWARDED", ""});
}

@Override
public void onRewardedVideoAdLeftApplication() {
    _callback.call("onStatus", new Object[] {_who+"_ON_REWARDED_VIDEO_AD_LEFT_APPLICATION", ""});

}

@Override
public void onRewardedVideoAdClosed() {
    _callback.call("onStatus", new Object[] {_who+"_ON_REWARDED_VIDEO_AD_CLOSED", ""});
}

@Override
public void onRewardedVideoAdFailedToLoad(int errorCode) {
    _callback.call("onStatus", new Object[] {_who+"_ON_REWARDED_VIDEO_AD_FAILED_TO_LOAD", ""});
}

}

@Override
public void onRewardedVideoAdLoaded() {
    _callback.call("onStatus", new Object[] {_who+"_ON_REWARDED_VIDEO_AD_LOADED", ""});
}

@Override
public void onRewardedVideoAdOpened() {
    _callback.call("onStatus", new Object[] {_who+"_ON_REWARDED_VIDEO_AD_OPENED", ""});
}

@Override
public void onRewardedVideoStarted() {
    _callback.call("onStatus", new Object[] {_who+"_ON_REWARDED_VIDEO_STARTED", ""});
}

@Override
public void onRewardedVideoCompleted() {
    _callback.call("onStatus", new Object[] {_who+"_ON_REWARDED_VIDEO_COMPLETED", ""});
}
