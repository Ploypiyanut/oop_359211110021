package ooplab9;

public class Address {
    private String homenumber;
    private  String privince;
    private  String postcode;

    public Address(String homenumber, String privince, String postcode) {
        this.homenumber = homenumber;
        this.privince = privince;
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "homenumber='" + homenumber + '\'' +
                ", privince='" + privince + '\'' +
                ", postcode=" + postcode + '\'' +
                '}';
    }

    public String gethomenumber() {
        return homenumber;
    }

    public void sethomenumber(String homenumber) {
        this.homenumber = homenumber;
    }

    public String getprivince() {
        return privince;
    }

    public void setprivince(String privince) {
        this.privince = privince;
    }
    public String getpostcode() {
        return postcode;
    }

    public void setpostcode(String postcode) {
        this.postcode = postcode;
    }

}
