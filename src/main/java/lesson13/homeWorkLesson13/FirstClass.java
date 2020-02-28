package lesson13.homeWorkLesson13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class FirstClass {
    private LinkedList<String > linkedListFirstClass;
    private HashSet<String> hashSetFirstClass;
    private HashMap<String, Double> hashMapFirstClass;

    public FirstClass() {
    }

    public FirstClass(LinkedList<String> linkedListFirstClass, HashSet<String> hashSetFirstClass,
                      HashMap<String, Double> hashMapFirstClass) {
        this.linkedListFirstClass = linkedListFirstClass;
        this.hashSetFirstClass = hashSetFirstClass;
        this.hashMapFirstClass = hashMapFirstClass;
    }

    public LinkedList<String> getLinkedListFirstClass() {
        return linkedListFirstClass;
    }

    public void setLinkedListFirstClass(LinkedList<String> linkedListFirstClass) {
        this.linkedListFirstClass = linkedListFirstClass;
    }

    public HashSet<String> getHashSetFirstClass() {
        return hashSetFirstClass;
    }

    public void setHashSetFirstClass(HashSet<String> hashSetFirstClass) {
        this.hashSetFirstClass = hashSetFirstClass;
    }

    public HashMap<String, Double> getHashMapFirstClass() {
        return hashMapFirstClass;
    }

    public void setHashMapFirstClass(HashMap<String, Double> hashMapFirstClass) {
        this.hashMapFirstClass = hashMapFirstClass;
    }

    @Override
    public String toString() {
        return "FirstClass{" +
                "linkedListFirstClass=" + linkedListFirstClass +
                ", hashSetFirstClass=" + hashSetFirstClass +
                ", hashMapFirstClass=" + hashMapFirstClass +
                '}';
    }
}
