package com.allsocialsite.bd;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.allsocialsite.bd.navigationDrawer.HomeActivity;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import java.util.ArrayList;
import java.util.Locale;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.NativeExpressAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
//import com.google.android.gms.ads.formats.UnifiedNativeAd;
//import com.google.android.gms.ads.formats.UnifiedNativeAdView;
//import com.google.android.gms.ads.initialization.InitializationStatus;
//import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;



public class MainActivity extends AppCompatActivity   {

    String[] population;
    int[] flag;

    //RelativeLayout relativeLayout;
   //private ArrayList<String> dataArray = new ArrayList<String>();
    private ArrayList<model> dataArray = new ArrayList<model>();

    //ListView listView;
    GridView gridView;
    TextView tv;
    imageloadera gridAdapter;

    String[] values = {
            "Google", "Bing Search", "Yahoo", "Facebook", "Massenger", "Twitter",
           "Instagram", "Linkedin", "Pinterest", "Quora", "VK",
            "Reddit", "Skype", "Telegram", "Snapchat","HI5","Tumblr","Flicker","Meet up"," Meet Me",
            "Buzz feed","Stumbleupon","Digg","imgur","Medium",
            "Youtube","Vimeo","Daily Motion","Amazon","ebay","Google Drive","OneDrive","Dropbox","Netflix","Lastfm","Soundcloud",
            "Box","Skout","ICQ","Path","Vine","BEBO","Myspace","QQ","Taringa","Baidu Tieba","Hitwe","QZone"};


    int[] images = { R.drawable.google,R.drawable.bing, R.drawable.yahoo, R.drawable.facebook,
            R.drawable.massenger, R.drawable.twitter, R.drawable.instagram, R.drawable.linkedin, R.drawable.pinterest, R.drawable.quora,
            R.drawable.vk, R.drawable.reddit, R.drawable.skype, R.drawable.telegram, R.drawable.snapchat,
            R.drawable.hi5, R.drawable.tumblr, R.drawable.flicker, R.drawable.meetup,R.drawable.meetme,
            R.drawable.buzzfeed,R.drawable.stumbleupon,R.drawable.digg,R.drawable.imgur,R.drawable.medium,
            R.drawable.youtube,R.drawable.vimeo,R.drawable.dailymotion,R.drawable.amazon,R.drawable.ebay,
            R.drawable.googledrive,R.drawable.onedrive,R.drawable.dropbox,R.drawable.netflix,R.drawable.lastfm,R.drawable.soundcloud,R.drawable.box,
            R.drawable.skout,R.drawable.icq,R.drawable.path,R.drawable.vine,R.drawable.bebo,R.drawable.myspace,R.drawable.qq,R.drawable.taringa,R.drawable.baidutieba,
            R.drawable.hitwe,R.drawable.qzone
    };
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    //AdLoader adLoader;

SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        dataArray.add("Google");
        dataArray.add("Bing Search");
        dataArray.add("Yahoo");
        dataArray.add("Facebook");
        dataArray.add("Massenger");
        dataArray.add("Twitter");
        dataArray.add("Instagram");
        dataArray.add("Linkedin");
        dataArray.add("Pinterest");
        dataArray.add("Quora");
        dataArray.add("VK");
        dataArray.add("Reddit");
        dataArray.add("Skype");
        dataArray.add("Telegram");
        dataArray.add("Snapchat");
        dataArray.add("HI5");
        dataArray.add("Tumblr");
        dataArray.add("Flicker");
        dataArray.add("Meetup");
        dataArray.add("Meet Me");
        dataArray.add("Buzzfeed");
        dataArray.add("Stumbleupon");
        dataArray.add("Digg");
        dataArray.add("imgur");
        dataArray.add("Medium");
        dataArray.add("Youtube");
        dataArray.add("Vimeo");
        dataArray.add("Daily Motion");
        dataArray.add("Amazon");
        dataArray.add("ebay");
        dataArray.add("Google Drive");
        dataArray.add("OneDrive");
        dataArray.add("Dropbox");
        dataArray.add("Netflix");
        dataArray.add("Lastfm");
        dataArray.add("Soundcloud");
        dataArray.add("Box");
        dataArray.add("Skout");
        dataArray.add("ICQ");
        dataArray.add("Path");
        dataArray.add("Vine");
        dataArray.add("BEBO");
        dataArray.add("Myspace");
        dataArray.add("QQ");
        dataArray.add("Taringa");
        dataArray.add("Baidu Tieba");
        dataArray.add("Hitwe");
        dataArray.add("QZone");

*/








