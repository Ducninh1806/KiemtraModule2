

        import java.util.ArrayList;
public class ProductManagement {
    ArrayList<Product> listProducts = new ArrayList<Product>();
    public void disPlay() {
        for (Product pr: listProducts) {
            System.out.println(pr);
        }
    }
    public void addProduct(Product product) {
        listProducts.add(product);
    }
    public void editProduct(int index,Product product) {
        if (index >= listProducts.size() ) throw new IndexOutOfBoundsException("Index not valid");
        listProducts.set(index,product) ;
    }
    public void deleteProduct(int index) {
        if (index >= listProducts.size() ) throw new IndexOutOfBoundsException("Index not valid");
        listProducts.remove(index);
    }
    public void searchProduct(String name) {
        boolean check = false;
        for (Product pr: listProducts) {
            if (pr.getName() == name) {
                check = true;
            }else {
                check = false;
            }
        }
        if (check) {
            System.out.println(name + " have in list");
        }else {
            System.out.println(name + " have not in list");
        }
    }
}