package com.webstormcomputers.runes2;
/*
TODO
1. Button handlers to advance and reverse data record
2. Database connection of some sort to store the hundreds of word runes.


 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import static com.webstormcomputers.runes2.R.id.WrName;

public class MainActivity extends AppCompatActivity {
 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);
  wordune[] runes = runeslist.create_wordrunes();
/**wordune[] runes = new wordune[2];
     runes[0] = new wordune();
     runes[0].IdWordRune = 1;
     runes[0].WrName = "Night Light Wordrune";
     runes[0].scripture = "Thy Word is a lamp unto my feet and a light unto my path";
     runes[0].reference = "Psalms 119:105";
     runes[0].ChStReq = "JO 4";
     runes[0].SsReq = "DL1";
     runes[0].effect = "When a LightRaider says the Night Light WordRune, an area 20 feet ahead of the\n" +
             "LightRaider is lit up. The light moves with the player. The Night Light lasts until it is\n" +
             "commanded to leave.";
     runes[0].duration = "May be used as often as needed";
     runes[0].ChStIncr = "JO+1mu";
     runes[0].SsIncr = "SS+1mu";
*/
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



  wordruneId.setText(Integer.toString(runes[0].IdWordRune));
  Wrname.setText(runes[0].WrName);
  Reference.setText(runes[0].reference);
  Script.setText(runes[0].scripture);
  chstreq.setText(runes[0].ChStReq);
  ssreq.setText(runes[0].SsReq);
  eff.setText(runes[0].effect);
  dur.setText(runes[0].duration);
  chincr.setText(runes[0].ChStIncr);
  ssincr.setText(runes[0].SsIncr);

 }
}
