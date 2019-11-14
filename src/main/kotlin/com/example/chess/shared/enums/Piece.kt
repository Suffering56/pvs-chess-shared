package com.example.chess.shared.enums

import java.io.Serializable

/**
 * @author v.peschaniy
 *      Date: 22.07.2019
 */
enum class Piece private constructor(
    val side: Side,
    val type: PieceType,
    val shortName: String = type.shortName
) : Serializable {

    PAWN_WHITE(Side.WHITE, PieceType.PAWN),
    KNIGHT_WHITE(Side.WHITE, PieceType.KNIGHT),
    BISHOP_WHITE(Side.WHITE, PieceType.BISHOP),
    ROOK_WHITE(Side.WHITE, PieceType.ROOK),
    QUEEN_WHITE(Side.WHITE, PieceType.QUEEN),
    KING_WHITE(Side.WHITE, PieceType.KING),

    PAWN_BLACK(Side.BLACK, PieceType.PAWN),
    KNIGHT_BLACK(Side.BLACK, PieceType.KNIGHT),
    BISHOP_BLACK(Side.BLACK, PieceType.BISHOP),
    ROOK_BLACK(Side.BLACK, PieceType.ROOK),
    QUEEN_BLACK(Side.BLACK, PieceType.QUEEN),
    KING_BLACK(Side.BLACK, PieceType.KING);

    fun isPawn(): Boolean {
        return type === PieceType.PAWN
    }

    fun isKing(): Boolean {
        return type === PieceType.KING
    }

    fun isRook(): Boolean {
        return type === PieceType.ROOK
    }

    companion object {

        fun of(side: Side, type: PieceType): Piece {
            return if (side === Side.WHITE) {
                when (type) {
                    PieceType.PAWN -> PAWN_WHITE
                    PieceType.KNIGHT -> KNIGHT_WHITE
                    PieceType.BISHOP -> BISHOP_WHITE
                    PieceType.ROOK -> ROOK_WHITE
                    PieceType.QUEEN -> QUEEN_WHITE
                    PieceType.KING -> KING_WHITE
                }
            } else {
                when (type) {
                    PieceType.PAWN -> PAWN_BLACK
                    PieceType.KNIGHT -> KNIGHT_BLACK
                    PieceType.BISHOP -> BISHOP_BLACK
                    PieceType.ROOK -> ROOK_BLACK
                    PieceType.QUEEN -> QUEEN_BLACK
                    PieceType.KING -> KING_BLACK
                }
            }
        }
    }
}