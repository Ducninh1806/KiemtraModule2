import java.util.ArrayList;

public class ProductTest {
    public static void main(String[] args) {
        ProductManagement list = new ProductManagement();
        Product pr1 = new Product(1,"banana",13,"blue");
        Product pr2 = new Product(2,"phone",50,"black");
        Product pr3 = new Product(3,"apple",15,"red");
        list.addProduct(pr1);
        list.addProduct(pr2);
        list.addProduct(pr3);
        list.disPlay();
    }


}
