package gr.codehub.mycommerce.Model;

public class Main {
    public static void main (String[] args){
        Product p=new Product("potatoes",1.2,3,Category.FOOD) ;
        System.out.println(p.getName() +" costs: "+p.getPrice());

    }
}
