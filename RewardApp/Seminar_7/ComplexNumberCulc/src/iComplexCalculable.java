// Интерфейс для работы с комплексными числами в калькуляторе
public interface iComplexCalculable {

      /**
       * Метод производящий сложение чисел
       * @param num - комплексное число
       * @return результат сложения чисел
       */
      ComplexNumber sum(ComplexNumber num);

      /**
       * Метод производящий вычетание чисел
       * @param num - комплексное число
       * @return результат вычетания чисел
       */
      ComplexNumber subtract(ComplexNumber num);

      /**
       * Метод производящий умножение чисел
       * @param num - комплексное число
       * @return результат умножения чисел
       */
      ComplexNumber multiply(ComplexNumber num);

      /**
       * Метод производящий деление чисел
       * @param num - комплексное число
       * @return результат деления чисел
       */
      ComplexNumber divide(ComplexNumber num);

      /**
       * Метод возвращающий данные числа
       * 
       * @return результат операции
       */
      ComplexNumber getResult();
}
