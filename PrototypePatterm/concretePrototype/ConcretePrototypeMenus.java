package PrototypePatterm.concretePrototype;

import java.io.*;
import java.util.List;

public class ConcretePrototypeMenus implements Cloneable,Serializable{
    private String date;
    private List<String> items;
    public ConcretePrototypeMenus(String date, List<String> items) {
        this.date = date;
        this.items = items;
    }
    //原型模式实现浅拷贝
    public ConcretePrototypeMenus shallowClone() {
        try {
            return (ConcretePrototypeMenus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    //原型模式实现深拷贝
    public ConcretePrototypeMenus DeapClone(){
        ConcretePrototypeMenus menus = null;
        try{
            ByteArrayOutputStream bas = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bas);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bas.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            menus =(ConcretePrototypeMenus) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return menus;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ConcretePrototypeMenus{" +
                "date='" + date + '\'' +
                ", items=" + items +
                '}';
    }
}
