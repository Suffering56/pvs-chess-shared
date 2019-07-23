package com.example.chess.shared.dto

import com.example.chess.shared.enums.PieceType

/**
 * @author v.peschaniy
 *      Date: 22.07.2019
 */
data class MoveDTO(
    val from: PointDTO,
    val to: PointDTO,
    val pieceFromPawn: PieceType? = null
)