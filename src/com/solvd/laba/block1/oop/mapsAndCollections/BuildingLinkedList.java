package com.solvd.laba.block1.oop.mapsAndCollections;

import com.solvd.laba.block1.oop.Building;

public class BuildingLinkedList {
    private Node head;
    private int size;

    public void add(Building building) {
        if (head == null) {
            this.head = new Node(building);
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(building));
        }
        size++;
    }

    public Building get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Incorrect index");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.data;
    }

    public boolean remove(Building building) {
        if (head == null) {
            return false;
        }

        if (head.data.equals(building)) {
            head = head.getNext();
            size--;
            return true;
        }

        Node current = head;
        Node previous = null;

        while (current != null && !current.data.equals(building)) {
            previous = current;
            current = previous.getNext();
        }

        if (current == null) {
            return false;
        }

        previous.next = current.next;
        size--;
        return true;
    }

    public int size() {
        return size;
    }

    private static class Node {
        private Building data;
        private Node next;

        public Node(Building data) {
            this.data = data;
        }

        public Building getData() {
            return this.data;
        }

        public void setData(Building data) {
            this.data = data;
        }

        public Node getNext() {
            return this.next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
