package com.allsocialsite.bd;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;


import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
//import com.google.android.material.snackbar.Snackbar;
//import com.sa90.materialarcmenu.ArcMenu;
//import com.sa90.materialarcmenu.StateChangeListener;
//import com.google.android.gms.ads.initialization.InitializationStatus;
//import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import androidx.appcompat.app.AppCompatActivity;

public class webview extends AppCompatActivity {

   // ArcMenu arcMenu;

    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    ProgressBar progressBar;
    WebView wv;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {


            }
        });


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-8945974013998263/8804585347"); //real ads

        //adView.setAdUnitId("ca-app-pub-3487964273102942/1118529417"); //my ads
        //adView.setAdSize(AdSize.BANNER);
        //adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111"); //test ads
        mInterstitialAd = new InterstitialAd(this);

        //mInterstitialAd.setAdUnitId("ca-app-pub-6683817215041706/9604240709");  //test ad
        //mInterstitialAd.setAdUnitId("ca-app-pub-6683817215041706/4116614883");  //real  ad

        mInterstitialAd.setAdUnitId("ca-app-pub-8945974013998263/3743830357");  //my  ads

        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {

                showInterstitialAd();
            }
        });

/*
        arcMenu = findViewById(R.id.arcMenu);
        arcMenu.setRadius(getResources().getDimension(R.dimen.radius));


        arcMenu.setRadius(getResources().getDimension(R.dimen.radius));

        arcMenu.setStateChangeListener(new StateChangeListener() {
            @Override
            public void onMenuOpened() {
                Snackbar.make(arcMenu, "Menu Opened", Snackbar.LENGTH_SHORT).show();

                if (arcMenu.mDrawable instanceof Animatable)
                    ((Animatable) arcMenu.mDrawable).start();
            }

            @Override
            public void onMenuClosed() {
                Snackbar.make(arcMenu, "Menu Closed", Snackbar.LENGTH_SHORT).show();
            }
        });




        findViewById(R.id.fab1).setOnClickListener(subMenuClickListener);
        findViewById(R.id.tvNext).setOnClickListener(mNextClickListener);
        findViewById(R.id.tvAnimationDemo).setOnClickListener(mAnimationTimeDemoClickListener);
        findViewById(R.id.tvTopPlacement).setOnClickListener(mTopPlacementClickListener);

*/










    progressBar = (ProgressBar) findViewById(R.id.Pbar);

        wv = (WebView) findViewById(R.id.wv);
        //WebSettings webSettings = wv.getSettings();
        //webSettings.setJavaScriptEnabled(true);

        bundle = getIntent().getExtras();
        int value = bundle.getInt("v");

        if (value == 0) {

            wv.getSettings().setLoadsImagesAutomatically(true);
            wv.getSettings().setJavaScriptEnabled(true);
            wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
            wv.setWebViewClient(new WebViewClient());
            wv.setVisibility(View.VISIBLE);
            wv.loadUrl("http://www.google.com");


            wv.setWebViewClient(new
                                        WebViewClient() {


                                            @Override
                                            public boolean
                                            shouldOverrideUrlLoading(WebView view,
                                                                     String url) {
                                                view.loadUrl(url);
                                                progressBar.setVisibility(View.VISIBLE);

                                                return true;
                                            }

                                            @Override
                                            public void onPageFinished(WebView view, String url) {
                                                // TODO Auto-methiod stub
                                                super.onPageFinished(view, url);
                                                progressBar.setVisibility(View.GONE);


                                            }


                                        });

        }
        if (value == 1) {
            wv.getSettings().setLoadsImagesAutomatically(true);
            wv.getSettings().setJavaScriptEnabled(true);
            wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
            wv.setWebViewClient(new WebViewClient());
            wv.setVisibility(View.VISIBLE);
            wv.loadUrl("http://www.bing.com");

            wv.setWebViewClient(new
                                        WebViewClient() {


                                            @Override
                                            public boolean
                                            shouldOverrideUrlLoading(WebView view,
                                                                     String url) {
                                                view.loadUrl(url);
                                                progressBar.setVisibility(View.VISIBLE);

                                                return true;
                                            }

                                            @Override
                                            public void onPageFinished(WebView view, String url) {
                                                // TODO Auto-methiod stub
                                                super.onPageFinished(view, url);
                                                progressBar.setVisibility(View.GONE);


                                            }


                                        });
        }
        //detailsTextV.setText("");}
        if (value == 2) {
            wv.getSettings().setLoadsImagesAutomatically(true);
            wv.getSettings().setJavaScriptEnabled(true);
            wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
            wv.setWebViewClient(new WebViewClient());
            wv.setVisibility(View.VISIBLE);
            wv.loadUrl("http://www.Yahoo.com");

            wv.setWebViewClient(new
                                        WebViewClient() {


                                            @Override
                                            public boolean
                                            shouldOverrideUrlLoading(WebView view,
                                                                     String url) {
                                                view.loadUrl(url);
                                                progressBar.setVisibility(View.VISIBLE);

                                                return true;
                                            }

                                            @Override
                                            public void onPageFinished(WebView view, String url) {
                                                // TODO Auto-methiod stub
                                                super.onPageFinished(view, url);
                                                progressBar.setVisibility(View.GONE);


                                            }


                                        });

        }
        if (value == 3) {

            wv.getSettings().setLoadsImagesAutomatically(true);
            wv.getSettings().setJavaScriptEnabled(true);
            wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
            wv.setWebViewClient(new WebViewClient());
            wv.setVisibility(View.VISIBLE);
            wv.loadUrl("http://www.facebook.com");

            wv.setWebViewClient(new
                                        WebViewClient() {


                                            @Override
                                            public boolean
                                            shouldOverrideUrlLoading(WebView view,
                                                                     String url) {
                                                view.loadUrl(url);
                                                progressBar.setVisibility(View.VISIBLE);

                                                return true;
                                            }

                                            @Override
                                            public void onPageFinished(WebView view, String url) {
                                                // TODO Auto-methiod stub
                                                super.onPageFinished(view, url);
                                                progressBar.setVisibility(View.GONE);


                                            }


                                        });


        }
        if (value == 5) {
            wv.getSettings().setLoadsImagesAutomatically(true);
            wv.getSettings().setJavaScriptEnabled(true);
            wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
            wv.setWebViewClient(new WebViewClient());
            wv.setVisibility(View.VISIBLE);
            wv.loadUrl("https://www.messenger.com/");

            wv.setWebViewClient(new
                                        WebViewClient() {



                                            @Override
                                            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                                    //cookieManager.setAcceptThirdPartyCookies(wv,true);
                                                }


                                                if(!(url.startsWith("intent"))){
                                                    view.loadUrl(url);
                                                }
                                                return true;
                                            }




                                            @Override
                                            public void onPageFinished(WebView view, String url) {
                                                // TODO Auto-methiod stub
                                                super.onPageFinished(view, url);
                                                progressBar.setVisibility(View.GONE);


                                            }


                                        });

        }
        if (value == 6) {
            wv.getSettings().setLoadsImagesAutomatically(true);
            wv.getSettings().setJavaScriptEnabled(true);
            wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
            wv.setWebViewClient(new WebViewClient());
            wv.setVisibility(View.VISIBLE);
            wv.loadUrl("http://www.Twitter.com");

            wv.setWebViewClient(new
                                        WebViewClient() {


                                            @Override
                                            public boolean
                                            shouldOverrideUrlLoading(WebView view,
                                                                     String url) {
                                                view.loadUrl(url);
                                                progressBar.setVisibility(View.VISIBLE);

                                                return true;
                                            }

                                            @Override
                                            public void onPageFinished(WebView view, String url) {
                                                // TODO Auto-methiod stub
                                                super.onPageFinished(view, url);
                                                progressBar.setVisibility(View.GONE);


                                            }


                                        });

        }
        if (value == 7) {
            wv.getSettings().setLoadsImagesAutomatically(true);
            wv.getSettings().setJavaScriptEnabled(true);
            wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
            wv.setWebViewClient(new WebViewClient());
            wv.setVisibility(View.VISIBLE);
            wv.loadUrl("http://www.Instagram.com");

            wv.setWebViewClient(new
                                        WebViewClient() {


                                            @Override
                                            public boolean
                                            shouldOverrideUrlLoading(WebView view,
                                                                     String url) {
                                                view.loadUrl(url);
                                                progressBar.setVisibility(View.VISIBLE);

                                                return true;
                                            }

                                            @Override
                                            public void onPageFinished(WebView view, String url) {
                                                // TODO Auto-methiod stub
                                                super.onPageFinished(view, url);
                                                progressBar.setVisibility(View.GONE);


                                            }


                                        });


        }
        if (value == 8) {
            wv.getSettings().setLoadsImagesAutomatically(true);
            wv.getSettings().setJavaScriptEnabled(true);
            wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
            wv.setWebViewClient(new WebViewClient());
            wv.setVisibility(View.VISIBLE);
            wv.loadUrl("http://www.Linkedin.com");
            wv.setWebViewClient(new
                                        WebViewClient() {


                                            @Override
                                            public boolean
                                            shouldOverrideUrlLoading(WebView view,
                                                                     String url) {
                                                view.loadUrl(url);
                                                progressBar.setVisibility(View.VISIBLE);

                                                return true;
                                            }

                                            @Override
                                            public void onPageFinished(WebView view, String url) {
                                                // TODO Auto-methiod stub
                                                super.onPageFinished(view, url);
                                                progressBar.setVisibility(View.GONE);


                                            }


                                        });
        }

            if (value == 9) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("https://www.pinterest.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 10) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Quora.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 11) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.vk.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 12) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Reddit.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });

            }
            if (value == 13) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Skype.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 14) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Telegram.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 15) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Snapchat.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 16) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.HI5.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 17) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Tumblr.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 18) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Flicker.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 19) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Meetup.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 20) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.MeetMe.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 21) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Buzzfeed.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 22) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Stumbleupon.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 23) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Digg.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 24) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.imgur.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 25) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Medium.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 26) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Youtube.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 27) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Vimeo.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 28) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.DailyMotion.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 29) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Amazon.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 30) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.ebay.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 31) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Google.com/drive");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 32) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.OneDrive.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 33) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Dropbox.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 34) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Netflix.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 35) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Lastfm.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 36) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Soundcloud.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 37) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Box.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 38) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Skout.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 39) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.ICQ.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 40) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Path.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 41) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Vine.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 42) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.BEBO.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 43) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Myspace.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 44) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.QQ.com");

                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 45) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Taringa.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 46) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.BaiduTieba.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 47) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.Hitwe.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }
            if (value == 48) {
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.setWebViewClient(new WebViewClient());
                wv.setVisibility(View.VISIBLE);
                wv.loadUrl("http://www.QZone.com");
                wv.setWebViewClient(new
                                            WebViewClient() {


                                                @Override
                                                public boolean
                                                shouldOverrideUrlLoading(WebView view,
                                                                         String url) {
                                                    view.loadUrl(url);
                                                    progressBar.setVisibility(View.VISIBLE);

                                                    return true;
                                                }

                                                @Override
                                                public void onPageFinished(WebView view, String url) {
                                                    // TODO Auto-methiod stub
                                                    super.onPageFinished(view, url);
                                                    progressBar.setVisibility(View.GONE);


                                                }


                                            });
            }




    }



    private void showInterstitialAd () {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }


/*
    private View.OnClickListener subMenuClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //arcMenu.toggleMenu();
        }
    };

    private View.OnClickListener mNextClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Intent intent = new Intent(MainActivity.this, ImageButtonActivity.class);
            //startActivity(intent);
        }
    };

    private View.OnClickListener mAnimationTimeDemoClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Intent intent = new Intent(MainActivity.this, ImageButtonActivity.class);
            //startActivity(intent);
        }
    };

    private View.OnClickListener mTopPlacementClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Intent intent = new Intent(MainActivity.this, ImageButtonActivity.class);
            //startActivity(intent);
        }
    };



*/




    }


