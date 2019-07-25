package com.example.chess.shared.dto

import com.example.chess.shared.ArrayTable
import com.example.chess.shared.enums.Piece
import com.example.chess.shared.enums.Side

/**
 * @author v.peschaniy
 *      Date: 22.07.2019
 */
data class ChessboardDTO(
    val position: Int,
    val matrix: ArrayTable<CellDTO>,
    val underCheckSide: Side?
)