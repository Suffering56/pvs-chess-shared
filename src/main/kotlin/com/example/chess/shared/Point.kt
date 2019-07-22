package com.example.chess.shared

import com.example.chess.shared.Constants.BOARD_SIZE

/**
 * @author v.peschaniy
 *      Date: 22.07.2019
 */
data class Point(
    val rowIndex: Int,
    val columnIndex: Int
) {
    companion object {

        private val pointsPool = Array(BOARD_SIZE) { rowIndex ->
            Array(BOARD_SIZE) { columnIndex ->
                Point(rowIndex, columnIndex)
            }
        }

        fun valueOf(rowIndex: Int, columnIndex: Int) = pointsPool[rowIndex][columnIndex]
    }
}