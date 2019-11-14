package com.example.chess.shared.enums

import java.io.Serializable

/**
 * @author v.peschaniy
 *      Date: 22.07.2019
 */
enum class PieceType(
    val value: Int,
    val shortName: String
) : Serializable {

    PAWN(1, " "),
    KNIGHT(3, "N"),
    BISHOP(3, "B"),
    ROOK(5, "R"),
    QUEEN(9, "Q"),
    KING(9999, "K");
}