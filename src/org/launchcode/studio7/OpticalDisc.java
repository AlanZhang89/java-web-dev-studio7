package org.launchcode.studio7;

public interface OpticalDisc {
    int Min_CD_SPIN = 200;
    int MAX_CD_SPIN = 500;
    int Min_DVD_SPIN = 570;
    int MAX_DVD_SPIN = 1600;
    void spinDisc();
    void readData();
    void writeData(String data);

}

