package com.webstormcomputers.runes2;

/**
 * Created by aaron on 4/3/2018.
 */

public class runeslist {

 public static wordune[] create_wordrunes() {
  wordune[] runelist = new wordune[2];
  //runelist[0].IdWordRune = 0;
  //runelist[0].WrName = "";
  runelist[0] = new wordune();
  runelist[0].IdWordRune = 1;
  runelist[0].WrName = "Night Light Wordrune";
  runelist[0].scripture = "Thy Word is a lamp unto my feet and a light unto my path";
  runelist[0].reference = "Psalms 119:105";
  runelist[0].ChStReq = "JO 4";
  runelist[0].SsReq = "DL1";
  runelist[0].effect = "When a LightRaider says the Night Light WordRune, an area 20 feet ahead of the\n" +
          "LightRaider is lit up. The light moves with the player. The Night Light lasts until it is\n" +
          "commanded to leave.";
  runelist[0].duration = "May be used as often as needed";
  runelist[0].ChStIncr = "JO+1mu";
  runelist[0].SsIncr = "SS+1mu";

 return runelist;
 }


}

