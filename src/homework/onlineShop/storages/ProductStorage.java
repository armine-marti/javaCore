package homework.onlineShop.storages;

import homework.onlineShop.model.Product;

public class ProductStorage {

    private Product [] products = new Product[30];
    private int size;

    public void add(Product product) {
        if (products.length == size) {
            extendStorage();
        }
        products[size++] = product;
    }

    private void extendStorage() {
        Product[] tmp = new Product[size + 10];
        System.arraycopy(products, 0, tmp, 0, size);
        products = tmp;
    }

    public Product getProductById(String id){
        for(int i = 0; i<size; i++){
            if (products[i].getProductID().equals(id)){
                return products[i];
            }
        }
        return null;
    }

    public void print(){
        for(int i = 0; i<size; i++){
            System.out.println(products[i]);
        }
    }

    public void printForUsersOnly(){
        for(int i = 0; i<size; i++){
            System.out.println(products[i].getProductID() + " -  "+ products[i].getProductName()+ " Price: $ "+ products[i].getPrice() + " -  "+products[i].getDescription());
        }
    }



    public void deleteProduct(String id) {
        for (int i = 0; i < size; i++) {
            if (products[i].getProductID().equals(id)) {
                int indexToDelete = i;
                for (i = indexToDelete + 1; i < size; i++) {
                    products[i - 1] = products[i];
                }
                size--;
            }
        }
    }

}
