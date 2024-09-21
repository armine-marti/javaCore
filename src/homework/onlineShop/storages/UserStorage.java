package homework.onlineShop.storages;

import homework.onlineShop.model.User;
import homework.onlineShop.model.UserType;

public class UserStorage {

    private User[] users = new User[20];
    private int size;
    private String currentUserId;


    public void add(User user) {
        if (users.length == size) {
            extendStorage();
        }
        users[size++] = user;
    }

    private void extendStorage() {
        User[] tmp = new User[size + 10];
        System.arraycopy(users, 0, tmp, 0, size);
        users = tmp;
    }

    public User getUserById(String id) {
        for (int i = 0; i < size; i++) {
            if (users[i].getId().equals(id)) {
                return users[i];
            }
        }
        return null;
    }

    public User getUserByType(UserType userType) {
        for (int i = 0; i < size; i++) {
            if (users[i].getType().equals(userType)) {
                return users[i];
            }
        }
        return null;
    }
public String getUserIdByEmail(String email){
    for (int i = 0; i < size; i++) {
        if (users[i].getEmail().equals(email)) {
            return users[i].getId();
        }
    }
    return null;

}

    public void printByType(UserType userType) {
        for (int i = 0; i < size; i++) {
            if (users[i].getType().equals(userType)) {
                System.out.println(users[i]);
            }
        }
    }

    public boolean verifyUser(String email, String password, UserType type){
        for(int i = 0; i<size; i++){
            if (users[i].getEmail().equals(email) &
                    users[i].getPassword().equals(password) &
                    users[i].getType().equals(type)){
                return true;
            }
        }return false;
    }
}
