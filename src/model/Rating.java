package model;

public class Rating {

    private String comment;
    private Integer stars;
    private Customer customer;
//    private final Product product;



    public String getComment() {
        return comment;
    }
    public Integer getStars() {
        return stars;
    }
//    public Product getProduct() { return product; }
    public Customer getCustomer() {
        return customer;
    }




    public void setComment(String comment) {
        this.comment = comment;
    }
    public void setStars(Integer stars) {
        this.stars = stars;
    }



    public Rating(Integer stars, String comment, Customer customer){
        this.customer=customer;
        this.stars=stars;
        this.comment=comment;
    }


    public Rating(){
        this.customer=null;
        this.stars=0;
        this.comment="Foarte fain";
    }
    @Override
    public String toString(){
        return "customer="+getCustomer().getFirstName()+'\n'+"stars="+getStars()+'\n'+"comment="+getComment()+'\n';
    }
}
