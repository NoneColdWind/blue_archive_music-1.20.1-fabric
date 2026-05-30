package cn.ncw.blue_archive_music.base;

import cn.ncw.blue_archive_music.BAMusic;

import java.io.IOException;
import java.util.*;

public class CommonVariable {

    public static Dictionary<String, String> BlueArchiveMusic = new Hashtable<>();

    public static Dictionary<String, Integer> BlueArchiveMusicLength = new Hashtable<>();

    public static List<String> BlueArchiveMusicIds = new ArrayList<>();

    public static List<String> Mitsukiyo = new ArrayList<>();

    public static List<String> Nor = new ArrayList<>();

    public static List<String> KARUT = new ArrayList<>();

    static {
        registerBlueArchiveMusicData();
    }
    
    /* static {
        BlueArchiveMusic.put("theme_01", "Constant Moderato");
        BlueArchiveMusic.put("theme_02", "Luminous memory");
        BlueArchiveMusic.put("theme_03", "Mischievous Step");
        BlueArchiveMusic.put("theme_04", "Lovely Picnic");
        BlueArchiveMusic.put("theme_05", "Colorful Mess");
        BlueArchiveMusic.put("theme_06", "Funky Road");
        BlueArchiveMusic.put("theme_07", "Unwelcome School");
        BlueArchiveMusic.put("theme_08", "Shady Girls");
        BlueArchiveMusic.put("theme_09", "Midsummer cat");
        BlueArchiveMusic.put("theme_10", "Romantic Smile");
        BlueArchiveMusic.put("theme_11", "Connected Sky");
        BlueArchiveMusic.put("theme_12", "Shooting Stars");
        BlueArchiveMusic.put("theme_13", "Barrier");
        BlueArchiveMusic.put("theme_14", "Step by Step");
        BlueArchiveMusic.put("theme_15", "Honey Jam");
        BlueArchiveMusic.put("theme_16", "MX Adventure");
        BlueArchiveMusic.put("theme_17", "Irasshaimase");
        BlueArchiveMusic.put("theme_18", "Mechanical JUNGLE");
        BlueArchiveMusic.put("theme_19", "Virtual Storm");
        BlueArchiveMusic.put("theme_20", "Tech N Tech");
        BlueArchiveMusic.put("theme_21", "Midnight Trip");
        BlueArchiveMusic.put("theme_21_short", "Midnight Trip (Short)");
        BlueArchiveMusic.put("theme_22", "Daily Routine 247");
        BlueArchiveMusic.put("theme_23", "Party time");
        BlueArchiveMusic.put("theme_24", "Endless Carnival (All)");
        BlueArchiveMusic.put("theme_24_8bit", "Endless Carnival 8-Bit Arrange");
        BlueArchiveMusic.put("theme_24_chorus", "Endless Carnival 03 (Chorus)");
        BlueArchiveMusic.put("theme_24_intro", "Endless Carnival 01 (Intro)");
        BlueArchiveMusic.put("theme_24_verse", "Endless Carnival 02 (Verse)");
        BlueArchiveMusic.put("theme_25", "Future Bossa");
        BlueArchiveMusic.put("theme_26", "Lemonade Diary");
        BlueArchiveMusic.put("theme_27", "Fade Out");
        BlueArchiveMusic.put("theme_28", "Plug and Play");
        BlueArchiveMusic.put("theme_29", "Alert");
        BlueArchiveMusic.put("theme_30", "CrossFire");
        BlueArchiveMusic.put("theme_31", "Hello to Halo");
        BlueArchiveMusic.put("theme_32", "GGF");
        BlueArchiveMusic.put("theme_33", "Vivid Night");
        BlueArchiveMusic.put("theme_34", "Aoharu");
        BlueArchiveMusic.put("theme_34_short", "Aoharu (short)");
        BlueArchiveMusic.put("theme_35", "Morose Dreamer");
        BlueArchiveMusic.put("theme_36", "Koi is love");
        BlueArchiveMusic.put("theme_37", "Aira");
        BlueArchiveMusic.put("theme_38", "Guruguru Usagi");
        BlueArchiveMusic.put("theme_39", "Water Drop");
        BlueArchiveMusic.put("theme_40", "Neo City Dive");
        BlueArchiveMusic.put("theme_41", "Interface");
        BlueArchiveMusic.put("theme_42", "Glitch Street");
        BlueArchiveMusic.put("theme_43", "KIRISAME");
        BlueArchiveMusic.put("theme_44", "Walkthrough");
        BlueArchiveMusic.put("theme_45", "Signal of Abydos");
        BlueArchiveMusic.put("theme_46", "Sugar story");
        BlueArchiveMusic.put("theme_47", "Coffee Cats");
        BlueArchiveMusic.put("theme_48", "Out of Control (All)");
        BlueArchiveMusic.put("theme_48_chorus", "Out of Control 03 (Chorus)");
        BlueArchiveMusic.put("theme_48_intro", "Out of Control 01 (Intro)");
        BlueArchiveMusic.put("theme_48_verse", "Out of Control 02 (Verse)");
        BlueArchiveMusic.put("theme_49", "Mechanical JUNGLE (Hi-Tech Full On Mix)");
        BlueArchiveMusic.put("theme_50", "Hue");
        BlueArchiveMusic.put("theme_51", "ARES");
        BlueArchiveMusic.put("theme_52", "Vibes");
        BlueArchiveMusic.put("theme_53", "Future Lab");
        BlueArchiveMusic.put("theme_54", "After the Beep");
        BlueArchiveMusic.put("theme_55", "Moment");
        BlueArchiveMusic.put("theme_56", "Fearful Utopia");
        BlueArchiveMusic.put("theme_57", "Han-nari");
        BlueArchiveMusic.put("theme_58", "SAKURA PUNCH");
        BlueArchiveMusic.put("theme_59", "RE Aoharu");
        BlueArchiveMusic.put("theme_59_short", "RE Aoharu (Short)");
        BlueArchiveMusic.put("theme_59_title", "RE Aoharu (Title)");
        BlueArchiveMusic.put("theme_60", "SAKURA PUNCH Hard Arrange");
    } //Music

    static {
        BlueArchiveMusicLength.put("theme_01", 139);
        BlueArchiveMusicLength.put("theme_02", 138);
        BlueArchiveMusicLength.put("theme_03", 152);
        BlueArchiveMusicLength.put("theme_04", 140);
        BlueArchiveMusicLength.put("theme_05", 113);
        BlueArchiveMusicLength.put("theme_06", 132);
        BlueArchiveMusicLength.put("theme_07", 122);
        BlueArchiveMusicLength.put("theme_08", 156);
        BlueArchiveMusicLength.put("theme_09", 141);
        BlueArchiveMusicLength.put("theme_10", 135);
        BlueArchiveMusicLength.put("theme_11", 123);
        BlueArchiveMusicLength.put("theme_12", 118);
        BlueArchiveMusicLength.put("theme_13", 126);
        BlueArchiveMusicLength.put("theme_14", 132);
        BlueArchiveMusicLength.put("theme_15", 139);
        BlueArchiveMusicLength.put("theme_16", 114);
        BlueArchiveMusicLength.put("theme_17", 131);
        BlueArchiveMusicLength.put("theme_18", 124);
        BlueArchiveMusicLength.put("theme_19", 127);
        BlueArchiveMusicLength.put("theme_20", 125);
        BlueArchiveMusicLength.put("theme_21", 94);
        BlueArchiveMusicLength.put("theme_21_short", 45);
        BlueArchiveMusicLength.put("theme_22", 117);
        BlueArchiveMusicLength.put("theme_23", 78);
        BlueArchiveMusicLength.put("theme_24", 144);
        BlueArchiveMusicLength.put("theme_24_8bit", 144);
        BlueArchiveMusicLength.put("theme_24_chorus", 61);
        BlueArchiveMusicLength.put("theme_24_intro", 23);
        BlueArchiveMusicLength.put("theme_24_verse", 61);
        BlueArchiveMusicLength.put("theme_25", 132);
        BlueArchiveMusicLength.put("theme_26", 156);
        BlueArchiveMusicLength.put("theme_27", 92);
        BlueArchiveMusicLength.put("theme_28", 129);
        BlueArchiveMusicLength.put("theme_29", 120);
        BlueArchiveMusicLength.put("theme_30", 116);
        BlueArchiveMusicLength.put("theme_31", 106);
        BlueArchiveMusicLength.put("theme_32", 113);
        BlueArchiveMusicLength.put("theme_33", 106);
        BlueArchiveMusicLength.put("theme_34", 109);
        BlueArchiveMusicLength.put("theme_34_short", 32);
        BlueArchiveMusicLength.put("theme_35", 143);
        BlueArchiveMusicLength.put("theme_36", 110);
        BlueArchiveMusicLength.put("theme_37", 138);
        BlueArchiveMusicLength.put("theme_38", 139);
        BlueArchiveMusicLength.put("theme_39", 132);
        BlueArchiveMusicLength.put("theme_40", 140);
        BlueArchiveMusicLength.put("theme_41", 118);
        BlueArchiveMusicLength.put("theme_42", 128);
        BlueArchiveMusicLength.put("theme_43", 115);
        BlueArchiveMusicLength.put("theme_44", 110);
        BlueArchiveMusicLength.put("theme_45", 115);
        BlueArchiveMusicLength.put("theme_46", 122);
        BlueArchiveMusicLength.put("theme_47", 175);
        BlueArchiveMusicLength.put("theme_48", 131);
        BlueArchiveMusicLength.put("theme_48_chorus", 45);
        BlueArchiveMusicLength.put("theme_48_intro", 45);
        BlueArchiveMusicLength.put("theme_48_verse", 45);
        BlueArchiveMusicLength.put("theme_49", 132);
        BlueArchiveMusicLength.put("theme_50", 117);
        BlueArchiveMusicLength.put("theme_51", 114);
        BlueArchiveMusicLength.put("theme_52", 137);
        BlueArchiveMusicLength.put("theme_53", 122);
        BlueArchiveMusicLength.put("theme_54", 120);
        BlueArchiveMusicLength.put("theme_55", 104);
        BlueArchiveMusicLength.put("theme_56", 124);
        BlueArchiveMusicLength.put("theme_57", 104);
        BlueArchiveMusicLength.put("theme_58", 125);
        BlueArchiveMusicLength.put("theme_59", 143);
        BlueArchiveMusicLength.put("theme_59_short", 84);
        BlueArchiveMusicLength.put("theme_59_title", 95);
        BlueArchiveMusicLength.put("theme_60", 123);
    } //Length

    static {
        BlueArchiveMusicNames.add("theme_01");
        BlueArchiveMusicNames.add("theme_02");
        BlueArchiveMusicNames.add("theme_03");
        BlueArchiveMusicNames.add("theme_04");
        BlueArchiveMusicNames.add("theme_05");
        BlueArchiveMusicNames.add("theme_06");
        BlueArchiveMusicNames.add("theme_07");
        BlueArchiveMusicNames.add("theme_08");
        BlueArchiveMusicNames.add("theme_09");
        BlueArchiveMusicNames.add("theme_10");
        BlueArchiveMusicNames.add("theme_11");
        BlueArchiveMusicNames.add("theme_12");
        BlueArchiveMusicNames.add("theme_13");
        BlueArchiveMusicNames.add("theme_14");
        BlueArchiveMusicNames.add("theme_15");
        BlueArchiveMusicNames.add("theme_16");
        BlueArchiveMusicNames.add("theme_17");
        BlueArchiveMusicNames.add("theme_18");
        BlueArchiveMusicNames.add("theme_19");
        BlueArchiveMusicNames.add("theme_20");
        BlueArchiveMusicNames.add("theme_21");
        BlueArchiveMusicNames.add("theme_21_short");
        BlueArchiveMusicNames.add("theme_22");
        BlueArchiveMusicNames.add("theme_23");
        BlueArchiveMusicNames.add("theme_24");
        BlueArchiveMusicNames.add("theme_24_8bit");
        BlueArchiveMusicNames.add("theme_24_chorus");
        BlueArchiveMusicNames.add("theme_24_intro");
        BlueArchiveMusicNames.add("theme_24_verse");
        BlueArchiveMusicNames.add("theme_25");
        BlueArchiveMusicNames.add("theme_26");
        BlueArchiveMusicNames.add("theme_27");
        BlueArchiveMusicNames.add("theme_28");
        BlueArchiveMusicNames.add("theme_29");
        BlueArchiveMusicNames.add("theme_30");
        BlueArchiveMusicNames.add("theme_31");
        BlueArchiveMusicNames.add("theme_32");
        BlueArchiveMusicNames.add("theme_33");
        BlueArchiveMusicNames.add("theme_34");
        BlueArchiveMusicNames.add("theme_34_short");
        BlueArchiveMusicNames.add("theme_35");
        BlueArchiveMusicNames.add("theme_36");
        BlueArchiveMusicNames.add("theme_37");
        BlueArchiveMusicNames.add("theme_38");
        BlueArchiveMusicNames.add("theme_39");
        BlueArchiveMusicNames.add("theme_40");
        BlueArchiveMusicNames.add("theme_41");
        BlueArchiveMusicNames.add("theme_42");
        BlueArchiveMusicNames.add("theme_43");
        BlueArchiveMusicNames.add("theme_44");
        BlueArchiveMusicNames.add("theme_45");
        BlueArchiveMusicNames.add("theme_46");
        BlueArchiveMusicNames.add("theme_47");
        BlueArchiveMusicNames.add("theme_48");
        BlueArchiveMusicNames.add("theme_48_chorus");
        BlueArchiveMusicNames.add("theme_48_intro");
        BlueArchiveMusicNames.add("theme_48_verse");
        BlueArchiveMusicNames.add("theme_49");
        BlueArchiveMusicNames.add("theme_50");
        BlueArchiveMusicNames.add("theme_51");
        BlueArchiveMusicNames.add("theme_52");
        BlueArchiveMusicNames.add("theme_53");
        BlueArchiveMusicNames.add("theme_54");
        BlueArchiveMusicNames.add("theme_55");
        BlueArchiveMusicNames.add("theme_56");
        BlueArchiveMusicNames.add("theme_57");
        BlueArchiveMusicNames.add("theme_58");
        BlueArchiveMusicNames.add("theme_59");
        BlueArchiveMusicNames.add("theme_59_short");
        BlueArchiveMusicNames.add("theme_59_title");
        BlueArchiveMusicNames.add("theme_60");
    } //Names

    static {
        Mitsukiyo.add("Constant Moderato");
        Mitsukiyo.add("Luminous memory");
        Mitsukiyo.add("Mischievous Step");
        Mitsukiyo.add("Lovely Picnic");
        Mitsukiyo.add("Unwelcome School");
        Mitsukiyo.add("Shady Girls");
        Mitsukiyo.add("Midsummer cat");
        Mitsukiyo.add("Romantic Smile");
        Mitsukiyo.add("Honey Jam");
        Mitsukiyo.add("MX Adventure");
        Mitsukiyo.add("Irasshaimase");
        Mitsukiyo.add("Party time");
        Mitsukiyo.add("Endless Carnival (All)");
        Mitsukiyo.add("Endless Carnival 8-Bit Arrange");
        Mitsukiyo.add("Endless Carnival 03 (Chorus)");
        Mitsukiyo.add("Endless Carnival 01 (Intro)");
        Mitsukiyo.add("Endless Carnival 02 (Verse)");
        Mitsukiyo.add("Future Bossa");
        Mitsukiyo.add("Lemonade Diary");
        Mitsukiyo.add("Morose Dreamer");
        Mitsukiyo.add("Koi is love");
        Mitsukiyo.add("Aira");
        Mitsukiyo.add("Guruguru Usagi");
        Mitsukiyo.add("Coffee Cats");
    } //Mitsukiyo

    static {
        Nor.add("Midnight Trip");
        Nor.add("Midnight Trip (Short)");
        Nor.add("Daily Routine 247");
        Nor.add("Hello to Halo");
        Nor.add("GGF");
        Nor.add("Vivid Night");
        Nor.add("Aoharu");
        Nor.add("Aoharu (short)");
        Nor.add("Walkthrough");
        Nor.add("Signal of Abydos");
        Nor.add("Sugar story");
        Nor.add("ARES");
        Nor.add("Vibes");
        Nor.add("Future Lab");
        Nor.add("After the Beep");
        Nor.add("Moment");
        Nor.add("Fearful Utopia");
        Nor.add("Han-nari");
        Nor.add("SAKURA PUNCH");
        Nor.add("RE Aoharu");
        Nor.add("RE Aoharu (Short)");
        Nor.add("RE Aoharu (Title)");
        Nor.add("SAKURA PUNCH Hard Arrange");
    } //Nor

    static {
        KARUT.add("Colorful Mess");
        KARUT.add("Funky Road");
        KARUT.add("Connected Sky");
        KARUT.add("Shooting Stars");
        KARUT.add("Barrier");
        KARUT.add("Step by Step");
        KARUT.add("Mechanical JUNGLE");
        KARUT.add("Virtual Storm");
        KARUT.add("Tech N Tech");
        KARUT.add("Fade Out");
        KARUT.add("Plug and Play");
        KARUT.add("Alert");
        KARUT.add("CrossFire");
        KARUT.add("Water Drop");
        KARUT.add("Neo City Dive");
        KARUT.add("Interface");
        KARUT.add("Glitch Street");
        KARUT.add("KIRISAME");
        KARUT.add("Out of Control (All)");
        KARUT.add("Out of Control 03 (Chorus)");
        KARUT.add("Out of Control 01 (Intro)");
        KARUT.add("Out of Control 02 (Verse)");
        KARUT.add("Mechanical JUNGLE (Hi-Tech Full On Mix)");
        KARUT.add("Hue");
    } //KARUT

     */

