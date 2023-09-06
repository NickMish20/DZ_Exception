import Exceptions.EmptyStoreException;
import Exceptions.ProductNotFoundException;
import viewer.UserGUI;

public class App {

    public static void main(String[] args) throws ProductNotFoundException, EmptyStoreException {
        UserGUI gui = new UserGUI();
        gui.show();
    }


}