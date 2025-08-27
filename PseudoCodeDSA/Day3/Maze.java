// Maze represented by 2D array (0 = free path, 1 = wall)
ARRAY maze[ROW][COL]

METHOD isSafe(maze, x, y) {
    RETURN (x >= 0 AND x < ROW) AND (y >= 0 AND y < COL) AND (maze[x][y] == 0)
}

// Recursive backtracking solver
METHOD solveMaze(maze, x, y, solution) {
    IF x == ROW-1 AND y == COL-1 THEN
        solution[x][y] = 1
        RETURN TRUE
    ENDIF

    IF isSafe(maze, x, y) THEN
        solution[x][y] = 1

        // Move Right
        IF solveMaze(maze, x, y+1, solution) THEN
            RETURN TRUE
        ENDIF

        // Move Down
        IF solveMaze(maze, x+1, y, solution) THEN
            RETURN TRUE
        ENDIF

        // Backtrack
        solution[x][y] = 0
        RETURN FALSE
    ENDIF

    RETURN FALSE
}

// MAIN
DEFINE maze = [
    [0, 1, 0, 0],
    [0, 0, 0, 1],
    [1, 0, 1, 0],
    [0, 0, 0, 0]
]

solution = 2D array of 0s same size as maze

IF solveMaze(maze, 0, 0, solution) THEN
    PRINT "Path found"
    PRINT solution matrix
ELSE
    PRINT "No path found"
ENDIF
