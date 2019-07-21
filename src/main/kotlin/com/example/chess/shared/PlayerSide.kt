package com.example.chess.shared

import com.example.chess.shared.enums.Side
import java.lang.UnsupportedOperationException

enum class PlayerSide {
    SIDE_WHITE,
    SIDE_BLACK,
    VIEWER,
    UNSELECTED;

    fun toSide(): Side {
        return when (this) {
            SIDE_WHITE -> Side.WHITE
            SIDE_BLACK -> Side.BLACK
            else -> throw UnsupportedOperationException("can't transform PlayerSide to Side: $this")
        }
    }

    companion object {
        fun ofSide(side: Side): PlayerSide {
            return when (side) {
                Side.WHITE -> SIDE_WHITE
                Side.BLACK -> SIDE_BLACK
            }
        }
    }
}