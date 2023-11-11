public class App {
    public static void main(String[] args) throws Exception {
        // Создаём пустого представителя класса калькулятор
        iComplexCalculable calculator = new Calculator(new ComplexNumber(0, 0));
        // Создаём представителя декоратора с включённым калькулятором со строки выше и логгером.
        iComplexCalculable newCalc = new ComplexCalcDecorator(calculator, new Logger());
        // Создаём основной рабочий класс, который принимает калькулятор с включенным логгером
        // и содержит в себе основные алгоритмы взаимоотношения программы
        ViewComplexCalculator view = new ViewComplexCalculator(newCalc);
        // Запускаем метод
        view.run();
    }
}
