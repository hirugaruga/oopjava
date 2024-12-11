package matrixmanipulations;

import java.util.Random;

/**
 * Класс MatrixManipulations содержит методы для выполнения различных операций с матрицами.
 */
class MatrixManipulations {

    private double[][] matrix;

    /**
     * Конструктор для инициализации матрицы с заданной размерностью и случайными элементами.
     *
     * @param n Размерность матрицы.
     */
    public MatrixManipulations(int n) {
        matrix = new double[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = -n + (2 * n) * random.nextDouble();
            }
        }
    }

    /**
     * Вывод матрицы в консоль в виде таблицы.
     */
    public void printMatrix() {
        for (double[] row : matrix) {
            for (double elem : row) {
                System.out.printf("%10.4f ", elem);
            }
            System.out.println();
        }
    }

    /**
     * Метод для вычитания из элементов каждой строки матрицы ее среднего арифметического.
     */
    public void subtractRowAverages() {
        for (int i = 0; i < matrix.length; i++) {
            double rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            double rowAverage = rowSum / matrix[i].length;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] -= rowAverage;
            }
        }
    }

    /**
     * Метод для нахождения максимального элемента и удаления всех строк и столбцов, его содержащих.
     */
    public void removeRowsAndColumnsWithMax() {
        double max = Double.NEGATIVE_INFINITY;
        int maxRow = -1;
        int maxCol = -1;

        // Поиск максимального элемента
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // Удаление строки и столбца, содержащих максимальный элемент
        matrix = removeRowAndColumn(matrix, maxRow, maxCol);
    }

    /**
     * Удаляет строку и столбец из матрицы по их индексам.
     *
     * @param matrix Исходная матрица.
     * @param row    Индекс строки для удаления.
     * @param col    Индекс столбца для удаления.
     * @return Новая матрица без указанной строки и столбца.
     */
    private double[][] removeRowAndColumn(double[][] matrix, int row, int col) {
        int newSize = matrix.length - 1;
        double[][] newMatrix = new double[newSize][newSize];
        int newRow = 0, newCol = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (i == row) continue;
            newCol = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == col) continue;
                newMatrix[newRow][newCol++] = matrix[i][j];
            }
            newRow++;
        }
        return newMatrix;
    }

    /**
     * Метод для удаления строк и столбцов, заполненных нулями.
     */
    public void compactMatrix() {
        matrix = removeZeroRowsAndColumns(matrix);
    }

    /**
     * Удаляет строки и столбцы, содержащие только нули.
     *
     * @param matrix Исходная матрица.
     * @return Новая матрица без нулевых строк и столбцов.
     */
    private double[][] removeZeroRowsAndColumns(double[][] matrix) {
        boolean[] zeroRows = new boolean[matrix.length];
        boolean[] zeroCols = new boolean[matrix[0].length];

        // Определение нулевых строк и столбцов
        for (int i = 0; i < matrix.length; i++) {
            boolean isZeroRow = true;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    isZeroRow = false;
                    break;
                }
            }
            zeroRows[i] = isZeroRow;
        }

        for (int j = 0; j < matrix[0].length; j++) {
            boolean isZeroCol = true;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] != 0) {
                    isZeroCol = false;
                    break;
                }
            }
            zeroCols[j] = isZeroCol;
        }

        // Формирование новой матрицы
        int newSize = matrix.length;
        for (boolean row : zeroRows) if (row) newSize--;
        for (boolean col : zeroCols) if (col) newSize--;

        double[][] newMatrix = new double[newSize][newSize];
        int newRow = 0, newCol;

        for (int i = 0; i < matrix.length; i++) {
            if (zeroRows[i]) continue;
            newCol = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (zeroCols[j]) continue;
                newMatrix[newRow][newCol++] = matrix[i][j];
            }
            newRow++;
        }

        return newMatrix;
    }
}