         MobileAds.initialize(this, new OnInitializationCompleteListener() {
           @Override
          public void onInitializationComplete(InitializationStatus initializationStatus) {
         }
         });

        //searchView.setOnQueryTextListener(this);

        //gridView.setTextFilterEnabled(true);



        mAdView = findViewById(R.id.adViewa);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        AdView adView = new AdView(this);
        //adView.setAdSize(AdSize.BANNER);adView.setAdUnitId("ca-app-pub-3487964273102942/1118529417"); //real ads

        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-3487964273102942/1118529417"); //my ads

        //adView.setAdSize(AdSize.BANNER);adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111"); //test ads
        mInterstitialAd = new InterstitialAd(this);

        mInterstitialAd.setAdUnitId("ca-app-pub-3487964273102942/6716332846");  //my  ad
       //mInterstitialAd.setAdUnitId("ca-app-pub-6683817215041706/9604240709");  //test ad
        //mInterstitialAd.setAdUnitId("ca-app-pub-3487964273102942/6716332846");  //real  ad





        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {

                showInterstitialAd();
            }
        });


    //relativeLayout=(RelativeLayout)findViewById(R.id.ad);


/*
        //Native Ads Advanced (Unified) to load   ca-app-pub-6683817215041706/2722798277

        adLoader = new AdLoader.Builder(MainActivity.this, "ca-app-pub-6683817215041706/2722798277")
                .forUnifiedNativeAd(new UnifiedNativeAd.OnUnifiedNativeAdLoadedListener() {


         //test ad code   ca-app-pub-3940256099942544/2247696110




                    AdLoader adLoader = new AdLoader.Builder(MainActivity.this, "ca-app-pub-6683817215041706/2722798277")
                            .forUnifiedNativeAd(new UnifiedNativeAd.OnUnifiedNativeAdLoadedListener() {
                                @Override
                                public void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {

                                    //relativeLayout.setVisibility(View.VISIBLE);

                                    // Show the ad.


                                }
                            })
                            .withAdListener(new AdListener() {
                                @Override
                                public void onAdFailedToLoad(int errorCode) {


                                   // relativeLayout.setVisibility(View.GONE);

                                    // Handle the failure by logging, altering the UI, and so on.
                                }
                            })
                            .withNativeAdOptions(new NativeAdOptions.Builder()
                                    // Methods in the NativeAdOptions.Builder class can be
                                    // used here to specify individual options settings.
                                    .build())
                            .build();








                    @RequiresApi(api = Build.VERSION_CODES.M)
                    @Override
                    public void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
                        // Assumes you have a placeholder FrameLayout in your View layout
                        // (with id fl_adplaceholder) where the ad is to be placed.
                        //FrameLayout frameLayout =
                               // findViewById(R.id.frame);
                        // Assumes that your ad layout is in a file call ad_unified.xml
                        // in the res/layout folder
                        UnifiedNativeAdView adView = (UnifiedNativeAdView) getLayoutInflater()
                                .inflate(R.layout.unified_ads, null);
                        // This method sets the text, images and the native ad, etc into the ad
                        // view.
                        populateUnifiedNativeAdView(unifiedNativeAd, adView);
                      //  frameLayout.removeAllViews();
                       // frameLayout.addView(adView);

                        relativeLayout.setVisibility(View.VISIBLE);


                    }
                })
                .withAdListener(new AdListener() {
                    @Override
                    public void onAdFailedToLoad(int errorCode) {

                        relativeLayout.setVisibility(View.GONE);

                    }
                })
                .withNativeAdOptions(new NativeAdOptions.Builder()
                        // Methods in the NativeAdOptions.Builder class can be
                        // used here to specify individual options settings.
                        .build())
                .build();
        adLoader.loadAds(new AdRequest.Builder().build(), 3);

//native ads end

*/

        gridView = (GridView) findViewById(R.id.griview);
        //for (int i = 0; i < data.length; i++) {
        //data animalNames = new data(animalNameList[i]);
        // Binds all strings into an array
        //arraylist.add(animalNames);

        /*
        for (int i = 0; i < values.length; i++)
        {
            model wp = new model(values[i], images[i]);
            // Binds all strings into an array
            dataArray.add(wp);
        }
*/


         gridAdapter = new imageloadera(this, dataArray);




        gridView.setAdapter(gridAdapter);
        this.gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> adapterView, View view, int n, long l) {
                if (n == 0) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 1));
                    return;
                }
                if (n == 1) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 2));
                    return;
                }
                if (n == 2) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 3));
                    return;
                }
                if (n == 3) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 4));
                    return;
                }
                if (n == 4) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 5));
                    return;
                }
                if (n == 5) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 6));
                    return;
                }
                if (n == 6) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 7));
                    return;
                }
                if (n == 7) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 8));
                    return;
                }
                if (n == 8) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 9));
                    return;
                }
                if (n == 9) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 10));
                    return;
                }
                if (n == 10) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 11));
                    return;
                }
                if (n == 11) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 12));
                    return;
                }
                if (n == 12) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 13));
                    return;
                }
                if (n == 13) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 14));
                    return;
                }
                if (n == 14) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 15));
                    return;
                }
                if (n == 15) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 16));
                    return;
                }
                if (n == 16) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 17));
                    return;
                }
                if (n == 17) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 18));
                    return;
                }
                if (n == 18) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 19));
                    return;
                }
                if (n == 19) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 20));
                    return;
                }
                if (n == 20) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 21));
                    return;
                }
                if (n == 21) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 22));
                    return;
                }
                if (n == 22) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 23));
                    return;
                }
                if (n == 23) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 24));
                    return;
                }
                if (n == 24) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 25));
                    return;
                }
                if (n == 25) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 26));
                    return;
                }
                if (n == 26) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 27));
                    return;
                }
                if (n == 27) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 28));
                    return;
                }
                if (n == 28) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 29));
                    return;
                }
                if (n == 29) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 30));
                    return;
                }
                if (n == 30) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 31));
                    return;
                }
                if (n == 31) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 32));
                    return;
                }
                if (n == 32) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 33));
                    return;
                }
                if (n == 33) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 34));
                    return;
                }
                if (n == 34) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 35));
                    return;
                }
                if (n == 35) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 36));
                    return;
                }
                if (n == 36) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 37));
                    return;
                }
                if (n == 37) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 38));
                    return;
                }
                if (n == 38) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 39));
                    return;
                }
                if (n == 39) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 40));
                    return;
                }
                if (n == 40) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 41));
                    return;
                }
                if (n == 41) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 42));
                    return;
                }
                if (n == 42) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 43));
                    return;
                }
                if (n == 43) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 44));
                    return;
                }
                if (n == 44) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 45));
                    return;
                }
                if (n == 45) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 46));
                    return;
                }
                if (n == 46) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 47));
                    return;
                }
                if (n == 47) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 48));
                    return;
                }
                if (n == 43) {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.startActivity(new Intent((Context)mainActivity, webview.class).putExtra("v", 49));
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_menu, menu);

        // Associate searchable configuration with the SearchView
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        searchView = (SearchView) menu.findItem(R.id.action_search)
                .getActionView();
        searchView.setSearchableInfo(searchManager
                .getSearchableInfo(getComponentName()));
        searchView.setMaxWidth(Integer.MAX_VALUE);

        // listening to search query text change

        SearchView.OnQueryTextListener textChangeListener = new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextChange(String newText) {
                // this is your adapter that will be filtered
                gridAdapter.filter(newText);
                //System.out.println("on text chnge text: " + newText);

                // TODO Auto-generated method stub
                //String text = searchView.getText().toString().toLowerCase(Locale.getDefault());
                //gridAdapter.filter(text);





                return true;
            }

            @Override
            public boolean onQueryTextSubmit(String query) {
                // this is your adapter that will be filtered
                //gridAdapter.filter(query);

               // System.out.println("on query submit: " + query);
                return true;
            }
        };
        searchView.setOnQueryTextListener(textChangeListener);


        return true;
    }
    /*
    private void populateUnifiedNativeAdView(UnifiedNativeAd nativeAd, UnifiedNativeAdView adView) {
        // Set the media view. Media content will be automatically populated in the media view once
        // adView.setNativeAd() is called.
        MediaView mediaView = adView.findViewById(R.id.ad_media);
        adView.setMediaView(mediaView);

        // Set other ad assets.
        adView.setHeadlineView(adView.findViewById(R.id.ad_headline));
        adView.setBodyView(adView.findViewById(R.id.ad_body));
        adView.setCallToActionView(adView.findViewById(R.id.ad_call_to_action));
        adView.setIconView(adView.findViewById(R.id.ad_app_icon));
        adView.setPriceView(adView.findViewById(R.id.ad_price));
        adView.setStarRatingView(adView.findViewById(R.id.ad_stars));
        adView.setStoreView(adView.findViewById(R.id.ad_store));
        adView.setAdvertiserView(adView.findViewById(R.id.ad_advertiser));

        // The headline is guaranteed to be in every UnifiedNativeAd.
        ((TextView) adView.getHeadlineView()).setText(nativeAd.getHeadline());

        // These assets aren't guaranteed to be in every UnifiedNativeAd, so it's important to
        // check before trying to display them.
        if (nativeAd.getBody() == null) {
            adView.getBodyView().setVisibility(View.INVISIBLE);
        } else {
            adView.getBodyView().setVisibility(View.VISIBLE);
            ((TextView) adView.getBodyView()).setText(nativeAd.getBody());
        }

        if (nativeAd.getCallToAction() == null) {
            adView.getCallToActionView().setVisibility(View.INVISIBLE);
        } else {
            adView.getCallToActionView().setVisibility(View.VISIBLE);
            ((Button) adView.getCallToActionView()).setText(nativeAd.getCallToAction());
        }

        if (nativeAd.getIcon() == null) {
            adView.getIconView().setVisibility(View.GONE);
        } else {
            ((ImageView) adView.getIconView()).setImageDrawable(
                    nativeAd.getIcon().getDrawable());
            adView.getIconView().setVisibility(View.VISIBLE);
        }

        if (nativeAd.getPrice() == null) {
            adView.getPriceView().setVisibility(View.INVISIBLE);
        } else {
            adView.getPriceView().setVisibility(View.VISIBLE);
            ((TextView) adView.getPriceView()).setText(nativeAd.getPrice());
        }

        if (nativeAd.getStore() == null) {
            adView.getStoreView().setVisibility(View.INVISIBLE);
        } else {
            adView.getStoreView().setVisibility(View.VISIBLE);
            ((TextView) adView.getStoreView()).setText(nativeAd.getStore());
        }

        if (nativeAd.getStarRating() == null) {
            adView.getStarRatingView().setVisibility(View.INVISIBLE);
        } else {
            ((RatingBar) adView.getStarRatingView())
                    .setRating(nativeAd.getStarRating().floatValue());
            adView.getStarRatingView().setVisibility(View.VISIBLE);
        }

        if (nativeAd.getAdvertiser() == null) {
            adView.getAdvertiserView().setVisibility(View.INVISIBLE);
        } else {
            ((TextView) adView.getAdvertiserView()).setText(nativeAd.getAdvertiser());
            adView.getAdvertiserView().setVisibility(View.VISIBLE);
        }

        // This method tells the Google Mobile Ads SDK that you have finished populating your
        // native ad view with this native ad. The SDK will populate the adView's MediaView
        // with the media content from this native ad.
        adView.setNativeAd(nativeAd);


    }
*/
    private void showInterstitialAd() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }





}