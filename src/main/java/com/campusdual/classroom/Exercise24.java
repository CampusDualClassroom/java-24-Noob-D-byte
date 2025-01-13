package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    //Crear una cola y poblarla en el metodo createQueue().
    public static Queue<String> createQueue() {
        //Creamos cola utilizando LinkedList
        Queue<String> queue = new LinkedList<>();

        //Agreamos os elementos
        queue.add("Smith");
        queue.add("Montessori");
        queue.add("Peralta");
        queue.add("House");
        return queue;
    }
    // Luego recorrerla mostrando cada elemento por pantalla y vaciarla en el metodo printAndEmptyQueue()
    public static void printAndEmptyQueue(Queue<String> queue) {
        while(!queue.isEmpty()){//Cando a lista non esta vacia

            System.out.println(queue.poll());//REmovo e imprimo ao frente
        }
    }

    public static void main(String[] args) {
        Queue<String> queue = createQueue();//Creamos e poblamos a cola
        printAndEmptyQueue(queue);//Imprimimos e vaciamos a cola

    }

}
