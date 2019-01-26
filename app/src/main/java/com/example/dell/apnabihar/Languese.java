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

public class Languese extends Fragment {
    InterstitialAd interstitialAd;
    public Languese() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_languese,container,false); {


            MobileAds.initialize(getActivity(),"ca-app-pub-4614943972616024~2917734546");
            AdView adView;
            adView=view.findViewById(R.id.adview);
            AdRequest adRequest=new AdRequest .Builder().build();
            adView.loadAd(adRequest);
            Button histery=view.findViewById(R.id.lang);
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
            tv1.setText(
                    "हिंदी, अंगिका, भोजपुरी, मगही, उर्दू और मैथिली यहाँ की प्रमुख भाषायें हैं।\n" +
                    "\n" +
                    "बिहार की संस्कृति मगध, अंग, मिथिला तथा वज्जी संस्कृतियों का मिश्रण है। नगरों तथा गाँवों की संस्कृति में अधिक फर्क नहीं है। नगरों में भी लोग पारंपरिक रीति रिवाजों का पालन करते है तथा उनकी मान्यताएँ रुढिवादी है। समाज पुरूष प्रधान है। प्रमुख पर्वों में छठ, होली, दीपावली, दशहरा, महाशिवरात्रि, नागपंचमी, श्री पंचमी, मुहर्रम, ईद तथा क्रिसमस हैं। सिक्खों के दसवें गुरु गोबिन्द सिंह जी का जन्म स्थान होने के कारण पटना में उनकी जयन्ती पर भी भारी श्रद्धार्पण देखने को मिलता है।\n" +
                    "\n" +
                    "जातिवाद\n" +
                    "\nजातिवाद बिहार की राजनीति तथा आमजीवन का अभिन्न अंग रहा है। पिछले कुछ वर्षों में इसका विराट रूप सामने आया था। वर्तमान में काफी हद तक यह भेदभाव कम हो गया है। इस जातिवाद के दौर की एक ख़ास देन है - अपना उपनाम बदलना। जातिवाद के दौर में कई लोगों ने जाति स्पष्ट न हो इसके लिए अपने तथा बच्चों के उपनाम बदल कर एक संस्कृत नाम रखना आरंभ कर दिया। इसके फलस्वरूप कई लोगों का वास्तविक उपनाम यादव, शर्मा, मिश्र, वर्मा, झा, सिन्हा, श्रीवास्तव, राय इत्यादि से बदलकर प्रकाश, सुमन, प्रभाकर, रंजन, भारती इत्यादि हो गया। जातिसूचक उपनाम के बदले कई लोग 'कुमार' लिखना पसंद करते हैं।\n" +
                    "\n" +
                    "मनोरंजन\n" +
                    "\nबिहार के शहर, कस्बों तथा गाँवों में फिल्मों की लोकप्रियता बहुत अधिक है। हिंदी फिल्मों के संगीत बहुत पसन्द किये जाते हैं। मुख्य धारा की हिन्दी फिल्मों के अलावा मैथिली, भोजपुरी फिल्मों ने भी अपना प्रभुत्व जमाया है। मैथिली तथा अन्य स्थानीय सिनेमा भी लोकप्रिय हैं। अंग्रेजी फिल्म पटना जैसे नगरों में ही देखा जाता है। उच्चस्तरीय पसंद वाले लोग नृत्य, नाटकीय मंचन या चित्रकला में अपना योगदान देना पसंद करते हैं।\n" +
                    "\n" +
                    "शादी-विवाह\n" +
                    "\nशादी विवाह के दौरान ही प्रदेश की सांस्कृतिक प्रचुरता स्पष्ट होती है। जातिगत आग्रह के कारण शत-प्रतिशत शादियाँ माता-पिता या रिश्तेदारों द्वारा तय परिवार में ही होता है। शादी में बारात तथा जश्न की सीमा समुदाय तथा उनकी आर्थिक स्थिति पर निर्भर करती है। लोकगीतों के गायन का प्रचलन लगभग सभी समुदाय में हैं। आधुनिक तथा पुराने फिल्म संगीत भी इन समारोहों में सुनाई देते हैं। शादी के दौरान शहनाई का बजना आम बात है। इस वाद्ययंत्र को लोकप्रिय बनाने में बिस्मिल्ला खान का नाम सर्वोपरि है, उनका जन्म बिहार में ही हुआ था।\n" +
                    "\n" +
                    "खानपान\n" +
                    "\nबिहार अपने खानपान की विविधता के लिए प्रसिद्ध है। शाकाहारी तथा मांसाहारी दोनो व्यंजन पसंद किये जाते हैं। मिठाईयों की विभिन्न किस्मों के अतिरिक्त अनरसा की गोली, खाजा, मोतीचूर का लड्डू, तिलकुट यहाँ की खास पसंद है। सत्तू, चूड़ा-दही और लिट्टी-चोखा जैसे स्थानीय व्यंजन तो यहाँ के लोगों की कमजोरी हैं। लहसुन की चटनी भी बहुत पसंद करते हैं। लालू प्रसाद के रेल मंत्री बनने के बाद तो लिट्टी-चोखा भारतीय रेल के महत्वपूर्ण स्टेशनों पर भी मिलने लगा है। सुबह के नास्ते में चूड़ा-दही या पूरी-जलेबी खूब खाये जाते हैं। चावल-दाल-सब्जी और रोटी बिहार का सामान्य भोजन है।\n" +
                    "\n" +
                    "खेलकूद\n" +
                    "\nभारत के अन्य कई जगहों की तरह क्रिकेट यहाँ भी सर्वाधिक लोकप्रिय है। इसके अलावा फुटबॉल, हाकी, टेनिस और गोल्फ भी पसन्द किया जाता है। बिहार का अधिकांश हिस्सा ग्रामीण होने के कारण पारंपरिक भारतीय खेल जैसे कबड्डी कुश्तीबहुत लोकप्रिय हैं।");


            // Inflate the layout for this fragment
            return view;

        }

    }
}