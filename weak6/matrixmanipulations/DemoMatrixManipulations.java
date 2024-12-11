package matrixmanipulations;

/**
 * Класс DemoMatrixManipulations демонстрирует работу методов класса MatrixManipulations.
 */
public class DemoMatrixManipulations {

    public static void main(String[] args) {
        // Создание матрицы размером 5x5
        MatrixManipulations matrixManipulations = new MatrixManipulations(5);

        // Вывод исходной матрицы
        System.out.println("Исходная матрица:");
        matrixManipulations.printMatrix();

        // Вычитание средних арифметических
        matrixManipulations.subtractRowAverages();
        System.out.println("\nМатрица после вычитания среднего арифметического по строкам:");
        matrixManipulations.printMatrix();

        // Удаление строк и столбцов, содержащих максимальный элемент
        matrixManipulations.removeRowsAndColumnsWithMax();
        System.out.println("\nМатрица после удаления строк и столбцов с максимальным элементом:");
        matrixManipulations.printMatrix();

        // Уплотнение матрицы
        matrixManipulations.compactMatrix();
        System.out.println("\nМатрица после удаления нулевых строк и столбцов:");
        matrixManipulations.printMatrix();
    }
}
