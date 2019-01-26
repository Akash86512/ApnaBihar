package com.example.dell.apnabihar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class Bihar extends Fragment {
    InterstitialAd interstitialAd;
    public Bihar() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_bihar,container,false); {

            MobileAds.initialize(getActivity(),"ca-app-pub-4614943972616024~2917734546");
            AdView adView;
            adView=view.findViewById(R.id.adview);
            AdRequest adRequest=new AdRequest .Builder().build();
            adView.loadAd(adRequest);

            Button histery=view.findViewById(R.id.bihar);
            interstitialAd=new InterstitialAd(getActivity());
            interstitialAd.setAdUnitId("ca-app-pub-4614943972616024/7323883410");
            interstitialAd.loadAd(new AdRequest.Builder().build());

            interstitialAd.setAdListener(new AdListener()
            {
                @Override
                public void onAdClosed() {
                    Toast.makeText(getActivity()," ad  display",Toast.LENGTH_LONG).show();
                    interstitialAd.loadAd(new AdRequest.Builder().build());
                }
            });

            histery.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(interstitialAd.isLoaded())
                    {
                        interstitialAd.show();
                    }
                    else
                    {
                        Toast.makeText(getActivity()," ad not display",Toast.LENGTH_LONG).show();
                    }
                }
            });

        TextView tv=view.findViewById(R.id.tv);
        tv.setText("बिहार भारत का एक राज्य है। बिहार की राजधानी पटना है। बिहार के उत्तर में नेपाल, पूर्व में पश्चिम बंगाल, पश्चिम में उत्तर प्रदेश और दक्षिण में झारखण्ड स्थित है। बिहार नाम का प्रादुर्भाव बौद्ध सन्यासियों के ठहरने के स्थान विहार शब्द से हुआ , जिसे विहार के स्थान पर इसके अपभ्रंश रूप बिहार से संबोधित किया जाता है। यह क्षेत्र गंगा नदी तथा उसकी सहायक नदियों के उपजाऊ मैदानों में बसा है। प्राचीन काल के विशाल साम्राज्यों का गढ़ रहा यह प्रदेश, वर्तमान में देश की अर्थव्यवस्था के सबसे पिछड़े योगदाताओं में से एक बनकर रह गया है।");


            // Inflate the layout for this fragment
            return view;

        }

    }
}