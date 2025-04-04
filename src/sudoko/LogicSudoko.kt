
fun sudoku(grid: Array<IntArray>): Boolean {
    for (row in grid) {
        if (!isValidUnit(row)) return false
    }

    for (col in 0..<9) {
        val column = IntArray(9) { grid[it][col] }
        if (!isValidUnit(column)) return false
    }

    for (boxRow in 0..<3) {
        for (boxCol in 0..<3) {
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
    val seen = BooleanArray(10)

    for (num in unit) {
        if (num < 1 || num > 9) return false

        if (seen[num]) return false
        seen[num] = true
    }

    return true
}


