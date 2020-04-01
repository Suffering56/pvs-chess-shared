package com.example.chess.shared.enums

import java.io.Serializable

/**
 * @author v.peschaniy
 *      Date: 22.07.2019
 */
enum class Side(
    val pawnRowDirection: Int,
    val pawnInitialRow: Int,
    val pawnEnPassantStartRow: Int  //с какой горизонтали доступно взятие на проходе (для пешки которая рубит)
) : Serializable {

    WHITE(1, 1, 4),
    BLACK(-1, 6, 3);

    fun reverse() = when (this) {
        WHITE -> BLACK
        BLACK -> WHITE
    }

    fun isEnemyFor(other: Side?): Boolean {
        if (other == null) {
            return false
        }
        return this != other
    }

    fun isEnemyFor(other: Piece?): Boolean {
        return isEnemyFor(other?.side)
    }

    companion object {
        fun nextTurnSide(position: Int): Side {
            return if (position % 2 == 0)
                WHITE
            else
                BLACK
        }
    }
}