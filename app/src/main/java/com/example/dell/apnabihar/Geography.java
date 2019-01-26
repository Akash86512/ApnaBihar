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

public class Geography extends Fragment {
    InterstitialAd interstitialAd;
    public Geography() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_geography,container,false); {


            MobileAds.initialize(getActivity(),"ca-app-pub-4614943972616024~2917734546");
            AdView adView;
            adView=view.findViewById(R.id.adview);
            AdRequest adRequest=new AdRequest .Builder().build();
            adView.loadAd(adRequest);
            Button histery=view.findViewById(R.id.geo);
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

            TextView tv2=view.findViewById(R.id.tv2);
            tv2.setText(" राज्य का कुल क्षेत्रफल 94,163 वर्ग किलोमीटर है जिसमें 92,257.51 वर्ग किलोमीटर ग्रामीण क्षेत्र है। झारखंड के अलग हो जाने के बाद बिहार की भूमि मुख्यतः नदियों के मैदान एवं कृषियोग्य समतल भूभाग है। गंगा के पूर्वी मैदान में स्थित इस राज्य की औसत ऊँचाई १७३ फीट है। भौगोलिक तौर पर बिहार को तीन प्राकृतिक विभागो में बाँटा जाता है- उत्तर का पर्वतीय एवं तराई भाग, मध्य का विशाल मैदान तथा दक्षिण का पहाड़ी किनारा।\n" +
                    "            उत्तर का पर्वतीय प्रदेश सोमेश्वर श्रेणी का हिस्सा है। इस श्रेणी की औसत उचाई 455 मीटर है परन्तु इसका सर्वोच्च शिखर 874 मीटर उँचा है। सोमेश्वर श्रेणी के दक्षिण में तराई क्षेत्र है। यह दलदली क्षेत्र है जहाँ साल वॄक्ष के घने जंगल हैं। इन जंगलों में प्रदेश का इकलौता बाघ अभयारण्य वाल्मिकीनगर में स्थित है।\n" +
                    "            मध्यवर्ती विशाल मैदान बिहार के 95% भाग को समेटे हुए हैं। भौगोलिक तौर पर इसे चार भागों में बाँटा जा सकता है:- 1- तराई क्षेत्र यह सोमेश्वर श्रेणी के तराई में लगभग 10 किलोमीटर चौ़ड़ा कंकर-बालू का निक्षेप है। इसके दक्षिण में तराई उपक्षेत्र है जो प्रायः दलदली है।\n" +
                    "            2-भांगर क्षेत्र यह पुराना जलोढ़ क्षेत्र है। समान्यतः यह आस पास के क्षेत्रों से 7-8 मीटर ऊँचा रहता है।\n" +
                    "            3-खादर क्षेत्र इसका विस्तार गंडक से कोसी नदी के क्षेत्र तक सारे उत्तरी बिहार में है। प्रत्येक वर्ष आने वाली बाढ़ के कारण यह क्षेत्र बहुत उपजाऊ है। परन्तु इसी बाढ़ के कारण यह क्षेत्र तबाही के कगार पर खड़ा है।\n" +
                    "\n" +
                    "            गंगा नदी राज्य के लगभग बीचों-बीच बहती है। उत्तरी बिहार बागमती, कोशी, बूढी गंडक, गंडक, घाघरा और उनकी सहायक नदियों का समतल मैदान है। सोन, पुनपुन, फल्गू तथा किऊल नदी बिहार में दक्षिण से गंगा में मिलनेवाली सहायक नदियाँ है। बिहार के दक्षिण भाग में छोटानागपुर का पठार, जिसका अधिकांश हिस्सा अब झारखंड है, तथा उत्तर में हिमालय पर्वत की नेपाल श्रेणी है। हिमालय से उतरने वाली कई नदियाँ तथा जलधाराएँ बिहार होकर प्रवाहित होती है और गंगा में विसर्जित होती हैं। वर्षा के दिनों में इन नदियों में बाढ़ एक बड़ी समस्या है।\n" +
                    "\n" +
                    "            राज्य का औसत तापमान गृष्म ऋतु में 35-45 डिग्री सेल्सियस तथा जाड़े में 5-15 डिग्री सेल्सियस रहता है। जाड़े का मौसम नवंबर से मध्य फरवरी तक रहता है। अप्रैल में गृष्म ऋतु का आरंभ होता है जो जुलाई के मध्य तक रहता है। जुलाई-अगस्त में वर्षा ऋतु का आगमन होता है जिसका अवसान अक्टूबर में होने के साथ ही ऋतु चक्र पूरा हो जाता है। औसतन 1205 मिलीमीटर वर्षा का का वार्षिक वितरण लगभग 52 दिनों तक रहता है जिसका अधिकांश भाग मानसून से होनेवाला वर्षण है।\n" +
                    "\n" +
                    "            उत्तर में भूमि प्रायः सर्वत्र उपजाऊ एवं कृषियोग्य है। धान, गेंहूँ, दलहन, मक्का, तिलहन, तम्बाकू,सब्जी तथा केला, आम और लीची जैसे कुछ फलों की खेती की जाती है। हाजीपुर का केला एवं मुजफ्फरपुर की लीची बहुत प्रसिद्ध है।\n" +
                    "            ");



           // Inflate the layout for this fragment
            return view;

        }

    }
}