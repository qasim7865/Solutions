/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6.studentsActivity;

/**
 *
 * @author princ
 */
public class Laptop extends Computer {
    private int screenSize;
    private Battery battery;
    private FingerPrintScanner fingerPrintScnanner;
    private Cam webcam;

    public Laptop(int screenSize, Battery battery, FingerPrintScanner fingerPrintScnanner, Cam webcam, CPU cpu, RAM ram, HDD harddisk, MotherBoard motherboard, DataBus databus, int busSpeed) {
        super(cpu, ram, harddisk, motherboard, databus, busSpeed);
        this.screenSize = screenSize;
        this.battery = battery;
        this.fingerPrintScnanner = fingerPrintScnanner;
        this.webcam = webcam;
    }

    public Laptop(int screenSize, Battery battery, FingerPrintScanner fingerPrintScnanner, Cam webcam) {
        this.screenSize = screenSize;
        this.battery = battery;
        this.fingerPrintScnanner = fingerPrintScnanner;
        this.webcam = webcam;
    }

    public Cam getWebcam() {
        return webcam;
    }

    public void setWebcam(Cam webcam) {
        this.webcam = webcam;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public FingerPrintScanner getFingerPrintScnanner() {
        return fingerPrintScnanner;
    }

    public void setFingerPrintScnanner(FingerPrintScanner fingerPrintScnanner) {
        this.fingerPrintScnanner = fingerPrintScnanner;
    }

    @Override
    public String toString() {
        return "Laptop{" + "screenSize=" + screenSize + ", battery=" + battery + ", fingerPrintScnanner=" + fingerPrintScnanner + ", webcam=" + webcam + '}';
    }
    
}
