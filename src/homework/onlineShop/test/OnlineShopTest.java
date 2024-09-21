package homework.onlineShop.test;

import homework.onlineShop.model.*;
import homework.onlineShop.storages.OrderStorage;
import homework.onlineShop.storages.ProductStorage;
import homework.onlineShop.storages.UserStorage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class OnlineShopTest implements OnlineShopInterface, OnlineShopAdminInt, OnlineShopUserInt {

    private static Scanner scanner = new Scanner(System.in);
    private static UserStorage userStorage = new UserStorage();
    private static ProductStorage productStorage = new ProductStorage();
    private static OrderStorage orderStorage = new OrderStorage();
    private static SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-yyyy HH:mm");
    private static String loggedInUserId = null;

    public static String getLoggedInUserId() {
        return loggedInUserId;
    }

    public static void setLoggedInUserId(String loggedInUserId) {
        OnlineShopTest.loggedInUserId = loggedInUserId;
    }

    public static void main(String[] args) {

        User admin1 = new User("A1", "Gor", "Gor11@gmail.com", "aW233444", UserType.ADMIN);
        userStorage.add(admin1);

        User user1 = new User("b001", "Emma", "EmmaMan@gmail.com", "passcode359", UserType.USER);
        userStorage.add(user1);

        User user2 = new User("b002", "Serj", "MartirosyanS@outlook.com", "2novthirt1", UserType.USER);
        userStorage.add(user2);


        Product product1 = new Product("p001e", "Samsung S23", "MobilePhone, storage 128GB, 8GB of RAM", 600, 500, ProductType.ELECTRONICS);
        productStorage.add(product1);
        Product product2 = new Product("p002e", "Dell Inspiron15 ", "Laptop, RAM 16GB,1 TB, colour grey", 550, 350, ProductType.ELECTRONICS);
        productStorage.add(product2);

        Product product3 = new Product("p001c", "NIKE Jacket", "Male jacket, Material 100% Polyester, colour black", 47.5, 1000, ProductType.CLOTHING);
        productStorage.add(product3);

        Product product4 = new Product("p001b", "The Little Prince by Antoine de Saint-Exupéry", "8+, English language, Hard cover", 11, 30, ProductType.BOOKS);
        productStorage.add(product4);
        Product product5 = new Product("p002b", "Master The Armenian Alphabet, A Handwriting Practice Workbook", "Armenian language, Hard cover", 15.5, 20, ProductType.BOOKS);
        productStorage.add(product5);



        System.out.println("Our products: ");
        productStorage.print();

        boolean isRun = true;
        while (isRun) {
            OnlineShopInterface.printCommands();
            String command = scanner.nextLine();
            if (command.equals(OnlineShopInterface.REGISTER)) {
                registerUser();
            } else if (command.equals(OnlineShopInterface.LOGIN)) {
                UserType userType = userVerification();
                if (userType == UserType.USER) {
                    boolean userIsRun = true;
                    while (userIsRun) {
                        OnlineShopUserInt.printUserCommands();

                        String userCommand = scanner.nextLine();

                        switch (userCommand) {

                            case LOG_OUT:
                                userIsRun = false;
                                System.out.println("YOU HAVE BEEN LOGGED OUT");
                                break;
                            case PRINT_ALL_PRODUCTS:
                                System.out.println("Here are all our product: ");
                                productStorage.printForUsersOnly();
                                break;
                            case BUY_PRODUCTS:
                                productStorage.printForUsersOnly();
                                buyProductById();
                                break;
                            case PRINT_MY_ORDERS:
                                printMyOrders();
                                break;
                            case CANCEL_ORDER:
                                cancelOrderById();
                                break;
                            default:
                                System.out.println("Wrong command");
                                break;
                        }


                        // here i need to put swtich case
                    }
                } else if (userType == userType.ADMIN) {
                    boolean adminIsRun = true;
                    while (adminIsRun) {
                        OnlineShopAdminInt.printAdminCommands();
                        String adminCommand = scanner.nextLine();

                        switch (adminCommand) {

                            case LOG_OUT:
                                adminIsRun = false;
                                System.out.println("YOU HAVE BEEN LOGGED OUT");
                                OnlineShopInterface.printCommands();
                                break;
                            case ADD_PRODUCT:
                                addProduct();
                                break;
                            case REMOVE_PRODUCT_BY_ID:
                                removeProductById();
                                break;
                            case PRINT_PRODUCTS:
                                //to make print by product type if have time
                                System.out.println("Here are all product: ");
                                productStorage.print();
                                break;
                            case PRINT_USERS:
                                System.out.println("Here are all registered users");
                                userStorage.printByType(UserType.USER);
                                break;
                            case PRINT_ORDERS:
                                System.out.println("Here are all registered orders");
                                orderStorage.print();
                                break;
                            case CHANGE_ORDER_STATUS:
                                changeOrderStatus();
                                break;
                            default:
                                System.out.println("Wrong command");
                        }
                        //here i need to put scanner and swtich case
                    }

                }
                //method for verification
                //if after verification its admin print admin interface
                //if after verification its user, print user interface

            } else {
                System.out.println("Wrong input please try again!!");
            }
        }

    }

    //user - command 4
    private static void cancelOrderById() {
        System.out.println("Please input id of order you want to cancel");
        String cancelOrder = scanner.nextLine();
        Order cancelingOrder = orderStorage.getOrderById(cancelOrder);
        while (cancelingOrder == null) {
            System.out.println("Invalid order ID, please try again");
            cancelOrder = scanner.nextLine();
            cancelingOrder = orderStorage.getOrderById(cancelOrder);
        }
        orderStorage.deleteOrder(cancelOrder);
        System.out.println("Your order has been successfully canceled!");
        orderStorage.printOrdersById(getLoggedInUserId());
    }

//user - command 3
    private static void printMyOrders() {
        System.out.println("Here are all of your orders!");
        String userIdForOrder = getLoggedInUserId();
        orderStorage.printOrdersById(userIdForOrder);

    }
//admin - command 6
    private static void changeOrderStatus() {
        System.out.println("Please input order id you want to update");
        String orderId = scanner.nextLine();

        Order order = orderStorage.getOrderById(orderId);
        if (order != null) {
            System.out.println(order);
            System.out.println("Please input order's new status");
            try{
            String newStatusStr = scanner.nextLine().toUpperCase();
            OrderStatus orderStatus = OrderStatus.valueOf(newStatusStr);
                order.setOrderStatus(orderStatus);
                System.out.println("Order status has been updated!");
                System.out.println(order);
        } catch (IllegalArgumentException e) {
            System.out.println("Incorrect input, please try again");
            return;
        }
        }else System.out.println("Order does not exist");
    }

    //admin -  command 2
    private static void removeProductById() {
        System.out.println("Please input the id of product you want to delete");
        String deleteProductId = scanner.nextLine();

        Product product = productStorage.getProductById(deleteProductId);
        if (product != null) {
            productStorage.deleteProduct(deleteProductId);
            System.out.println("Product has been successfully deleted");
            productStorage.print();
        }else{
            System.out.println("Product with that ID does not exists!");
        }
    }
//admin - command 1
    private static void addProduct() {
        System.out.println("Please input product ID");
        String pId = scanner.nextLine();

        Product product = productStorage.getProductById(pId);
        if (product == null) {
            product = new Product();
            product.setProductID(pId);
            System.out.println("Please input product name: ");
            String pName = scanner.nextLine();
            product.setProductName(pName);
            System.out.println("Please input product description");
            String description = scanner.nextLine();
            product.setDescription(description);

            System.out.println("Please input product price per one unit");
           try{
               String priceStr = scanner.nextLine();
               int price = Integer.parseInt(priceStr);
               product.setPrice(price);
               System.out.println("Please input product quantity in the stock");
               String productQuantity = scanner.nextLine();
               int productQty = Integer.parseInt(productQuantity);
               product.setStockQty(productQty);
           }catch (NumberFormatException e) {
               System.out.println("Invalid input. Please enter a valid integer number.");
               return;
           }
            System.out.println("choose product type:");

            ProductType[] values = ProductType.values();
            for (ProductType value : values) {
                System.out.println(value);
            }
            ProductType pType = null;
            try {
                String productTypeStr = scanner.nextLine().toUpperCase();
                pType = ProductType.valueOf(productTypeStr);
                product.setProductType(pType);
            } catch (IllegalArgumentException e) {
                System.out.println("Incorrect product type, please try again");
                return;
            }
            productStorage.add(product);
            System.out.println("Product was successfully added");
            System.out.println(product);
        }else {
            System.out.println("Product with same ID already exists!");
        }
    }
//user  - command 2
    private static void buyProductById() {
        System.out.println("Please input product's id");
        String productId = scanner.nextLine();

        Product product = productStorage.getProductById(productId);
        if (product != null) {
            Order order = new Order();
            order.setProduct(product);

            System.out.println("Please input product's quantity");
            try {
                String productQtyStr = scanner.nextLine();
                int productQty = Integer.parseInt(productQtyStr);
                double orderPrice = product.getPrice() * productQty;
                order.setOrPrice(orderPrice);
                order.setOrQty(productQty);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer number.");
                return;
            }


            System.out.println("Please choose the way of your payment:");
            PaymentMethod[] values = PaymentMethod.values();
            for (PaymentMethod value : values) {
                System.out.println(value);
            }
            PaymentMethod payMethod = null;
            try {
                String payMethodStr = scanner.nextLine().toUpperCase();
                payMethod = PaymentMethod.valueOf(payMethodStr);
                order.setPaymentMethod(payMethod);
            } catch (IllegalArgumentException e) {
                System.out.println("Incorrect input, please try again");
                return;
            }

            System.out.println("Please check order details: ");
            System.out.println("Product = " + product.getProductName() + "  Quantity :" +order.getOrQty() + "   FINAL PRICE = " + order.getOrPrice());
            System.out.println("Please press to enter if you want to confirm the order");

//confirm and save order time, add user id to order too

            String orderTime = scanner.nextLine();
            if (orderTime.isBlank()) {

                SimpleDateFormat orderDate = new SimpleDateFormat("dd-MM-yyyy HH:mm");
                Date savedOrderDate = new Date();
                String newDate = orderDate.format(savedOrderDate);
                order.setDate(savedOrderDate);

                //get user id for order
                String userId = OnlineShopTest.getLoggedInUserId();
                order.setUserId(userId);

                //create order ID
                Random random = new Random();
                int code = 10000 + random.nextInt(90000);
                String codeStr = String.valueOf(code);
                order.setOrId(codeStr);

                order.setOrderStatus(OrderStatus.NEW);
                orderStorage.add(order);
                System.out.println("Your order is confirmed!");
                orderStorage.printForUser(order, product.getProductName());
            } else {
                System.out.println("Wrong input! Please input only Enter!");

            }
        } else {
            System.out.println("Incorrect ID of the product");
        }
    }
//method to get verified , main Interface
    private static  UserType userVerification() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your email");
        String email = scanner.nextLine();
        System.out.println("Please input your password");
        String password = scanner.nextLine();
        System.out.println("Please input your user type - USER or ADMIN");
        String userTypeStr = scanner.nextLine().toUpperCase();
        UserType userType = UserType.valueOf(userTypeStr);
        boolean checking = userStorage.verifyUser(email, password, userType);
        if (checking) {
            //save user id to proceed to user menu
            String currentUserId = userStorage.getUserIdByEmail(email);
            OnlineShopTest.setLoggedInUserId(currentUserId);
            System.out.println("You have been successfully logged in!");
            return userType;
        } else {
            System.out.println("Incorrect date, please try again");
        }
        return null;
    }

