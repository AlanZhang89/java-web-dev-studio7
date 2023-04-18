package org.launchcode.studio7;



public class DVD extends BaseDisc implements OpticalDisc {
    public DVD(String title, String author, int storageCapacity) {
        super(title, author, storageCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of " + Min_DVD_SPIN +"-" + MAX_DVD_SPIN+ " rpm.");
    }

    @Override
    public void readData() {
        System.out.println("Reading data from DVD...");
    }

    @Override
    public void writeData(String data) {
        System.out.println("Writing data '" + data + "' to DVD...");
    }
}


