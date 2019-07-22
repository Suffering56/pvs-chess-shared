package com.example.chess.shared

import com.example.chess.shared.enums.PieceType

/**
 * @author v.peschaniy
 *      Date: 22.07.2019
 */
data class Move(
    val from: Point,
    val to: Point,
    val pieceFromPawn: PieceType? = null
)