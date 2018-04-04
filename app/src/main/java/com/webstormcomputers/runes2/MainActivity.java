package com.webstormcomputers.runes2;
/*
TODO
1. Button handlers to advance and reverse data record
2. Database connection of some sort to store the hundreds of word runes.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.webstormcomputers.runes2.R.id.WrName;

public class MainActivity extends AppCompatActivity {
    int indexId = 0;
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
    Button Next;
    Button Previous;
    wordune[] runes = runeslist.create_wordrunes();

    @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

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

 }
    public void nextOnclick(View view){
        while (indexId < runes.length) {

        wordruneId.setText(Integer.toString(runes[indexId].IdWordRune));
        Wrname.setText(runes[indexId].WrName);
        Reference.setText(runes[indexId].reference);
        Script.setText(runes[indexId].scripture);
        chstreq.setText(runes[indexId].ChStReq);
        ssreq.setText(runes[indexId].SsReq);
        eff.setText(runes[indexId].effect);
        dur.setText(runes[indexId].duration);
        chincr.setText(runes[indexId].ChStIncr);
        ssincr.setText(runes[indexId].SsIncr);
        indexId++;
        }
    }
}
