package com.example.chess.shared.dto

import com.example.chess.shared.enums.Side

/**
 * @author v.peschaniy
 *      Date: 22.07.2019
 */
data class ChessboardDTO(
    val position: Int,
    val cellsMatrix: List<List<CellDTO>>,
    val underCheckSide: Side?
)