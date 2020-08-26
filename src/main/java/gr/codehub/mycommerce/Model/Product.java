package gr.codehub.mycommerce.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*I use lombok plugin for auto-genererated of setters getters and constructors*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Product {
    private  String name;
    private double price;
    private int quantity;
    private  Category category;

}
