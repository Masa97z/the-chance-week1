
fun sudoku(grid: Array<IntArray>): Boolean {
    // Check each row
    for (row in grid) {
        if (!isValidUnit(row)) return false
    }

    // Check each column
    for (col in 0 until 9) {
        val column = IntArray(9) { grid[it][col] }
        if (!isValidUnit(column)) return false
    }

    // Check each 3x3 subgrid
    for (boxRow in 0 until 3) {
        for (boxCol in 0 until 3) {
            val subgrid = IntArray(9) {
                val row = boxRow * 3 + it / 3
                val col = boxCol * 3 + it % 3
                grid[row][col]
            }
            if (!isValidUnit(subgrid)) return false
        }
    }

    return true
}

 fun isValidUnit(unit: IntArray): Boolean {
    val seen = BooleanArray(10) // indices 1-9 will be used

    for (num in unit) {
        // Check for invalid numbers (outside 1-9)
        if (num < 1 || num > 9) return false

        // Check for duplicates
        if (seen[num]) return false
        seen[num] = true
    }

    return true
}


