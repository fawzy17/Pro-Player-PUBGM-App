package com.example.proplayerlist;

import java.util.ArrayList;

public class PlayerData {
    private static String[] playerNames ={
            "AERO Potato",
            "AURA Jayden",
            "BOOM Voker",
            "BTR Liquid",
            "BTR Luxxy",
            "BTR Ryzen",
            "BTR Zuxxy",
            "EVOS Microboy",
            "EVOS RedFaceN",
            "AURA NoMercy",
            "ONIC Cleon",
            "RRQ Mildway"
    };
    public static String[] playerDesc = {
            "Sharfan Syahman Shodik atau yang dikenal dengan nama Aero Potato adalah pemain jebolan Aerowolf LIMAX yang didatangkan pada tahun 2019 lalu. Pada perhelatan final PMPL ID Season 2 kemarin, Potato mampu menjadi salah satu pemain dengan jumlah kill terbanyak, yakni 24 kill dengan total damage sebesar 5.209. Bersama dengan Aerowolf LIMAX, Potato mampu membawa timnya menjadi juara dan mewakilkan Indonesia di PMPL SEA Final.",
            "Posisi selanjutnya ada Jason Kurniawan atau Jayden. Jayden punya performa yang mengerikan bersama dengan Aura Esports. Pada kejuaran DGL 2020 kemarin, ia menjadi satu-satunya pemain di luar roster Bigetron RA yang bisa menyelinap ke daftar pemain dengan jumlah kill terbanyak. Performanya yang begitu epik berhasil membawa Aura Esports menjadi runner-up di PMPL ID Season 2.",
            "Voker atau Karistius Pufen Herja menjadi pro player PUBG Mobile terbaik selanjutnya yang ada di Indonesia. Perannya dalam membawa BOOM Esports meraih posisi tiga di PMPL ID Season 2 sangat penting. Dengan permainan agresif miliknya, Voker mampu mendapatkan total 19 kill dengan total damage sebesar 3.399 selama final PMPL ID Season 2 digelar.",
            "Bersama dengan ION Esports di PMPL ID Season 2 kemarin, Leander Deusfiel atau yang dikenal dengan nama Liquid cukup menjadi perhatian berkat permainan sniper miliknya yang cukup menyebalkan. Setelah pergelaran PMPL ID Season 2, Liquid pun berganti jersey yang kini menjadi bagian dari Bigetron RA. Meski sudah menjadi roster resmi, tapi Liquid tidak bisa dimainkan dalam turnamen PMPL SEA Finals karena adanya roster lock.",
            "Made Bagus Prabaswara atau yang akrab disapa Luxxy adalah pro player PUBG Mobile terbaik yang datang dari Bigetron Red Aliens. Luxxy sangat handal menggunakan sniper dalam membidik lawan-lawannya. Bahkan kemampuannya sudah diakui dunia, lho! Terbukti, ia mampu masuk ke dalam nominasi Esports Mobile Player of the Year yang diadakan oleh Esports Awards setiap tahunnya.",
            "Ryzen atau yang dikenal Muhammad Albi adalah pro player PUBG Mobile terbaik selanjutnya yang datang dari tim Bigetron Red Aliens. Pria yang dikenal sebagai rusher dari tim Bigetron ini memang tak perlu diragukan lagi kemampuannya dalam mengacak-acak formasi lawan. Ryzen menjadi salah satu pemain paling berbahaya pada reguler season PMPL ID Season 2 kemarin dengan mengantongi jumlah 120 kill!",
            "Made Bagas Pramudita atau yang akrab disapa Zuxxy. Sama seperti dengan Luxxy, Zuxxy juga mampu menjadi nominasi di Esports Mobile Player of the Year yang diadakan oleh Esports Awards. Peran Zuxxy di dalam game adalah sebagai leader sekaligus observer yang memberikan arahan ke teman-temannya untuk bergerak.",
            "Nizar Lugatio Pratama atau yang dikenal dengan nama Microboy memang layak menjadi pro player PUBG Mobile terbaik di Indonesia berkat role-nya sebagai support. Bersama dengan Bigetron RA, Microboy sudah mengantongi banyak gelar juara, salah satunya adalah PUBG Mobile World League 2020 - Season 0: East yang sempat menjadi perbincangan komunitas-komunitas PUBG Mobile di seluruh dunia. Kini dia bersama EVOS E-Sport",
            "Eksa Rachman Jayanto atau RedFaceN menjadi pro player PUBG Mobile terbaik di Indonesia selanjutnya yang perlu kita bahas. Performanya dalam membawa EVOS Esports juara di PINC 2020 dan runner up di reguler season PMPL ID Season 2 perlu diacungi jempol. Bahkan ia mampu mengalahkan keganasan Ryzen di reguler season PMPL ID Season 2 lalu dengan jumlah 138 kill.",
            "Fiqri Syachputra atau No Mercy layak masuk ke dalam jajaran pro player PUBG Mobile terbaik di Indonesia karena keganasannya dalam menghabisi lawan. Dalam gelaran turnamen final PMPL ID Season 2 kemarin, No Mercy berhasil menyabet gelar The Terminator dengan jumlah 29 kill. Karena gelar ini, ia pun mendapatkan uang tunai yang sama seperti Cleon, yakni sebesar $2,000 atau senilai Rp29,426,100.",
            "Cleon atau Muhammad Raafi Solihin menjadi pro player PUBG Mobile terbaik selanjutnya yang kita bahas. Meski ONIC tidak mengangkat piala di PMPL ID Season 2, Cleon mampu mendapatkan gelar MVP dan mengantongi uang tunai sebesar $2,000 atau senilai Rp29,426,100.",
            "Meski hanya bertengger di posisi 6, tapi permainan RRQ Ryu di PMPL ID Season 2 kemarin cukup memuaskan. Peran Midlway atau Muhammad Redian Putrama dalam membawa RRQ Ryu bersaing dengan tim-tim lainnya patut diacungi jempol. Ia mampu mendapatkan total 24 kill dengan 4.542 total damage dalam laga final kemarin yang sudah diselenggarakan.",
    };
    public static String[] playerDetails = {
            "Nama\t\t: Sharfan Syahman Shodik\n\nIGN\t\t\t: AERO Potato\n\nLahir\t\t: Mei 23 2002\n\nTim\t\t\t: AEROWOLF Esport\n\nPosisi\t: Rusher/Flanker",
            "Nama\t\t: Jason Kurniawan\n\nIGN\t\t\t: AURA Jayden\n\nLahir\t\t: November 19 1997\n\nTim\t\t\t: AURA Esport\n\nPosisi\t: Starter",
            "Nama\t\t: Karistius Pufen Herja\n\nIGN\t\t\t: BOOM Voker\n\nLahir\t\t: November 18 1998\n\nTim\t\t\t: BOOM Esport\n\nPosisi\t: Flanker",
            "Nama\t\t: Leander Deusfiel\n\nIGN\t\t\t: BTR Liquid\n\nLahir\t\t: Agustus 8 2004\n\nTim\t\t\t: BIGETRON Esport\n\nPosisi\t: Support/Sniper",
            "Nama\t\t: Made Bagus Prabaswara\n\nIGN\t\t\t: BTR Luxxy\n\nLahir\t\t: Mei 31 2003\n\nTim\t\t\t: BIGETRON Esport\n\nPosisi\t: Sniper",
            "Nama\t\t: Muhamad Albi\n\nIGN\t\t\t: BTR Ryzen\n\nLahir\t\t: Februari 14 2002\n\nTim\t\t\t: BIGETRON Esport\n\nPosisi\t: Rusher",
            "Nama\t\t: Made Bagas Pramudita\n\nIGN\t\t\t: BTR Zuxxy\n\nLahir\t\t: Mei 31 2003\n\nTim\t\t\t: BIGETRON Esport\n\nPosisi\t: IGL/Scout",
            "Nama\t\t: Nizar Lugatio Pratama\n\nIGN\t\t\t: EVOS Microboy\n\nLahir\t\t: Juni 19 2000\n\nTim\t\t\t: EVOS Esport\n\nPosisi\t: IGL/Support",
            "Nama\t\t: Eksa Rachman Jayanto\n\nIGN\t\t\t: EVOS RedFaceN\n\nLahir\t\t: April 3 2000\n\nTim\t\t\t: EVOS Esport\n\nPosisi\t: Scout",
            "Nama\t\t: Fiqri Syahputra\n\nIGN\t\t\t: AURA NoMercy\n\nLahir\t\t: Agustus 31 1999\n\nTim\t\t\t: AURA Esport\n\nPosisi\t: Starter",
            "Nama\t\t: Muhammad Raafi Solihin\n\nIGN\t\t\t: ONIC Cleon\n\nLahir\t\t: Januari 25 2000\n\nTim\t\t\t: ONIC Esport\n\nPosisi\t: Sniper",
            "Nama\t\t: Muhammad Redian Putrama\n\nIGN\t\t\t: RRQ Mildway\n\nLahir\t\t: Februari 8 2000\n\nTim\t\t\t: RRQ Esport\n\nPosisi\t: Assaulter"
    };
    public static int[] favorit = {
            R.drawable.whitelove,
            R.drawable.whitelove,
            R.drawable.whitelove,
            R.drawable.whitelove,
            R.drawable.whitelove,
            R.drawable.whitelove,
            R.drawable.whitelove,
            R.drawable.whitelove,
            R.drawable.whitelove,
            R.drawable.whitelove,
            R.drawable.whitelove,
            R.drawable.whitelove,
    };
    public static int[] playerImages = {
            R.drawable.aero_potato,
            R.drawable.aura_jayden,
            R.drawable.boom_voker,
            R.drawable.btr_liquid,
            R.drawable.btr_luxxy,
            R.drawable.btr_ryzen,
            R.drawable.btr_zuxxy,
            R.drawable.evos_microboy,
            R.drawable.evos_redfancen,
            R.drawable.aura_nomercy,
            R.drawable.onic_cleon,
            R.drawable.rrq_mildway
    };

    static ArrayList<Player> getListData(){
        ArrayList<Player> list = new ArrayList<>();
        for (int position = 0; position < playerNames.length; position++){
            Player player = new Player();
            player.setName(playerNames[position]);
            player.setDesc(playerDesc[position]);
            player.setDetail(playerDetails[position]);
            player.setFoto(playerImages[position]);
            player.setFavorit(favorit[position]);
            list.add(player);
        }
        return list;
    }
}
