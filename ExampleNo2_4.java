
public class ExampleNo2_4 {
    public static boolean isValidSudoku(char[][] board) {
        // Проверяем каждую строку
        for (int i = 0; i < 9; i++) {
            boolean[] rowCheck = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    if (rowCheck[num]) {
                        return false;
                    } else {
                        rowCheck[num] = true;
                    }
                }
            }
        }

        // Проверяем каждую колонку
        for (int j = 0; j < 9; j++) {
            boolean[] colCheck = new boolean[9];
            for (int i = 0; i < 9; i++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    if (colCheck[num]) {
                        return false;
                    } else {
                        colCheck[num] = true;
                    }
                }
            }
        }

        // Проверяем каждый подблок
        for (int block = 0; block < 9; block++) {
            boolean[] blockCheck = new boolean[9];
            int startRow = (block / 3) * 3;
            int startCol = (block % 3) * 3;
            for (int i = startRow; i < startRow + 3; i++) {
                for (int j = startCol; j < startCol + 3; j++) {
                    if (board[i][j] != '.') {
                        int num = board[i][j] - '1';
                        if (blockCheck[num]) {
                            return false;
                        } else {
                            blockCheck[num] = true;
                        }
                    }
                }
            }
        }


        // Если все проверки пройдены успешно, значит доска валидна
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {{'.', '.', '2', '.', '.', '4', '8', '3', '.'},
                          {'.', '.', '3', '.', '6', '.', '9', '.', '2'},
                          {'5', '6', '.', '.', '.', '9', '.', '1', '4'},
                          {'.', '.', '.', '3', '.', '.', '5', '.', '8'},
                          {'.', '2', '.', '.', '.', '.', '.', '4', '.'},
                          {'9', '.', '7', '.', '.', '5', '.', '.', '.'},
                          {'3', '8', '.', '5', '.', '.', '.', '2', '9'},
                          {'1', '.', '9', '.', '2', '.', '4', '.', '.'},
                          {'.', '5', '4', '8', '.', '.', '6', '.', '.'}};
        boolean isValid = isValidSudoku(board);
        System.out.println(isValid);
    }
}

