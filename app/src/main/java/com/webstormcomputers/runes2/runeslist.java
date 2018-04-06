package com.webstormcomputers.runes2;

/**
 * Created by aaron on 4/3/2018.
 */

public class runeslist {

    public static wordune[] create_wordrunes() {
        wordune[] runelist = new wordune[4];

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
        runelist[1].effect ="Anyone who can say the Burden Free WordRune perfectly can reduce the grim sin enchantment";
        runelist[1].duration = "May be used once per day";
        runelist[1].ChStIncr = "JO+1mu";
        runelist[1].SsIncr = "SS+1mu";

        runelist[2] = new wordune();
        runelist[2].IdWordRune = 3;
        runelist[2].WrName = "Father's Desires WordRune";
        runelist[2].scripture = "You belong to your father, the devil, and you want to carry out your father's\n" +
                "desire. He was a murderer from the beginning, not holding to the truth, for" +
                "there is no truth in him.";
        runelist[2].reference = "John 8:44a";
        runelist[2].ChStReq = "PA 4";
        runelist[2].SsReq = "DL3";
        runelist[2].effect ="Anyone who can say the Father's Desires WordRune perfectly can reduce the mound orc" +
                "sin enchantment by 2 difficulty levels.";
        runelist[2].duration = "May be used once per day";
        runelist[2].ChStIncr = "PA+1mu";
        runelist[2].SsIncr = "SS+3mu";

        runelist[3] = new wordune();
        runelist[3].IdWordRune = 4;
        runelist[3].WrName = "Chosen People WordRune";
        runelist[3].scripture = "Therefore, as God's chosen people, holy and dearly loved, clothe yourselve with compassion, kindness, humility, gentleness and patience.";
        runelist[3].reference = "Colossians 3:12";
        runelist[3].ChStReq = "GE 4";
        runelist[3].SsReq = "DL1";
        runelist[3].effect ="Anyone who can say the Chosen People WordRune perfectly can reduce the goblin sin enchantment by 2 difficulty levels.";
        runelist[3].duration = "May be used once per day";
        runelist[3].ChStIncr = "GE+1mu";
        runelist[3].SsIncr = "SS+1mu";


        return runelist;
    }


}

