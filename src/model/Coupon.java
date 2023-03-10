package model;

public class Coupon {

    private Boolean valid;
    private Double percentage;
    private String code;

    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        code = code;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }


    public Coupon(String code, Double percentage, Boolean valid){
        this.code=code;
        this.percentage=percentage;
        this.valid=valid;
    }
    public double reducere(double price){
        double redus;
        if (valid){
            redus=price-(price*percentage/100);
            return redus;
        }
        else return  price;
    }
}
