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

public class Histery extends Fragment {
    InterstitialAd interstitialAd;
    public Histery() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_histery,container,false); {

            TextView tv1=view.findViewById(R.id.tv1);
            TextView tv2=view.findViewById(R.id.tv2);

            Button histery=view.findViewById(R.id.histery);
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



            MobileAds.initialize(getActivity(),"ca-app-pub-4614943972616024~2917734546");
            AdView adView;
            adView=view.findViewById(R.id.adview);
            AdRequest adRequest=new AdRequest .Builder().build();



            adView.loadAd(adRequest);


            tv1.setText("प्राचीन काल");

            tv2.setText("सारण जिले में गंगा नदी के उत्तरी किनारे पर चिरांद, नवपाषाण युग (लगभग 2500-1345 ईसा पूर्व) से एक पुरातात्विक रिकॉर्ड है। बिहार के क्षेत्र जैसे-मगध, मिथिला और अंगा- धार्मिक ग्रंथों और प्राचीन भारत के महाकाव्यों में वर्णित हैं।\n" +
                    "\n" +
                    "मिथिला को पहली बार इंडो-आर्यन लोगों ने विदेहा साम्राज्य की स्थापना के बाद प्रतिष्ठा प्राप्त की। देर वैदिक काल (सी। 1100-500 ईसा पूर्व) के दौरान, वीढ़ा दक्षिण एशिया के प्रमुख राजनीतिक और सांस्कृतिक केंद्रों में से एक बन गया, कुरु और पंकला के साथ। वेदहा साम्राज्य के किंग्स जहां जनक कहलाते थे। मिथिला के जानक में से एक की सीती सीता, वाल्मीकि द्वारा लिखी जाने वाली हिंदू महाकाव्य, रामायण में भगवान राम की पत्नी के रूप में वर्णित है। बाद में Videha किंगडम Vajishi शहर में अपनी राजधानी था जो वाजजी समझौता में शामिल हो गया, मिथिला में भी है। वाजजी के पास एक रिपब्लिकन शासन था जहां राजा राजाओं की संख्या से चुने गए थे। जैन धर्म और बौद्ध धर्म से संबंधित ग्रंथों में मिली जानकारी के आधार पर, वाजजी को 6 वीं शताब्दी ईसा पूर्व से गणराज्य के रूप में स्थापित किया गया था, गौतम बुद्ध के जन्म से पहले 563 ईसा पूर्व में, यह दुनिया का पहला गणतंत्र था।\n" +
                    "\n" +
                    "आधुनिक-पश्चिमी पश्चिमी बिहार के क्षेत्र में मगध 1000 वर्षों के लिए भारत में शक्ति, शिक्षा और संस्कृति का केंद्र बने। 684 ईसा पूर्व में स्थापित हरयंक वंश, राजगढ़ (आधुनिक राजगीर) के शहर से मगध पर शासन किया। इस वंश के दो प्रसिद्ध राजाएं बिंबिसार और उनके बेटे अजातशत्रु थे, जिन्होंने अपने पिता को सिंहासन पर चढ़ने के लिए कैद कर दिया था। अजातशत्रु ने पाटलिपुत्र शहर की स्थापना की जो बाद में मगध की राजधानी बन गई। उन्होंने युद्ध की घोषणा की और बाजी को जीत लिया। हिरुआँ वंश के बाद शिशुनाग वंश का पीछा किया गया था। बाद में नंद वंश ने बंगाल से पंजाब तक फैले विशाल साम्राज्य पर शासन किया।\n" +
                    "\n" +
                    "भारत की पहली साम्राज्य, मौर्य साम्राज्य द्वारा नंद वंश को बदल दिया गया था। मौर्य साम्राज्य और बौद्ध धर्म का इस क्षेत्र में उभार रहा है जो अब आधुनिक बिहार को बना देता है। 325 ईसा पूर्व में मगध से उत्पन्न मौर्य साम्राज्य, चंद्रगुप्त मौर्य ने स्थापित किया था, जो मगध में पैदा हुआ था। इसकी पाटलिपुत्र (आधुनिक पटना) में इसकी राजधानी थी। मौर्य सम्राट, अशोक, जो पाटलीपुत्र (पटना) में पैदा हुए थे, को दुनिया के इतिहास में सबसे बड़ा शासक माना जाता है।\n" +
                    "\n" +
                    "240 ए। में मगध में उत्पन्न गुप्त साम्राज्य को विज्ञान, गणित, खगोल विज्ञान, वाणिज्य, धर्म और भारतीय दर्शन में भारत का स्वर्ण युग कहा जाता है। 11 वीं शताब्दी में चोल वंश के राजेंद्र चोल प्रथम द्वारा बिहार और बंगाल पर आक्रमण किया गया था।");



            TextView tv3=view.findViewById(R.id.tv3);
            TextView tv4=view.findViewById(R.id.tv4);
            tv3.setText("मध्यकाल");

            tv4.setText("मगध में बौद्ध धर्म मुहम्मद बिन बख्तियार खिलजी के आक्रमण की वजह से गिरावट में पड़ गया, जिसके दौरान कई विहार और नालंदा और विक्रमशिला के प्रसिद्ध विश्वविद्यालयों को नष्ट कर दिया गया। यह दावा किया गया कि 12 वीं शताब्दी के दौरान हजारों बौद्ध भिक्षुओं की हत्या हुई थी। डी.एन. झा सुझाव देते हैं, इसके बजाय, ये घटनाएं सर्वोच्चता के लिए लड़ाई में बौद्ध ब्राह्मण की झड़पों का परिणाम थीं। 1540 में, महान पस्तीस के मुखिया, सासाराम के शेर शाह सूरी, सम्राट हुमायूं की मुगल सेना को हराकर मुगलों से उत्तरी भारत ले गए थे। शेर शाह ने अपनी राजधानी दिल्ली की घोषणा की\n" +
                    "11 वीं शताब्दी से लेकर 20 वीं शताब्दी तक, मिथिला पर विभिन्न स्वदेशीय राजवंशों ने शासन किया था। इनमें से पहला, जहां कर्नाट, अनवर राजवंश, रघुवंशी और अंततः राज दरभंगा के बाद। इस अवधि के दौरान मिथिला की राजधानी दरभंगा में स्थानांतरित की गई थी।");
            // Inflate the layout for this fragment


            TextView tv5=view.findViewById(R.id.tv5);
            TextView tv6=view.findViewById(R.id.tv6);
            tv5.setText("आधुनिक काल");
            tv6.setText("1857 के प्रथम सिपाही विद्रोह में बिहार के बाबू कुंवर सिंह ने महत्वपूर्ण भूमिका निभाई। 1905 में बंगाल का विभाजन के फलस्वरूप बिहार नाम का राज्य अस्तित्व में आया। 1936 में उड़ीसा इससे अलग कर दिया गया। स्वतंत्रता संग्राम के दौरान बिहार के चंपारण के विद्रोह को, अंग्रेजों के खिलाफ बग़ावत फैलाने में अग्रगण्य घटनाओं में से एक गिना जाता है। स्वतंत्रता के बाद बिहार का एक और विभाजन हुआ और 15 नवंबर 2000 को झारखंड राज्य इससे अलग कर दिया गया। भारत छोड़ो आंदोलन में भी बिहार की गहन भूमिका रही।");

            return view;

        }

    }
}