package com.example.chess.shared

import com.example.chess.shared.enums.Side

/**
 * @author v.peschaniy
 *      Date: 22.07.2019
 */
data class Playground(
    val position: Int,
    val cellsMatrix: List<List<Cell>>,
    val underCheckSide: Side?
)