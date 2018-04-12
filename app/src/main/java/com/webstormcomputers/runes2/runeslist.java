package com.webstormcomputers.runes2;

/**
 * Created by aaron on 4/3/2018.
 */

public class runeslist {

    public static wordune[] create_wordrunes() {
        wordune[] runelist = new wordune[10];

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
        runelist[1].effect ="Anyone who can say the Burden Free WordRune perfectly can reduce the grim sin enchantment by 2 difficulty levels";
        runelist[1].duration = "May be used once per day";
        runelist[1].ChStIncr = "JO+1mu";
        runelist[1].SsIncr = "SS+1mu";

        runelist[2] = new wordune();
        runelist[2].IdWordRune = 3;
        runelist[2].WrName = "Father's Desires WordRune";
        runelist[2].scripture = "You belong to your father, the devil, and you want to carry out your father's desire. He was a murderer from the beginning, not holding to the truth, for there is no truth in him.";
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
        runelist[3].scripture = "Therefore, as God's chosen people, holy and dearly loved, clothe yourselves with compassion, kindness, humility, gentleness and patience.";
        runelist[3].reference = "Colossians 3:12";
        runelist[3].ChStReq = "GE 4";
        runelist[3].SsReq = "DL1";
        runelist[3].effect ="Anyone who can say the Chosen People WordRune perfectly can reduce the goblin sin enchantment by 2 difficulty levels.";
        runelist[3].duration = "May be used once per day";
        runelist[3].ChStIncr = "GE+1mu";
        runelist[3].SsIncr = "SS+1mu";

        runelist[4] = new wordune();
        runelist[4].IdWordRune = 5;
        runelist[4].WrName = "Idol Smasher WordRune";
        runelist[4].scripture = "You shall have no other gods before me.";
        runelist[4].reference = "Exodus 20:3";
        runelist[4].ChStReq = "FA 4";
        runelist[4].SsReq = "DL1";
        runelist[4].effect ="Anyone who can say the Idol Smasher WordRune perfectly can reduce the golden calf sin enchantment by 2 difficulty levels.";
        runelist[4].duration = "May be used once per day";
        runelist[4].ChStIncr = "FA+1mu";
        runelist[4].SsIncr = "SS+1mu";

        runelist[5] = new wordune();
        runelist[5].IdWordRune = 6;
        runelist[5].WrName = "Watch Out WordRune";
        runelist[5].scripture = "Then he said to them, Watch out! Be on your guard against all kinds of greed; a man's life does not consist in the abundance of his possessions.";
        runelist[5].reference = "Luke 12:15";
        runelist[5].ChStReq = "SC 4";
        runelist[5].SsReq = "DL2";
        runelist[5].effect ="Anyone who can say the Watch Out WordRune perfectly can reduce the cave troll sin enchantment by 2 difficulty levels.";
        runelist[5].duration = "May be used once per day";
        runelist[5].ChStIncr = "SC+1mu";
        runelist[5].SsIncr = "SS+2mu";

        runelist[6] = new wordune();
        runelist[6].IdWordRune = 7;
        runelist[6].WrName = "Humble Lift WordRune";
        runelist[6].scripture = "Humble yourselves, therefore, under God's mighty hand, that he may lift you up in due time.";
        runelist[6].reference = "1 Peter 5:6";
        runelist[6].ChStReq = "GE 4";
        runelist[6].SsReq = "DL1";
        runelist[6].effect ="Anyone who can say the Humble Lift WordRune perfectly can reduce the forest troll sin enchantment by 2 difficulty levels.";
        runelist[6].duration = "May be used once per day";
        runelist[6].ChStIncr = "GE+1mu";
        runelist[6].SsIncr = "SS+1mu";

        runelist[7] = new wordune();
        runelist[7].IdWordRune = 8;
        runelist[7].WrName = "Richest Promise WordRune";
        runelist[7].scripture = "Keep your lives free from the love of money and be content with what you have, because God has said, \"Never will I leave you; never will I forsake you.\"";
        runelist[7].reference = "Hebrews 13:5";
        runelist[7].ChStReq = "JO 4";
        runelist[7].SsReq = "DL3";
        runelist[7].effect ="Anyone who can say the Richest Promise WordRune perfectly can reduce the water troll sin enchantment by 2 difficulty levels.";
        runelist[7].duration = "May be used once per day";
        runelist[7].ChStIncr = "JO+2mu";
        runelist[7].SsIncr = "SS+3mu";

        runelist[8] = new wordune();
        runelist[8].IdWordRune = 9;
        runelist[8].WrName = "Hope Way WordRune";
        runelist[8].scripture = "Why are you downcast, O my soul? Why so disturbed within me? Put your hope in God,. . .";
        runelist[8].reference = "Psalm 42:5a";
        runelist[8].ChStReq = "HO 4";
        runelist[8].SsReq = "DL1";
        runelist[8].effect ="Anyone who can say the Hope Way WordRune perfectly can reduce the skeleton sin enchantment by 2 difficulty levels.";
        runelist[8].duration = "May be used once per day";
        runelist[8].ChStIncr = "JO+1mu";
        runelist[8].SsIncr = "SS+1mu";

        runelist[9] = new wordune();
        runelist[9].IdWordRune = 10;
        runelist[9].WrName = "Father's Will WordRune";
        runelist[9].scripture = "Not everyone who says to me, \"Lord, Lord,\" will enter the kingdom of heaven, but only he who does the will of my Father who is in heaven.";
        runelist[9].reference = "Matthew 7:21";
        runelist[9].ChStReq = "FA 4";
        runelist[9].SsReq = "DL2";
        runelist[9].effect ="Anyone who can say the Father's Will WordRune perfectly can reduce the selfoe sin enchantment by 2 difficulty levels.";
        runelist[9].duration = "May be used once per day";
        runelist[9].ChStIncr = "FA+1mu";
        runelist[9].SsIncr = "SS+2mu";

        return runelist;
    }


}

