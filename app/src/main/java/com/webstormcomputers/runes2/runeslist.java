package com.webstormcomputers.runes2;

/**
 * Created by aaron on 4/3/2018.
 */

public class runeslist {

    public static wordune[] create_wordrunes() {
        wordune[] runelist = new wordune[18];

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

        runelist[10] = new wordune();
        runelist[10].IdWordRune = 11;
        runelist[10].WrName = "Bitter Brew WordRune";
        runelist[10].scripture = "Get rid of all bitterness, rage and anger, brawling and slander, along with every form of malice. Be kind and compassionate to one another, forgiving each other, just as in Christ God forgave you.";
        runelist[10].reference = "Ephesians 4:31-32";
        runelist[10].ChStReq = "GO 4";
        runelist[10].SsReq = "DL 2";
        runelist[10].effect ="Anyone who can say the Father's Will WordRune perfectly can reduce the gall buzzard sin enchantment by 2 difficulty levels.";
        runelist[10].duration = "May be used once per day";
        runelist[10].ChStIncr = "GO+1mu";
        runelist[10].SsIncr = "SS+2mu";

        runelist[11] = new wordune();
        runelist[11].IdWordRune = 12;
        runelist[11].WrName = "Love Drive WordRune";
        runelist[11].scripture = "There is no fear in love. But perfect love drives out fear, because fear has to do with punishment.";
        runelist[11].reference = "1 John 4:18a";
        runelist[11].ChStReq = "LO 4";
        runelist[11].SsReq = "DL 1";
        runelist[11].effect ="Anyone who can say the Love Drive WordRune perfectly can reduce the giant sin enchantment by 2 difficulty levels.";
        runelist[11].duration = "May be used once per day";
        runelist[11].ChStIncr = "LO+1mu";
        runelist[11].SsIncr = "SS+1mu";

        runelist[12] = new wordune();
        runelist[12].IdWordRune = 13;
        runelist[12].WrName = "Stolen Words WordRune";
        runelist[12].scripture = "Save me, O Lord, from lying lips and from deceitful tongues.";
        runelist[12].reference = "Psalm 120:2";
        runelist[12].ChStReq = "GO 4";
        runelist[12].SsReq = "DL 1";
        runelist[12].effect ="Anyone who can say the Stolen Words WordRune perfectly can reduce the cave arachnid sin enchantment by 2 difficulty levels.";
        runelist[12].duration = "May be used once per day";
        runelist[12].ChStIncr = "GO+1mu";
        runelist[12].SsIncr = "SS+1mu";

        runelist[13] = new wordune();
        runelist[13].IdWordRune = 14;
        runelist[13].WrName = "Worthless Treasures WordRune";
        runelist[13].scripture = "Ill-gotten treasures are of no value, but righteousness delivers from death.";
        runelist[13].reference = "Proverbs 10:2";
        runelist[13].ChStReq = "GO 4";
        runelist[13].SsReq = "DL 1";
        runelist[13].effect ="Anyone who can say the Worthless Treasures WordRune perfectly can reduce the greedo sin enchantment by 2 difficulty levels.";
        runelist[13].duration = "May be used once per day";
        runelist[13].ChStIncr = "GO+1mu";
        runelist[13].SsIncr = "SS+1mu";

        runelist[14] = new wordune();
        runelist[14].IdWordRune = 15;
        runelist[14].WrName = "Unstable Help WordRune";
        runelist[14].scripture = ". . . he is a double-minded man, unstable in all he does.";
        runelist[14].reference = "James 1:8";
        runelist[14].ChStReq = "GO 4";
        runelist[14].SsReq = "DL 1";
        runelist[14].effect ="Anyone who can say the Unstable Help WordRune perfectly can reduce the fluster beast sin enchantment by 2 difficulty levels.";
        runelist[14].duration = "May be used once per day";
        runelist[14].ChStIncr = "GO+1mu";
        runelist[14].SsIncr = "SS+1mu";

        runelist[15] = new wordune();
        runelist[15].IdWordRune = 16;
        runelist[15].WrName = "Fool's Pleasure WordRune";
        runelist[15].scripture = "A fool finds pleasure in evil conduct, but a man of understanding delights in wisdom.";
        runelist[15].reference = "Proverbs 10:23";
        runelist[15].ChStReq = "GO 4";
        runelist[15].SsReq = "DL 1";
        runelist[15].effect ="Anyone who can say the Fool's Pleasure WordRune perfectly can reduce the wood sprite sin enchantment by 2 difficulty levels.";
        runelist[15].duration = "May be used once per day";
        runelist[15].ChStIncr = "GO+1mu";
        runelist[15].SsIncr = "SS+1mu";

        runelist[16] = new wordune();
        runelist[16].IdWordRune = 17;
        runelist[16].WrName = "Love Command WordRune";
        runelist[16].scripture = "My command is this: Love each other as I have loved you.";
        runelist[16].reference = "John 15:12";
        runelist[16].ChStReq = "LO 1";
        runelist[16].SsReq = "DL 1";
        runelist[16].effect ="By saying from memory the Love Command WordRune, a LightRaider may add 2 to the Love Character Strength. Lasts for one encounter.";
        runelist[16].duration = "May be used once per day";
        runelist[16].ChStIncr = "LO+1mu";
        runelist[16].SsIncr = "SS+1mu";

        runelist[17] = new wordune();
        runelist[17].IdWordRune = 18;
        runelist[17].WrName = "Joyful Thanks WordRune";
        runelist[17].scripture = "Be joyful always; pray continually; give thanks in all circumstances, for this is God's will for you. . .";
        runelist[17].reference = "1 Thessalonians 5:16-18a";
        runelist[17].ChStReq = "JO 1";
        runelist[17].SsReq = "DL 1";
        runelist[17].effect ="By saying from memory the Joyful Thanks WordRune, a LightRaider may add 2 to the Joy Character Strength. Lasts for one encounter. ";
        runelist[17].duration = "May be used once per day";
        runelist[17].ChStIncr = "JO+1mu";
        runelist[17].SsIncr = "SS+1mu";

        return runelist;
    }


}

