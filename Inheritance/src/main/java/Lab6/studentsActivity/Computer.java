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
public class Computer {
    private CPU cpu;
    private RAM ram;
    private HDD harddisk;
    private MotherBoard motherboard;
    private DataBus databus;
    private int busSpeed;

    public Computer(CPU cpu, RAM ram, HDD harddisk, MotherBoard motherboard, DataBus databus, int busSpeed) {
        this.cpu = cpu;
        this.ram = ram;
        this.harddisk = harddisk;
        this.motherboard = motherboard;
        this.databus = databus;
        this.busSpeed = busSpeed;
    }

    public Computer() {
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public HDD getHarddisk() {
        return harddisk;
    }

    public void setHarddisk(HDD harddisk) {
        this.harddisk = harddisk;
    }

    public MotherBoard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(MotherBoard motherboard) {
        this.motherboard = motherboard;
    }

    public DataBus getDatabus() {
        return databus;
    }

    public void setDatabus(DataBus databus) {
        this.databus = databus;
    }

    public int getBusSpeed() {
        return busSpeed;
    }

    public void setBusSpeed(int busSpeed) {
        this.busSpeed = busSpeed;
    }

    @Override
    public String toString() {
        return "Computer{" + "cpu=" + cpu + ", ram=" + ram + ", harddisk=" + harddisk + ", motherboard=" + motherboard + ", databus=" + databus + ", busSpeed=" + busSpeed + '}';
    }
    
    
}
