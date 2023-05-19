package com.atividade;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Testes {

  @Test
   public void isEmpty01(){
      FilaEstatica f = new FilaEstatica(5);
   
      boolean actual = f.isEmpty();
      boolean exptected = f.isEmpty();

      assertEquals(exptected, actual);
   }

   @Test
   public void isEmpty02(){
      FilaEstatica f = new FilaEstatica(5);
      f.enqueue(10);
      f.enqueue(20);
      f.enqueue(30);
      f.enqueue(40);
      f.enqueue(50);

      f.dequeue();
      f.dequeue();
      f.dequeue();
      f.dequeue();
      f.dequeue();

      boolean actual = f.isEmpty();
      boolean exptected = f.isEmpty();

      assertEquals(exptected, actual);
   }

   @Test
   public void isFull(){
      FilaEstatica f = new FilaEstatica(5);
      f.enqueue(10);
      f.enqueue(20);
      f.enqueue(30);
      f.enqueue(40);
      f.enqueue(50);

      boolean exptected = true;
      boolean actual = f.isFull();

     assertEquals(exptected, actual);
   }
   
   @Test
   public void enqueue(){
      FilaEstatica f = new FilaEstatica(5);
      f.enqueue(10);
      f.enqueue(20);
      f.enqueue(30);
      f.enqueue(40);
      f.enqueue(50);

      Integer[] exptected = {Integer.valueOf(10), Integer.valueOf(20), Integer.valueOf(30), Integer.valueOf(40), Integer.valueOf(50)};
      Integer[] actual = f.elementos;

      assertArrayEquals(exptected, actual);
   }

   @Test
   public void deenqueue(){
      FilaEstatica f = new FilaEstatica(5);
      f.enqueue(10);
      f.enqueue(20);
      f.enqueue(30);

      f.dequeue();

      f.enqueue(40);
      f.enqueue(50);
      f.enqueue(60);

      Integer[] exptected = {Integer.valueOf(60), Integer.valueOf(20), Integer.valueOf(30), Integer.valueOf(40), Integer.valueOf(50)};
      Integer[] actual = f.elementos;

      assertArrayEquals(exptected, actual);
   }
}
