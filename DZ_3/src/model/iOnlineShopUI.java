package model;

import Exceptions.EmptyStoreException;
import Exceptions.ProductNotFoundException;
import Exceptions.WrongNameException;
import Exceptions.ZeroPriceException;

public interface iOnlineShopUI {

    void addProduct(String product, double price) throws WrongNameException, ZeroPriceException;

    void deleteProduct(String name) throws ProductNotFoundException, WrongNameException, EmptyStoreException;

    String getProduct(String name) throws ProductNotFoundException, WrongNameException, EmptyStoreException;

    void getAllProducts() throws EmptyStoreException;

}
