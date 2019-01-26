package com.example.dell.apnabihar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Alumuni extends Fragment {

    public Alumuni() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_alumuni,container,false); {

            MobileAds.initialize(getActivity(),"ca-app-pub-4614943972616024~2917734546");
            AdView adView;
            adView=view.findViewById(R.id.adview);
            AdRequest adRequest=new AdRequest .Builder().build();
            adView.loadAd(adRequest);

            TextView tv1=view.findViewById(R.id.tv1);
            tv1.setText("डॉक्टर राजेंद्र प्रसाद (आज़ाद भारत के प्रथम राष्ट्रपति)(1950-1962)\n" +
                    "\n" +
                    "सम्राट चंद्रगुप्त मौर्य (मौर्य वंश के जनक)\n" +
                    "\n" +
                    "सम्राट अशोक महावीर जगजीवन राम (स्वतंत्रता सेनानी) डॉ अनुग्रह नारायण (स्वतन्त्रता सेनानी) रामसेवक सिंह (स्वतंत्रता सेनानी) चाणक्य(प्राचीन अर्थशास्त्री) आर्यभट्ट (महान गणितज्ञ) लोकनायक जयप्रकाश नारायण(स्वतंत्रता सेनानी) कर्पूरी ठाकुर(स्वतंत्रता सेनानी) श्री कृष्ण सिंह (बिहार के प्रथम मुख्यमंत्री) चौधरी चरण सिंह (प्रधानंत्री) जो लोकसभा का सामना नहीं किये थे");


            // Inflate the layout for this fragment
            return view;

        }

    }
}