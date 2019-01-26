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

public class Intertries extends Fragment {
    InterstitialAd interstitialAd;
    public Intertries() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_intertries,container,false); {


            MobileAds.initialize(getActivity(),"ca-app-pub-4614943972616024~2917734546");
            AdView adView;
            adView=view.findViewById(R.id.adview);
            AdRequest adRequest=new AdRequest .Builder().build();
            adView.loadAd(adRequest);


            Button histery=view.findViewById(R.id.inter);
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

        TextView tv1=view.findViewById(R.id.tv1);
        tv1.setText("राज्\u200Dय के मुख्\u200Dय उद्योग हैं -\n" +
                "\n" +
                "मुंगेर में सिगरेट कारखाना आई टी सी\n" +
                "मुंगेर में आई टी सी के अनय उतपाद अगरबती माचिस एम तथा चावल आटा आदि का निर्माण\n" +
                "मुंगेर में बंदुक फैकटरी\n" +
                "मुेंगेर के जमालपुर में रेल कारखाना\n" +
                "एशिया परसिध रेल करेन कारखाना जमालपुर\n" +
                "भागलपुर में शिलक उधाेग\n" +
                "मुजफ्फरपुर और मोकामा में 'भारत वैगन लिमिटेड' का रेलवे वैगन संयंत्र,\n" +
                "बरौनी में भारतीय तेल निगम का तेलशोधक कारख़ाना है।\n" +
                "बरौनी का एच.पी.सी.एल. और अमझोर का पाइराइट्स फॉस्\u200Dफेट एंड कैमिकल्\u200Dस लिमिटेड (पी.पी.सी.एल.) राज्\u200Dय के उर्वरक संयंत्र हैं।\n" +
                "सीवान, भागलपुर, पंडौल, मोकामा और गया में पांच बड़ी सूत कताई मिलें हैं।\n" +
                "उत्तर व दक्षिण बिहार में 13 चीनी मिलें हैं, जो निजी क्षेत्र की हैं तथा 15 चीनी मिलें सार्वजनिक क्षेत्र की हैं जिनकी कुल पेराई क्षमता 45,00 टी.\n" +
                "पश्चिमी चंपारन, मुजफ्फरपुर और बरौनी में चमड़ा प्रसंस्\u200Dकरण के उद्योग है।\n" +
                "कटिहार और समस्\u200Dतीपुर में तीन बड़े पटसन के कारखाने हैं।\n" +
                "हाजीपुर में दवाएं बनाने का कारख़ाना औरंगाबाद और पटना में खाद्य प्रसंस्\u200Dकरण और वनस्\u200Dपति बनाने के कारखाने हैं।\n" +
                "इसके अलावा बंजारी में कल्\u200Dयाणपुर सीमेंट लिमिटेड नामक सीमेंट कारखाने का बिहार के औद्योगिक नक्\u200Dशे में महत्\u200Dवपूर्ण स्\u200Dथान है।");

            // Inflate the layout for this fragment
            return view;

        }

    }
}