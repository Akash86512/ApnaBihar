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

public class Torism extends Fragment {

    InterstitialAd interstitialAd;

    public Torism() {
        // Required empty public constructor
    }





    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_torism,container,false); {

            MobileAds.initialize(getActivity(),"ca-app-pub-4614943972616024~2917734546");
            AdView adView;
            adView=view.findViewById(R.id.adview);
            AdRequest adRequest=new AdRequest .Builder().build();
            adView.loadAd(adRequest);

            Button histery=view.findViewById(R.id.torism);
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
            tv1.setText("पटना राज्य की वर्तमान राजधानी तथा महान ऐतिहासिक स्थल है। अतीत में यह सत्ता, धर्म तथा ज्ञान का केंद्र रहा है। निम्न स्थल पटना के महत्वपूर्ण दार्शनिक स्थल हैं:\n" +
                    "\n" +
                    "प्राचीन एवं मध्यकालीन इमारतें: कुम्रहार परिसर, अगमकुआँ, महेन्द्रूघाट, शेरशाह के द्वारा बनवाए गए किले का अवशेष\n" +
                    "ब्रिटिश कालीन भवन: जालान म्यूजियम, गोलघर, पटना संग्रहालय, विधान सभा भवन, हाईकोर्ट भवन, सदाकत आश्रम\n" +
                    "धार्मिक स्थल: हरमंदिर, बड़ी पटनदेवी, छोटी पटनदेवी, महावीर मंदिर, शीतला माता मंदिर, इस्कॉन मंदिर, नवलख्खा मंदिर, सुर्य मंदिर, पादरी की हवेली, शेरशाह की मस्जिद, बेगू ह्ज्जाम की मस्जिद, पत्थर की मस्जिद, जामा मस्जिद, फुलवारीशरीफ में बड़ी खानकाह, मनेरशरीफ - सूफी संत हज़रत याहया खाँ मनेरी की दरगाह\n" +
                    "ज्ञान-विज्ञान के केंद्र: पटना विश्वविद्यालय, सच्चिदानंद सिन्हा लाइब्रेरी, संजय गाँधी जैविक उद्यान, श्रीकृष्ण सिन्हा विज्ञान केंद्र, इन्दिरा गाँधी ताराघर, खुदाबक़्श लाइब्रेरी एवं विज्ञान परिसर\n" +
                    "सारण तथा आसपास\n" +
                    "मुख्य लेख : सारण\n" +
                    "प्रतिवर्ष कार्तिक पूर्णिमा से लगनेवाला सोनपुर मेला[7], सारण जिला का नवपाषाण कालीन चिरांद गाँव[8], कोनहारा घाट, नेपाली मंदिर, रामचौरा मंदिर, १५वीं सदी में बनी मस्जिद, दीघा-सोनपुर रेल-सह-सड़क पुल, महात्मा गाँधी सेतु, गुप्त एवं पालकालीन धरोहरों वाला चेचर गाँव\n" +
                    "\n" +
                    "वैशाली तथा आसपास\n" +
                    "छठी सदी इसापूर्व में वज्जिसंघ द्वारा स्थापित विश्व का प्रथम गणराज्य के अवशेष, अशोक स्तंभ, बसोकुंड में भगवान महावीर की जन्म स्थली, अभिषेक पुष्करणी, विश्व शांतिस्तूप, राजा विशाल का गढ, चौमुखी महादेव मंदिर, भगवान महावीर के जन्मदिन पर वैशाख महीने में आयोजित होनेवाला वैशाली महोत्सव\n" +
                    "राजगीर तथा आसपास\n" +
                    "राजगृह मगध साम्राज्य की पहली राजधानी तथा हिंदू, जैन एवं बौध धर्म का एक प्रमुख दार्शनिक स्थल है। भगवान बुद्ध तथा वर्धमान महावीर से जुडा कई स्थान अति पवित्र हैं। वेणुवन, सप्तपर्णी गुफा, गृद्धकूट पर्वत, जरासंध का अखाड़ा, गर्म पानी के कुंड, मख़दूम कुंड आदि राजगीर के महत्वपूर्ण दर्शनीय स्थल हैं।\n" +
                    "नालंदा तथा आसपासः नालंदा विश्वविद्यालय के भग्नावशेष, पावापुरी में भगवान महावीर का परिनिर्वाण स्थल एवं जलमंदिर, बिहारशरीफ में मध्यकालीन किले का अवशेष एवं १४वीं सदी के सूफी संत की दरगाह (बड़ी दरगाह एवं छोटी दरगाह), नवादा के पास ककोलत जलप्रपात\n" +
                    "गया एवं बोधगया\n" +
                    "हिंदू धर्म के अलावे बौद्ध धर्म मानने वालों का यह सबसे प्रमुख दार्शनिक स्थल है। पितृपक्ष के अवसर पर यहाँ दुनिया भर से हिंदू आकर फल्गू नदी किनारे पितरों को तर्पण करते हैं। विष्णुपद मंदिर, बोधगया में भगवान बुद्ध से जुड़ा पीपल का वृक्ष तथा महाबोधि मंदिर के अलावे तिब्बती मंदिर, थाई मंदिर, जापानी मंदिर, बर्मा का मंदिर, बौधनी पहाड़ी { इमामगंज }\n" +
                    "भागलपुर तथा आसपास\n" +
                    "प्राचीन शिक्षा स्थल के अलावे यह बिहार में तसर शिल्क उद्योग केंद्र है। पाल शासकों द्वारा बनवाये गये प्राचीन विक्रमशिला विश्वविद्यालय का अवशेष, वैद्यनाथधाम मंदिर, सुलतानगंज, मुंगेर में बनवाया मीरकासिम का किला,DOGACHCHHI,TARAR me gerua river ke kinare raja duara banaya gaya garh .....\n" +
                    "चंपारण\n" +
                    "सम्राट अशोक द्वारा लौरिया में स्थापित स्तंभ, लौरिया का नंदन गढ़, नरकटियागंज का चानकीगढ़, वाल्मीकिनगर जंगल, बापू द्वारा स्थापित भीतीहरवा आश्रम, तारकेश्वर नाथ तिवारी का बनवाया रामगढ़वा हाई स्कूल, स्वतंत्रता आन्दोलन के समय महात्मा गाँधी एवं अन्य सेनानियों की कर्मभूमि तथा अरेराज में भगवान शिव का मन्दिर\n" +
                    "सीतामढी तथा आसपास\n" +
                    "पुनौरा में देवी सीता की जन्मस्थली, जानकी मंदिर एवं जानकी कुंड, हलेश्वर स्थान, पंथपाकड़, यहाँ से सटे नेपाल के जनकपुर जाकर भगवान राम का स्वयंवर स्थल भी देखा जा सकता है।\n" +
                    "सासाराम\n" +
                    "अफगान शैली में बनाया गया अष्टकोणीय शेरशाह का मक़बरा वास्तुकला का अद्भुत नमूना है।");



            // Inflate the layout for this fragment
            return view;

        }

    }
}