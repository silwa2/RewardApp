// Класс-декоратор добовляет логирование для калькулятора
public class ComplexCalcDecorator implements iComplexCalculable {

      private iComplexCalculable oldCalc;
      private Logger logger;

      /**
       * Конструктор для декоратора
       * @param oldCalc - принимает образец калькулятора
       * @param logger - принимает образец логгера
       */
      public ComplexCalcDecorator(iComplexCalculable oldCalc, Logger logger) {
            this.oldCalc = oldCalc;
            this.logger = logger;
      }

      @Override
      public ComplexNumber sum(ComplexNumber num) {
            ComplexNumber firstArg = oldCalc.getResult();
            logger.log(String.format("Начата операция сложения, исходное число %s складываем с %s", firstArg,
                        num));
            ComplexNumber result = oldCalc.sum(num);
            logger.log(String.format("Выполнено. В ходе операции получено число %s", result));
            return result;
      }

      @Override
      public ComplexNumber subtract(ComplexNumber num) {
            ComplexNumber firstArg = oldCalc.getResult();
            logger.log(String.format("Начата операция вычетания, из исходного числа %s вычетаем  %s", firstArg,
                        num));
            ComplexNumber result = oldCalc.subtract(num);
            logger.log(String.format("Выполнено. В ходе операции получено число %s", result));
            return result;
      }

      @Override
      public ComplexNumber multiply(ComplexNumber num) {
            ComplexNumber firstArg = oldCalc.getResult();
            logger.log(String.format("Начата операция умножения, исходное число %s умножаем на %s", firstArg,
                        num));
            ComplexNumber result = oldCalc.multiply(num);
            logger.log(String.format("Выполнено. В ходе операции получено число %s", result));
            return result;
      }

      @Override
      public ComplexNumber divide(ComplexNumber num) {
            ComplexNumber firstArg = oldCalc.getResult();
            logger.log(String.format("Начата операция деления, исходное число %s делим на %s", firstArg,
                        num));
            ComplexNumber result = oldCalc.divide(num);
            logger.log(String.format("Выполнено. В ходе операции получено число %s", result));
            return result;
      }

      @Override
      public ComplexNumber getResult() {
            return oldCalc.getResult();
      }
}
