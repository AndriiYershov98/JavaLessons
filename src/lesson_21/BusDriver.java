package lesson_21;

public class BusDriver {
    private String licenseNum;

    private Autobus autobus;

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public BusDriver(String licenseNum) {
        this.licenseNum = licenseNum;
    }

   public Autobus getAutobus() {
        return autobus;
   }

}
