//Класс комплексных чисел и операций с ними.
public class ComplexNumber {
      private double realPart;
      private double imaginPart;

      /**
       * Конструктор класса комплексных чисел.
       * 
       * @param realPart   - вещественное число
       * @param imaginPart - мнимое число
       */
      public ComplexNumber(double realPart, double imaginPart) {
            this.realPart = realPart;
            this.imaginPart = imaginPart;
      }

      /**
       * Метод сложения комплексных чисел
       * 
       * @param num - комплексное число
       * @return результат сложения чисел
       */
      public ComplexNumber sumCom(ComplexNumber num) {
            double realResult = this.realPart + num.realPart;
            double imaginResult = this.imaginPart + num.imaginPart;
            return new ComplexNumber(realResult, imaginResult);
      }

      /**
       * Метод вычетания комплексных чисел
       * 
       * @param num - комплексное число
       * @return результат вычетания чисел
       */
      public ComplexNumber subtractCom(ComplexNumber num) {
            double realResult = this.realPart - num.realPart;
            double imaginResult = this.imaginPart - num.imaginPart;
            return new ComplexNumber(realResult, imaginResult);
      }

      /**
       * Метод умножения комплексных чисел
       * 
       * @param num - комплексное число
       * @return результат умножения чисел
       */
      public ComplexNumber multiplyCom(ComplexNumber num) {
            double realResult = this.realPart * num.realPart - this.imaginPart * num.imaginPart;
            double imaginResult = this.realPart * num.imaginPart + this.imaginPart * num.realPart;
            return new ComplexNumber(realResult, imaginResult);
      }

      /**
       * Метод деления комплексных чисел
       * 
       * @param num - комплексное число
       * @return результат деления чисел
       */
      public ComplexNumber divideCom(ComplexNumber num) {
            double crosser = num.realPart * num.realPart + num.imaginPart * num.imaginPart;
            double realResult = (this.realPart * num.realPart + this.imaginPart * num.imaginPart) / crosser;
            double imaginResult = (this.imaginPart * num.realPart - this.realPart * num.imaginPart) / crosser;
            return new ComplexNumber(realResult, imaginResult);
      }


      @Override
      public String toString() {
            String real = String.format("%.5f", realPart);
            String imagin = String.format("%.5f", imaginPart);
            return real + " " + imagin;
      }

}
