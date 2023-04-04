package Business;

import model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;


public class Store {
    private final ArrayList<Product> products;
    private final ArrayList<Customer> customers;
    private final ArrayList<Admin> admins;
    private final ArrayList<Category> categories;

    private final ArrayList<Coupon> coupons;

    private final ArrayList<Rating>  ratings;
    private final ArrayList<Shipping> shippings;
    private final ArrayList<Order> orders;
        public Store() {
        products = new ArrayList<>();
        customers = new ArrayList<>();
        admins = new ArrayList<>();
        categories = new ArrayList<>();
        coupons = new ArrayList<>();
        ratings = new ArrayList<>();
        shippings = new ArrayList<>();
        orders = new ArrayList<>();
    }


    public void init(){
           Category c1=new Category(2,"Footwear","Terrific");
           Category c2=new Category(1,"Clothing","Awesome");
        categories.add(c1);
        categories.add(c2);
        Product p1=new Product(1,"shirt","frumos",1.0,true, c1);
        products.add(p1);
        Admin a1=new Admin(1,"admin1","123456","admin1@yahoo,com","Denisa","Bucur","admin", "available");
        admins.add(a1);
        Customer customer1=new Customer(1,"customer1","123456","customer1@yahoo.com", "cutomer1","customer1","072546548","Str Academiei",products);
        customers.add(customer1);
        Shipping shipping1=new Shipping(1,"Focsani","Romania","Strada Academiei","000000",new Date());
        shippings.add(shipping1);
        Order order1= new Order(1,"card",new Date(),shipping1);
        orders.add(order1);
        Coupon coupon1=new Coupon("012345",20.0, true);
        coupons.add(coupon1);
        Rating rating1 = new Rating(10,"Super",customer1,p1);
        ratings.add(rating1);


    }


    public void addCategory(){
            Scanner reader = new Scanner(System.in);
            Integer idCateg= Integer.parseInt(reader.nextLine());
            System.out.println("Dati numele categoriei");
            String name=reader.nextLine();
            System.out.println("Dati descrierea categoriei");
            String description=reader.nextLine();
            Category categorie_noua= new Category(idCateg,name,description);
            categories.add(categorie_noua);

    }
    public void displayCategory(){
            for(Category category:categories){
                System.out.println(category);
                System.out.println();
            }
    }
    //    public void removeCategory(Category category) {
//        categories.remove(category);
//    }

    public void addAdmin(){
            Scanner reader=new Scanner(System.in);
            System.out.println();
        Integer idUser=Integer.parseInt("Dati id-ul adminului:");
        System.out.println("Dati username-ul adminului:");
        String username=reader.nextLine();
        System.out.println("Dati parola adminului:");
        String password=reader.nextLine();
        System.out.println("Dati emailul adminului:");
        String email=reader.nextLine();
        System.out.println("Dati prenumele adminului:");
        String firstName=reader.nextLine();
        System.out.println("Dati numele de familie al adminului:");
        String lastName=reader.nextLine();
        System.out.println("Dati rolul adminului:");
        String role=reader.nextLine();
        System.out.println("Dati statusul adminului:");
        String status=reader.nextLine();
        Admin admin_nou= new Admin(idUser,username,password,email,firstName,lastName,role,status);
        admins.add(admin_nou);
    }
    public void displayAdmin(){
        for(Admin admin:admins){
            System.out.println(admin);
            System.out.println();
        }
    }

    public void addCoupon(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Dati codul cuponului:");
        String code=reader.nextLine();
        System.out.println("Este valid cuponul?Selectati:'true' sau 'false'");
        Boolean valid= Boolean.valueOf(reader.nextLine());
        System.out.println("Dati procentul de reducere al cuponului");
        Double percentage= Double.valueOf(reader.nextLine());

        Coupon cupon_nou= new Coupon(code,percentage,valid);
        coupons.add(cupon_nou);

    }
    public void displayCoupon(){
        for(Coupon coupon:coupons){
            System.out.println(coupon);
            System.out.println();
        }
    }

    public void addShipping(){
        Scanner reader=new Scanner(System.in);
        System.out.println();

        Integer idShipping=Integer.parseInt("Dati id-ul shippingului:");
        System.out.println("Dati orasul in care se doreste livrarea:");
        String city=reader.nextLine();
        System.out.println("Dati tara in care se doreste livrarea:");
        String country=reader.nextLine();
        System.out.println("Dati adresa locuintei:");
        String address=reader.nextLine();
        System.out.println("Dati adresa postala:");
        String postalCode=reader.nextLine();
        System.out.println("Dati dataLivrare:");
        String data1=reader.nextLine();
        Date dataLivrare = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dataLivrare = dateFormat.parse(data1);
        }catch(Exception e){
            System.out.println("Ati oferit o data gresita");
        }

        Shipping shipping_nou=new Shipping(idShipping,city,country,address,postalCode,dataLivrare);
        shippings.add(shipping_nou);

    }

    public void displayShipping(){
        for(Shipping shipping:shippings){
            System.out.println(shipping);
            System.out.println();
        }
    }

    public void addCustomer(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Dati numarul de telefon:");
        String phone=reader.nextLine();
        System.out.println("Dati adresa");
        String address=reader.nextLine();

        Customer client_nou= new Customer(phone,address,new ArrayList<Product>());
        customers.add(client_nou);

    }

    public void displayCustomer(){
        for(Customer customer:customers){
            System.out.println(customer);
            System.out.println();
        }
    }






//
//    public void addProduct(Product product) {
//        products.add(product);
//    }
//
//    public void removeProduct(Product product) {
//        products.remove(product);
//    }
//
//    public void addCustomer(Customer customer) {
//        customers.add(customer);
//    }
//
//
//
//    public void removeCustomer(Customer customer) {
//        customers.remove(customer);
//    }
//    public void addAdmin(Admin admin){admins.add(admin);}
//    public void removeAdmin(Admin admin){admins.remove(admin);}



/*
    public ArrayList<Product> getProductsByCategory(String categoryName) {
        ArrayList<Product> productsByCategory = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equals(categoryName)) {
                productsByCategory.add(product);
            }
        }
        return productsByCategory;
    }


    public void displayAllProducts() {
        for (Product product : products) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }
    }

    public void displayAllCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer.getUserName() + " - " + customer.getEmail());
        }
    }

    public void displayAllAdmins() {
        for (Admin admin : admins) {
            System.out.println(admin.getUserName() + " - " + admin.getEmail());
        }
    }*/


}
