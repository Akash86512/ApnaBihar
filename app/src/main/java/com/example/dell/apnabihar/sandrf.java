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

public class sandrf extends Fragment {

    public sandrf() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_sandrf,container,false); {

            MobileAds.initialize(getActivity(),"ca-app-pub-4614943972616024~2917734546");
            AdView adView;
            adView=view.findViewById(R.id.adview);
            AdRequest adRequest=new AdRequest .Builder().build();
            adView.loadAd(adRequest);


        TextView tv1=view.findViewById(R.id.tv1);
        tv1.setText("लोगों का यह मानना है कि बिहार के लोग या बिहार के स्थायी निवासी बहुत ही मेधावी और मेहनती होते हैं। वह अपने दम पर कोई भी काम करते हैं तथा स्वाभिमानी होते हैं। प्राचीन काल से विश्व का गौरव कहे जाने वाले बिहार में वर्तमान साक्षरता दर बहुत कम है लेकिन परिस्थितियाँ बदल रही है और साक्षरता बढ़ रही है। यहाँ की मिट्टी बहुत उपजाऊ है तथा कृषि यहाँ के लोगों की मुख्य जीविका है।\n" +
                "\n" +
                "सन् 1936 और 2000 में ओडिशा और झारखण्ड के अलग हो जाने से बिहार ने कृषि के दम पर और अपने मेधा को लेकर उन्नति की है। आई आई टी और यूपीएससी जैसे कठिन परीक्षा में लगभग हर बार बिहार के प्रतिभागी अव्वल होते हैं। इनकी बढ़ती निष्ठा और गौरवशाली इतिहास बिहार को एक बार फिर से अनोखा और विकसित बनाएगा।");


            // Inflate the layout for this fragment
            return view;

        }

    }
}