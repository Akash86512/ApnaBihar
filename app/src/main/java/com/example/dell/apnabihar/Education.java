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

public class Education extends Fragment {
    InterstitialAd interstitialAd;
    public Education() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_education,container,false); {

        TextView tv1=view.findViewById(R.id.tv1);

            MobileAds.initialize(getActivity(),"ca-app-pub-4614943972616024~2917734546");
            AdView adView;
            adView=view.findViewById(R.id.adview);
            AdRequest adRequest=new AdRequest .Builder().build();
            adView.loadAd(adRequest);

            Button histery=view.findViewById(R.id.education);
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



                tv1.setText("एक समय बिहार शिक्षा के सर्वप्रमुख केन्द्रों में गिना जाता था। नालंदा विश्वविद्यालय, विक्रमशिला विश्वविद्यालय तथा ओदंतपुरी विश्वविद्यालय प्राचीन बिहार के गौरवशाली अध्ययन केंद्र थे। १९१७ में खुलने वाला पटना विश्वविद्यालय काफी हदतक अपनी प्रतिष्ठा कायम रखने में सफल रहा किंतु स्वतंत्रता के पश्चात शैक्षणिक संस्थानों में राजनीति तथा अकर्मण्यता करने से शिक्षा के स्तर में गिरावट आई। हाल के दिनों में उच्च शिक्षा की स्थिति सुधरने लगी है। प्राथमिक और माध्यमिक शिक्षा की स्थिति भी अच्छी हो रही है। हाल में पटना में एक भारतीय प्राद्यौगिकी संस्थान और राष्ट्रीय प्राद्यौगिकी संस्थान तथा हाजीपुर में केंद्रीय प्लास्टिक इंजिनियरिंग रिसर्च इंस्टीच्युट तथा केंद्रीय औषधीय शिक्षा एवं शोध संस्थान खोला गया है, जो अच्छा संकेत है।");


            TextView tv3=view.findViewById(R.id.tv3);
            TextView tv4=view.findViewById(R.id.tv4);
            tv3.setText("बिहार के विश्वविद्यालय");

            tv4.setText("महात्मा गाँधी केन्द्रीय विश्वविद्यालय, मोतिहारी, पूर्वी चम्पारण\n" +
                    "दक्षिण बिहार केन्द्रीय विश्वविद्यालय, बोधगया\n" +
                    "बिहार कृषि विशवविधालय सबौर, भागलपुर\n" +
                    "पटना विश्वविद्यालय, पटना\n" +
                    "मगध विश्वविद्यालय, बोधगया\n" +
                    "बाबा साहेब भीमराव अंबेडकर बिहार विश्वविद्यालय, मुजफ्फरपुर\n" +
                    "तिलका माँझी भागलपुर विश्वविद्यालय, भागलपुर\n" +
                    "ललित नारायण मिथिला विश्वविद्यालय, दरभंगा\n" +
                    "कामेश्वर सिंह दरभंगा संस्कृत विश्वविद्यालय, दरभंगा\n" +
                    "जयप्रकाश नारायण विश्वविद्यालय, छपरा\n" +
                    "भूपेन्द्र नारायण मंडल विश्वविद्यालय, मधेपुरा\n" +
                    "वीर कुँवर सिंह विश्वविद्यालय, आरा\n" +
                    "नालंदा मुक्त विश्वविद्यालय, पटना\n" +
                    "मौलाना मजहरुल हक़ अरबी-फ़ारसी विश्वविद्यालय,पटना\n" +
                    "राजेन्द्र कृषि विश्वविद्यालय, पूसा, समस्तीपुर\n" +
                    "आर्यभट्ट ज्ञान विश्वविद्यालय, पटना");

            TextView tv5=view.findViewById(R.id.tv5);
            TextView tv6=view.findViewById(R.id.tv6);
            TextView tv7=view.findViewById(R.id.tv7);
            TextView tv8=view.findViewById(R.id.tv8);

            tv5.setText("चिकित्सा संस्थान");
            tv6.setText("पटना मेडिकल कॉलेज और अस्पताल, पटना\n" +
                    "इंदिरागाँधी आयुर्विज्ञान संस्थान, पटना\n" +
                    "नालंदा मेडिकल कॉलेज और अस्पताल, पटना\n" +
                    "बुद्धा दंत चिकित्सा संस्थान एवं अस्पताल, पटना\n" +
                    "श्रीकृष्ण मेडिकल कॉलेज और अस्पताल, मुजफ्फरपुर\n" +
                    "राय बहादुर टुनकी साह होमियोपैथिक कॉलेज और अस्पताल, मुजफ्फरपुर\n" +
                    "अनुग्रह नारायण मगध मेडिकल कॉलेज और अस्पताल, गया\n" +
                    "दरभंगा मेडिकल कॉलेज और अस्पताल, लहेरियासराय\n" +
                    "कटिहार मेडिकल कॉलेज और अस्पताल, कटिहार\n" +
                    "जवाहरलाल नेहरू मेडिकल काॅलेज और अस्पताल, भागलपुर");

            tv7.setText("अन्य प्रमुख शैक्षणिक संस्थान");
            tv8.setText("शेरिकलचर इंसटीचयूट भागलपुर\n" +
                    "\n" +
                    "चाणक्य विधि विश्वविद्यालय, पटना\n" +
                    "अनुग्रह नारायण सामाजिक परिवर्तन संस्थान, पटना\n" +
                    "ललितनारायण मिश्रा सामाजिक परिवर्तन संस्थान, पटना\n" +
                    "केंद्रीय प्लास्टिक इंजिनियरिंग रिसर्च इंस्टीच्युट (सिपेट), हाजीपुर\n" +
                    "केंद्रीय औषधीय शिक्षा एवं शोध संस्थान (नाइपर), हाजीपुर\n" +
                    "होटल प्रबंधन, खानपान एवं पोषाहार संस्थान, हाजीपुर\n" +
                    "प्राकृत जैनशास्त्र एवं अहिंसा संस्थान, वैशाली");

            // Inflate the layout for this fragment
            return view;

        }

    }
}