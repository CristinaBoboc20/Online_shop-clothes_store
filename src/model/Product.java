
package model;


import java.util.ArrayList;
import java.util.List;

public class Product {


    private Integer id;
    private String name;
    private String description;
    private Double price;
    private Boolean disponibility;
    private Integer quantity;
    private List<Rating> ratings;
    private Category category;





    public void setQuantity(Integer quantity){this.quantity=quantity;}
    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setDisponibility(Boolean disponibility) {
        this.disponibility = disponibility;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
    public void setCategory(Category category) {
        this.category = category;
    }







    public Boolean getDisponibility() {
        return disponibility;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public Integer getId() {
        return id;
    }
    public Integer getQuantity(){return quantity;}
    public Double getPrice() {
        return price;
    }
    public List<Rating> getRatings() {
        return ratings;
    }
    public Category getCategory() {
        return category;
    }





    public void addRatingProduct(Rating rating){
        this.ratings.add(rating);
    }



    public Product(Integer id, String name, String description, Double price, Boolean disponibility, Integer quantity, Category category,ArrayList<Rating>ratings){
        this.id=id;
        this.name=name;
        this.description=description;
        this.disponibility=disponibility;
        this.price=price;
        this.ratings=ratings;
        this.category = category;
        this.quantity=quantity;
    }
    public Product(){
        this.id=-1;
        this.name="anonim";
        this.description="frumos";
        this.price = 1.0;
        this.disponibility=false;
        this.category=null;
        this.quantity=0;
        this.ratings=new ArrayList<>();


    }


    @Override
    public String toString(){
        return  "id="+getId()+'\n'+"name="+getName()+'\n'+"description="+getDescription()+'\n'+"disponibility="+getDisponibility()+'\n'+"price="+getPrice()+'\n'+"quantity"+getQuantity()+'\n'+"ratings="+getRatings()+'\n'+"category="+getCategory()+'\n';
    }

    @Override
    public boolean equals (Object ob){

        if( ob== this)
            return true;
        if(ob==null)
            return false;
        if(ob instanceof Product){
            Product other = (Product) ob;
            return other.getId().equals(getName()) &&
                    other.getName().equals(getDescription()) &&
                    other.getDescription().equals(getCategory()) &&
                    other.getCategory().equals(getPrice()) &&
                    other.getPrice().equals(getDisponibility()) &&
                    other.getDisponibility().equals(getDisponibility());

        }
        return false;
    }


}
