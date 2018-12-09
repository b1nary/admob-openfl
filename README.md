I had issues getting anything working with `extension-admob` i found this lib by @pozirk which worked but didnt offer Rewarded ads yet and used the wrong JNI for a current flixel setup. This fork tries to update the extension as well as including additional Admob features to offer Rewarded Ads. 

---
`Copy pasta:`

Introduction
============

Admob OpenFL Extension. (Android only)
More info on Admob: https://developers.google.com/mobile-ads-sdk/


Platforms
=========
Android (Anyone willing to extend it to support iOS? Contact me!)


License
=======
Admob OpenFL Extension is free, open-source software under the [MIT license](LICENSE.md).


Installation
=======
You can easily install Admob extension using haxelib:

	haxelib install admob-openfl

To add it to a OpenFL project, add this to your project file:

	<haxelib name="admob-openfl" />


Usage
=======
```haxe
import com.pozirk.ads.Admob;
import com.pozirk.ads.AdmobEvent;

...

_admob = new Admob();
_admob.addEventListener(AdmobEvent.INIT_OK, onAdmobInit);
_admob.addEventListener(AdmobEvent.INTERSTITIAL_CACHE_OK, onAdmobCache);
_admob.init(); //you can only use Admob after successful initialization

...

function onAdmobInit(ae:AdmobEvent):Void
{
	_admob.showAd([Ad unit ID], Admob.SIZE_LEADERBOARD, Admob.HALIGN_CENTER, Admob.VALIGN_TOP);
	_admob.cacheInterstitial([Ad unit ID]);
}

...

private function onAdmobCache(ae:AdmobEvent):Void
{
	_admob.showInterstitial();
}
```
