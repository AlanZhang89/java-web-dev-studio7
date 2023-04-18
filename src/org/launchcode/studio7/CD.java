package org.launchcode.studio7;


import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc {
    private ArrayList<String> musicPlayList;
    public CD(String title, String author, int storageCapacity,ArrayList<String> musicPlayList) {
        super(title, author, storageCapacity);
        this.musicPlayList = musicPlayList;
    }
    public void printMusicList(){
        System.out.println("-----------");
        System.out.println("Music List");
        System.out.println("-----------");
        int listIndex = 0;
        for (String music : this.musicPlayList){
            listIndex++;
            System.out.println(listIndex + " : " + music);
        }
    }
    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of " + Min_CD_SPIN +"-" + MAX_CD_SPIN+ " rpm.");
    }

    @Override
    public void readData() {
        System.out.println("Reading data from CD...");
    }

    @Override
    public void writeData(String data) {
        System.out.println("Writing data '" + data + "' to CD...");
    }
}

