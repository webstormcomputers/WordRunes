package com.webstormcomputers.runes2;

/**
 * Created by aaron on 4/3/2018.
 */

public class runeslist {

    public static wordune[] create_wordrunes() {
        wordune[] runelist = new wordune[2];

        runelist[0] = new wordune();
        runelist[0].IdWordRune = 1;
        runelist[0].WrName = "Not Me WordRune";
        runelist[0].scripture = "Do not be anxious about anything, but in everything, by prayer and petition,\n" +
                "with thanksgiving, present your requests to God.";
        runelist[0].reference = "Phillipians 4:6";
        runelist[0].ChStReq = "PE 4";
        runelist[0].SsReq = "DL2";
        runelist[0].effect = "Anyone who can say the Not Me WordRune perfectly can reduce the muk sin enchantment\n" +
                "by 2 difficulty levels";
        runelist[0].duration = "May be used only once per day.";
        runelist[0].ChStIncr = "PE+1mu";
        runelist[0].SsIncr = "SS+2mu";

        runelist[1] = new wordune();
        runelist[1].IdWordRune = 2;
        runelist[1].WrName = "Burden Free WordRune";
        runelist[1].scripture = "Come to me, all you who are weary and burdened, and I will give you rest";
        runelist[1].reference = "Matthew 11:28";
        runelist[1].ChStReq = "JO 4";
        runelist[1].SsReq = "DL1";
        runelist[1].effect ="Anyone who can say the Burden Free WordRune perfectly can reduce the grim sin";
        runelist[1].duration = "May be used once per day";
        runelist[1].ChStIncr = "JO+1mu";
        runelist[1].SsIncr = "SS+1mu";


        return runelist;
    }


}

