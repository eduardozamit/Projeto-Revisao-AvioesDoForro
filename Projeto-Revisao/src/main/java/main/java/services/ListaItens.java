package main.java.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListaItens {
    private List<Item> itens = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public void menuListas() {
        int option;
            do {
                System.out.println("\n1- Adicionar Item\n" +
                        "2- Remover tarefa\n" +
                        "3- Ver lista\n" +
                        "0- Sair\n");
                System.out.printf("Escolha uma opção: ");
                option = sc.nextInt();
                sc.nextLine();
                switch(option){
                    case(1) -> this.addItem();
                    case(2) -> this.removeItem();
                    case(3) -> this.mostrarLista();
                    case(0) -> {
                        return;
                    }
                    default -> System.out.println("Opção inválida.");
                }
        } while (true);
    }

    private void addItem() {
        itens.add(createItem());
    }

    private Item createItem() {
        String item;
        String descricaoDoItem;
        int pesoDoItem;
        System.out.println("Adcione um item.");
        System.out.print("Nome do item: ");
        item = sc.nextLine();
        System.out.print("Descrição: ");
        descricaoDoItem = sc.nextLine();
        System.out.print("Peso do item: ");
        pesoDoItem = sc.nextInt();

        return new Item(item, descricaoDoItem, pesoDoItem);
    }

    private void removeItem() {
        int item = -1;
        if (this.mostrarLista()) {
            do {
                System.out.println("Qual tarefa você quer remover? (0 para sair) ");
                item = sc.nextInt();
                if(item != 0){
                    try {
                        this.itens.remove(item - 1);
                        System.out.println("Item removido!");
                    } catch (IndexOutOfBoundsException ie) {
                        System.out.println("Tarefa inválida");
                    }
                }
            } while(item != 0 && !this.itens.isEmpty());
        }
    }

    private boolean mostrarLista() {
        if (this.itens.isEmpty()) {
            System.out.println("ERRO: lista vazia");
            return false;
        }
        System.out.println("=======-Itens-=======");
        for (int i = 0; i < this.itens.size(); i++){
            System.out.printf("%d // %s - %skg:\n\t\t-> %s \n", i + 1, this.itens.get(i).item, this.itens.get(i).getPesoDoItem(), this.itens.get(i).getDescricaoDoItem());
        }
        System.out.println("==========//==========");
        return true;
    }
}
