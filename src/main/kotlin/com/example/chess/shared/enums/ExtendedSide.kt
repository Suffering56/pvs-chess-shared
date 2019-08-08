package com.example.chess.shared.enums

import java.io.Serializable

/**
 * @author v.peschaniy
 *      Date: 22.07.2019
 */
enum class ExtendedSide : Serializable {
    SIDE_WHITE,
    SIDE_BLACK,
    VIEWER,
    UNSELECTED;

    fun toSide(): Side {
        return when (this) {
            SIDE_WHITE -> Side.WHITE
            SIDE_BLACK -> Side.BLACK
            else -> throw UnsupportedOperationException("can't transform ExtendedSide to Side: $this")
        }
    }

    fun isNormal(): Boolean = (this == SIDE_WHITE || this == SIDE_BLACK)

    companion object {
        fun ofSide(side: Side): ExtendedSide {
            return when (side) {
                Side.WHITE -> SIDE_WHITE
                Side.BLACK -> SIDE_BLACK
            }
        }
    }
}