package ie.gmit.single;

public class StoreUser {
    private Store store = new Store();
    public boolean storeUser(User user){
        store.store(user);

        if(store.getUser(user.getName()) == user){
            return true;
        }
        else{
            return false;
        }
    }
}
