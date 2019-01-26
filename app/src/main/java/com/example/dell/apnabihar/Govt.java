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

public class Govt extends Fragment {
    InterstitialAd interstitialAd;
    public Govt() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_govt,container,false); {

            MobileAds.initialize(getActivity(),"ca-app-pub-4614943972616024~2917734546");
            AdView adView;
            adView=view.findViewById(R.id.adview);
            AdRequest adRequest=new AdRequest .Builder().build();
            adView.loadAd(adRequest);
            Button histery=view.findViewById(R.id.govt);
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
            TextView tv2=view.findViewById(R.id.tv2);
            TextView tv3=view.findViewById(R.id.tv3);
            TextView tv4=view.findViewById(R.id.tv4);

            tv1.setText("बिहार सरकार");
            tv2.setText("बिहार राज्य भारतीय गणराज्य के संघीय ढाँचे में द्विसदनीय व्यवस्था के अन्तर्गत आता है। राज्य का संवैधानिक मुखिया राज्यपाल है लेकिन वास्तविक सत्ता मुख्यमंत्री और मंत्रीपरिषद के हाथ में होता है। विधानसभा में चुनकर आनेवाले विधायकों द्वारा मुख्यमंत्री का चुनाव पाँच वर्षों के लिए किया जाता है जबकि राज्यपाल की नियुक्ति भारत के राष्ट्रपति के द्वारा की जाती है। प्रत्यक्ष चुनाव में बहुमत प्राप्त करनेवाले राजनीतिक दल अथवा गठबंधन के आधार पर सरकार बनाए जाते हैं। उच्च सदन या विधान परिषद के सदस्यों का चुनाव अप्रत्यक्ष ढंग से ६ वर्षों के लिए होता है।");

            tv3.setText("प्रशासनिक व्यवस्था");
            tv4.setText("प्रशासनिक सुविधा के लिए बिहार राज्य को 9 प्रमंडल तथा 38 मंडल (जिला) में बाँटा गया है। जिलों को क्रमश: 101 अनुमंडलों, 534 प्रखंडों, 8,471 पंचायतों, 45,103 गाँवों में बाँटा गया है। राज्य का मुख्य सचिव नौकरशाही का प्रमुख होता है जिसे श्रेणीक्रम में आयुक्त, जिलाधिकारी, अनुमंडलाधिकारी, प्रखंड विकास पदाधिकारी या अंचलाधिकारी तथा इनके साथ जुड़े अन्य अधिकारी एवं कर्मचारीगण रिपोर्ट करते हैं। पंचायत तथा गाँवों का कामकाज़ सीधेतौर पर चुनाव कराकर मुखिया, सरपंच तथा वार्ड सदस्यों के अधीन संचालित किया जाता है। नगरपालिका आम निर्वाचन 2017 के बाद बिहार में नगर निगमों की संख्या 12, नगर परिषदों की संख्या 49 और नगर पंचायतों की संख्या 80 है।[2][3][4][5][6]\n" +
                    "\n" +
                    "पटना, तिरहुत, सारण, दरभंगा, कोशी, पूर्णिया, भागलपुर, मुंगेर तथा मगध प्रमंडल के अन्तर्गत आनेवाले जिले इस प्रकार हैं:\n" +
                    "\n" +
                    "मुख्य लेख : बिहार के जिले\n" +
                    "अररिया *अरवल *औरंगाबाद *कटिहार *किशनगंज *खगड़िया *गया *गोपालगंज *छपरा *जमुई *जहानाबाद *दरभंगा *नवादा *नालंदा *पटना *पश्चिम चंपारण *पूर्णिया *पूर्वी चंपारण *बक्सर *बाँका *बेगूसराय *भभुआ *भोजपुर *भागलपुर *मधेपुरा *मुंगेर *मुजफ्फरपुर *मधुबनी *सासाराम *लखीसराय *वैशाली *सहरसा *समस्तीपुर *सीतामढी *सीवान *सुपौल *शिवहर *शेखपुरा");

            // Inflate the layout for this fragment
            return view;

        }

    }
}