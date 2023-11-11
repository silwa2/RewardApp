// Класс описывающий саму структуру калькулятора
public class Calculator implements iComplexCalculable {
      private ComplexNumber result;

      /**
       * Конструктор класса калькулятор
       * @param complexNum - принимает комплексное число
       */
      public Calculator(ComplexNumber complexNum) {
            this.result = complexNum;
      }

      @Override
      public ComplexNumber sum(ComplexNumber num) {
            this.result = this.result.sumCom(num);
            return result;
      }

      @Override
      public ComplexNumber subtract(ComplexNumber num) {
            this.result = this.result.subtractCom(num);
            return result;
      }

      @Override
      public ComplexNumber multiply(ComplexNumber num) {
            this.result = this.result.multiplyCom(num);
            return result;
      }

      @Override
      public ComplexNumber divide(ComplexNumber num) {
            this.result = this.result.divideCom(num);
            return result;
      }

      @Override
      public ComplexNumber getResult() {
            return this.result;
      }
}
