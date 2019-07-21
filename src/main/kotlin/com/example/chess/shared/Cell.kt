package com.example.chess.shared

import com.example.chess.shared.enums.Piece

data class Cell(
    val rowIndex: Int,
    val columnIndex: Int,
    val piece: Piece
)