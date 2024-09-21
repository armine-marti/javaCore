package homework.onlineShop.storages;

import homework.onlineShop.model.Order;

public class OrderStorage {

    private Order[] orders = new Order[30];
    private int size;

    public void add(Order order) {
        if (orders.length == size) {
            extendStorage();
        }
        orders[size++] = order;
    }

    private void extendStorage() {
        Order[] tmp = new Order[size + 10];
        System.arraycopy(orders, 0, tmp, 0, size);
        orders = tmp;
    }

    public Order getOrderById(String id){
        for(int i = 0; i<size; i++){
            if (orders[i].getOrId().equals(id)){
                return orders[i];
            }
        }
        return null;
    }

    public void print(){
        for(int i = 0; i<size; i++){
            System.out.println(orders[i]);
        }
    }

    public void printForUser(Order order, String productName){
        for(int i = 0; i<size; i++){
            System.out.println(orders[i].getOrId() + " - " + productName +  " Quantity: " +orders[i].getOrQty() + " Price:$  " + orders[i].getOrPrice() + "  Status: " + orders[i].getOrderStatus());
        }
    }

    public void printOrdersById(String userId){
        for(int i = 0; i<size; i++){
            if(orders[i].getUserId().equals(userId)){
                System.out.println(orders[i]);
            }
        }
    }
    public void deleteOrder(String id) {
        for (int i = 0; i < size; i++) {
            if (orders[i].getOrId().equals(id)) {
                int indexToDelete = i;
                for (i = indexToDelete + 1; i < size; i++) {
                    orders[i - 1] = orders[i];
                }
                size--;
            }
        }
    }



}
