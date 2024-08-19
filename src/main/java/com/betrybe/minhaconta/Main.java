package com.betrybe.minhaconta;

import com.betrybe.minhaconta.presentation.Application;
import com.betrybe.minhaconta.presentation.ConsoleUserInterface;
import java.util.Scanner;

/**
 * Project starts here.
 */
public class Main {

  /**
   * The entry point of application.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ConsoleUserInterface ui = new ConsoleUserInterface(scanner);
    Application application = new Application(ui);
    application.run();

    scanner.close();
  }
}