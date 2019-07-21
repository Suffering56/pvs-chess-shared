package com.example.chess.shared

import com.example.chess.shared.enums.Side

data class Playground(
    val position: Int,
    val cellsMatrix: List<List<Cell>>,
    val underCheckSide: Side?
)