// registration main Interface
    private static void registerUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your id: ");
        String id = scanner.nextLine();

        User userByID = userStorage.getUserById(id);
        if (userByID == null) {
            System.out.println("Please input your name: ");
            String name = scanner.nextLine();
            System.out.println("Please input your email:");
            String email = scanner.nextLine();
            while (!email.contains("@")) {
                System.out.println("Invalid email address. Email must contain '@'.");
                System.out.println("please input email again:");
                email = scanner.nextLine();
            }
            User newUser = new User();
            newUser.setId(id);
            newUser.setName(name);
            newUser.setEmail(email);
            System.out.println("Please input your password, it should contain at least one number");

            String regex = ".*\\d.*";
            String password = scanner.nextLine();
            while (!password.matches(regex) || password.length() < 6) {
                System.out.println("Invalid password. It must contain a number and has 6 characters");
                System.out.println("please input password again");
                password = scanner.nextLine();
            }
            newUser.setPassword(password);

            System.out.println("Please input if you are USER or ADMIN");
            UserType userType = null;
            try {
                String userTypeStr = scanner.nextLine().toUpperCase();
                userType = UserType.valueOf(userTypeStr);
            } catch (IllegalArgumentException e) {
                System.out.println("Incorrect user type, please try again");
            }
            newUser.setType(userType);
            userStorage.add(newUser);
            System.out.println("You have been successfully registered!");
            System.out.println(newUser);


        } else System.out.println("User with " + id + " id already exists! Try again");
    }

} //class ends



