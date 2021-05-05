package com.company.Model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ListVaultsButton<T> {

    private Node<T> head = null;

    private class Node<T> {
        // value oznacza wartość ogniwa
        private T value;
        // next wskazuje na kolejne ogniwo w łańcuchu
        private Node<T> next;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }

        public T getValue() {
            return value;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public Node<T> getNext() {
            return next;
        }

        @Override
        public String toString() {
            return "" + value;
        }
    }

    public void add(T e){
        Node<T> node = new Node<>(e, head);
        head = node;
        addVaultsToFile();
    }

    public void show(){
        Node tmp = head;
        while(tmp != null){
            System.out.println(tmp.toString());
            tmp = tmp.getNext();
        }
    }

    public void addVaultsToFile(){
        Node tmp = head;
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("ButtonList.txt", true));
            // while(tmp != null) {
            bw.write(tmp+ "\n");
            //  tmp = tmp.getNext();
            //  }
            bw.flush();
            bw.close();
            System.out.println("Plik został poprawnie stworzony");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
