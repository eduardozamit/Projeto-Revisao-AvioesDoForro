package main.java.services;

public class Item {
    String item;
    String descricaoDoItem;
    int pesoDoItem;

    public Item(String s, String item, int pesoDoItem){
        this.item = item;
        this.pesoDoItem = pesoDoItem;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescricaoDoItem() {
        return descricaoDoItem;
    }

    public void setDescricaoDoItem(String descricaoDoItem) {
        this.descricaoDoItem = descricaoDoItem;
    }

    public int getPesoDoItem() {
        return pesoDoItem;
    }

    public void setPesoDoItem(int pesoDoItem) {
        this.pesoDoItem = pesoDoItem;
    }
}
