package com.trybe.acc.java.numerosaleatorios;

import java.util.Random;

/**
 * Class NumerosAleatorios.
 */
public class NumerosAleatorios {
  /**
   * Método principal para a execuçao do código.
   * 
   */
  public static void main(String[] args) {
    int lastValue = 0;

    while (lastValue != 4) {
      lastValue = numeroAleatorio();
      imprime(lastValue);
    }
  }

  // Chame a função escrevendo `imprime()`.
  static void imprime(int numero) {
    System.out.println(numero);
  }

  // Chame a função escrevendo `numeroAleatorio()`.
  static int numeroAleatorio() {
    return numerosAleatorios.entreUmECinco();
  }

  static NumerosAleatorios numerosAleatorios = new NumerosAleatorios();

  int entreUmECinco() {
    return new Random().nextInt(5) + 1;
  }
}
