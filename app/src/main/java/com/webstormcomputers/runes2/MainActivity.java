package com.webstormcomputers.runes2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import static com.webstormcomputers.runes2.R.id.WrName;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wordune nightlight = new wordune();
        nightlight.IdWordRune = 1;
        nightlight.WrName = "Night Light Wordrune";
        nightlight.scripture = "Thy Word is a lamp unto my feet and a light unto my path";
        nightlight.reference = "Psalms 119:105";
        nightlight.ChStReq = "JO 4";
        nightlight.SsReq = "DL1";
        nightlight.effect = "When a LightRaider says the Night Light WordRune, an area 20 feet ahead of the\n" +
                "LightRaider is lit up. The light moves with the player. The Night Light lasts until it is\n" +
                "commanded to leave.";
        nightlight.duration = "May be used as often as needed";
        nightlight.ChStIncr = "JO+1mu";
        nightlight.SsIncr = "SS+1mu";

        TextView wordruneId;
        TextView Wrname;
        TextView Reference;
        TextView Script;
        TextView chstreq;
        TextView ssreq;
        TextView eff;
        TextView dur;
        TextView chincr;
        TextView ssincr;

        wordruneId = (TextView)findViewById(R.id.wordruneId);
        Wrname = (TextView) findViewById(WrName);
        Reference = (TextView) findViewById(R.id.reference);
        Script = (TextView) findViewById(R.id.scripture);
        chstreq = (TextView) findViewById(R.id.CharStr);
        ssreq = (TextView) findViewById(R.id.SSreq);
        eff = (TextView) findViewById(R.id.Effect);
        dur = (TextView) findViewById(R.id.Duration);
        chincr = (TextView) findViewById(R.id.ChStIncr);
        ssincr = (TextView) findViewById(R.id.SSIncr);



       wordruneId.setText(Integer.toString(nightlight.IdWordRune));
        Wrname.setText(nightlight.WrName);
        Reference.setText(nightlight.reference);
        Script.setText(nightlight.scripture);
        chstreq.setText(nightlight.ChStReq);
        ssreq.setText(nightlight.SsReq);
        eff.setText(nightlight.effect);
        dur.setText(nightlight.duration);
        chincr.setText(nightlight.ChStIncr);
        ssincr.setText(nightlight.SsIncr);
    }
}
