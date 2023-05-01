package org.launchcode.studio7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // TODO: Declare and initialize a CD and a DVD object.

        ArrayList<String> musicPlaylist = new ArrayList<String>();
        musicPlaylist.add(0,"You Say - Piano/VocalLauren Daigle");
        musicPlaylist.add(1,"Nothing's Gonna HappenThe Staves");
        musicPlaylist.add(2,"Living ProofThe War On Drugs");
        musicPlaylist.add(3,"SaplingFoy Vance");
        CD myCd = new CD("Tim Janis Relaxation", "Tim Janis ", 350,musicPlaylist);
        DVD myDvd = new DVD("SHAZAM! FURY OF THE GODS", "David F. Sandberg", 2400);
        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCd.printInfo();
        myCd.spinDisc();
        myCd.readData();
        myCd.printMusicList();
        myCd.writeData("Relaxation Music");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        myDvd.printInfo();
        myDvd.spinDisc();
        myDvd.readData();
        myDvd.writeData("Fun Action Movie");
    }
}