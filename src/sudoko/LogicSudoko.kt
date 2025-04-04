fun hasDuplicateInRows(grid: Array<IntArray>): Boolean {
    for (row in grid) {
        val seen = mutableSetOf<Int>()
        for (num in row) {
            if (num != 0 && !seen.add(num)) {
                return true

            }
        }
    }
    return false
}


fun hasDuplicateInColumns(grid: Array<IntArray>): Boolean {
    for (col in 0..<grid[0].size) {
        val seen = mutableSetOf<Int>()
        for (row in grid) {
            val num = row[col]
            if (num != 0 && !seen.add(num)) {
                return true
            }
        }
    }
    return false
}

fun hasDuplicateInSubGrids(grid: Array<IntArray>): Boolean {

    for (startRow in arrayOf(0, 3, 6)) {
        for (startCol in arrayOf(0, 3, 6)) {
            val seen = mutableSetOf<Int>()
            for (i in startRow..<startRow + 3) {
                for (j in startCol..<startCol + 3) {
                    val num = grid[i][j]
                    if (num != 0 && !seen.add(num)) {
                        return true
                    }
                }
            }
        }
    }
    return false
}

fun hasNegativeValues(grid: Array<IntArray>): Boolean {
    for (row in grid) {
        for (num in row) {
            if (num < 0) {
                return true
            }
        }
    }
    return false
}

fun containsZero(grid: Array<IntArray>): Boolean {
    for (row in grid) {
        for (num in row) {
            if (num == 0) {
                return true
            }
        }
    }
    return false
}

fun sudoku(grid: Array<IntArray>): Boolean {
    return !hasDuplicateInRows(grid) &&
            !hasDuplicateInColumns(grid) &&
            !hasDuplicateInSubGrids(grid) &&
            !hasNegativeValues(grid) &&
            !containsZero(grid)
}
