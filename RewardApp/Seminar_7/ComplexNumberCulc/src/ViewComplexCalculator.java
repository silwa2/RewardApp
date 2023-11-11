// Класс самого калькулятора взаимодействующего с пользователем

import java.util.Scanner;

public class ViewComplexCalculator {
      private iComplexCalculable calculator;

      /**
       * Конструктор класса
       * @param calculator - принимает представителя класса калькулятор
       */
      public ViewComplexCalculator(iComplexCalculable calculator) {
            this.calculator = calculator;
      }

      /**
       * Метод для получения символов от пользователя
       * 
       * @param msg - сообщение пользователю
       * @return возвращает строку текста для дальнейшего приведения к типу
       */
      private String prompt(String msg) {
            Scanner in = new Scanner(System.in);
            System.out.println(msg);
            return in.nextLine();
      }

      /**
       * Метод для получения от пользователя комплексного числа в 2 этапа
       * 
       * @param msg - сообщение пользователю
       * @return возвращает заполненый класс комплексного числа
       */
      private ComplexNumber complexPrompt() {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите вещественную часть числа: ");
            double real = Double.parseDouble(in.next());
            System.out.println("Введите мнимую часть: ");
            double imgn = Double.parseDouble(in.next());
            return new ComplexNumber(real, imgn);
      }

      /**
       * Основной метод запускающий калькулятор
       */
      public void run() {
            while (true) {
                  ComplexNumber startValue = complexPrompt();
                  calculator.sum(startValue);

                  while (true) {
                        String cmd = prompt("Введите оператор (доступны: + , - , / , * , (= закончит работу вычислений и выведет окончательный результат)): ");
                        if (cmd.equals("+")) {
                              ComplexNumber num = complexPrompt();
                              calculator.sum(num);
                              continue;
                        }
                        if (cmd.equals("-")) {
                              ComplexNumber num = complexPrompt();
                              calculator.subtract(num);
                              continue;
                        }
                        if (cmd.equals("*")) {
                              ComplexNumber num = complexPrompt();
                              calculator.multiply(num);
                              continue;
                        }
                        if (cmd.equals("/")) {
                              ComplexNumber num = complexPrompt();
                              calculator.divide(num);
                              continue;
                        }
                        if (cmd.equals("=")) {
                              ComplexNumber result = calculator.getResult();
                              System.out.printf("Результат - комплексное число: %s\n", result);
                              break;
                        }
                  }
                  String cmd = prompt("Хотите продолжить(Y/N): ").toUpperCase();
                  if (cmd.equals("Y")) {
                        continue;
                  }
                  break;
            }
      }
}