    public static void registerBlueArchiveMusicData() {
        String str;

        try {
            str = JarJsonReader.readJsonFromJar(getDataPath(BAMusic.MOD_ID));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        str = str.substring(1, str.length() - 1);
        str = str.replace("\"", "");
        String[] strings = str.split("},");

        Map<String, String> map = new HashMap<>();
        List<String> keys = new ArrayList<>();

        for (String string : strings) {
            string+="}";
            String[] vars = string.split("(?=\\{)");
            String key = vars[0].replace(":", "").replace(" ", "");
            String object = vars[1];
            map.put(key, object);
            keys.add(key);
        }

        BlueArchiveMusicIds.addAll(keys);

        for (String key : keys) {
            String var = map.get(key);
            String code = var.split("code: ")[1].split(",")[0].replace(" ", "");
            String name = var.split("name: ")[1].split(",")[0];
            String duration = var.split("duration: ")[1].split(",")[0];
            String artist = var.split("artist: ")[1].split("}")[0].replace(" ", "");
            BlueArchiveMusic.put(code, name);
            BlueArchiveMusicLength.put(code, Integer.parseInt(duration));
            switch (artist) {
                case "Mitsukiyo" -> Mitsukiyo.add(name);
                case "Nor" -> Nor.add(name);
                case "KARUT" -> KARUT.add(name);
            }
        }
    }

    public static String get_desc(String id) {
        String name = BlueArchiveMusic.get(id);
        String artist = "";
        if (Mitsukiyo.contains(name)) {
            artist = "Mitsukiyo";
        } else if (Nor.contains(name)) {
            artist = "Nor";
        } else if (KARUT.contains(name)) {
            artist = "KARUT";
        } else {
            artist = "Unknown";
        }
        return artist + " - " + name;
    }

    private static String getDataPath(String ModId) {
        return "assets/" + ModId + "/data.json";
    }
}
