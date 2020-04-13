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
public class Tablet extends Laptop{
    private Modem gsmModem;
    private CardReader cardReader;
    private IrisScanner irisScanner;

    public Tablet(Modem gsmModem, CardReader cardReader, IrisScanner irisScanner, int screenSize, Battery battery, FingerPrintScanner fingerPrintScnanner, Cam webcam, CPU cpu, RAM ram, HDD harddisk, MotherBoard motherboard, DataBus databus, int busSpeed) {
        super(screenSize, battery, fingerPrintScnanner, webcam, cpu, ram, harddisk, motherboard, databus, busSpeed);
        this.gsmModem = gsmModem;
        this.cardReader = cardReader;
        this.irisScanner = irisScanner;
    }

    public Tablet(Modem gsmModem, CardReader cardReader, IrisScanner irisScanner, int screenSize, Battery battery, FingerPrintScanner fingerPrintScnanner, Cam webcam) {
        super(screenSize, battery, fingerPrintScnanner, webcam);
        this.gsmModem = gsmModem;
        this.cardReader = cardReader;
        this.irisScanner = irisScanner;
    }

    public IrisScanner getIrisScanner() {
        return irisScanner;
    }

    public void setIrisScanner(IrisScanner irisScanner) {
        this.irisScanner = irisScanner;
    }

    public Modem getGsmModem() {
        return gsmModem;
    }

    public void setGsmModem(Modem gsmModem) {
        this.gsmModem = gsmModem;
    }

    public CardReader getCardReader() {
        return cardReader;
    }

    public void setCardReader(CardReader cardReader) {
        this.cardReader = cardReader;
    }

    @Override
    public String toString() {
        return "Tablet{" + "gsmModem=" + gsmModem + ", cardReader=" + cardReader + ", irisScanner=" + irisScanner + '}';
    }
    
}
