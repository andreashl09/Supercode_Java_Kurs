import java.util.Arrays;

public class Laptop {

    // Laptop
    // -----------
    // String hersteller;
    // float cpuHz; // 3.2f ==> 3.2 GHz
    // byte ram; // zb 16 => 16GB
    // int diskSpace; // 512 => 512 GB
    // float monitorSize; // 15.6 ==> 15.6"
    // float weight; // 1.48 ==> 1.48 kg

    // Aufgabe:
    // implementiere die Laptop klasse mit einem konstruktor der alle werde
    // akzeptiert
    // implementiere getter und setter (attr sind private)
    // baue checks ein beim setten (selber überlegen)
    // hersteller nur "Apple", "Samsung", "Toshiba", "Acer", "HP", "Dell"
    // implementiere eine toString methode
    // implementiere eine printInfo methode
    // { "Apple", "Samsung", "Toshiba", "Acer", "HP", "Dell" };

    private String hersteller;
    private float cpuHz;
    private byte ram;
    private int diskSpace;
    private float displaySize;
    private float weigth;

    public Laptop(int i, float cpuHz, int j, int diskSpace, float displaySize, float weigth) {

    }

    public Laptop() {

    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public float getCpuHz() {
        return cpuHz;
    }

    public void setCpuHz(float cpuHz) {
        this.cpuHz = cpuHz;
    }

    public byte getRam() {
        return ram;
    }

    public void setRam(byte ram) {
        this.ram = (byte) ram;
    }

    public int getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(int diskSpace) {
        this.diskSpace = diskSpace;
    }

    public float getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(float displaySize) {
        this.displaySize = displaySize;
    }

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return "Laptop [hersteller=" + Arrays.toString(hersteller) + ", cpuHz=" + cpuHz + ", ram=" + ram
                + ", diskSpace=" + diskSpace + ", displaySize=" + displaySize + ", weigth=" + weigth + "]";
    }

    public void printInfo() {
        System.out.println(this.toString());
    }
}
