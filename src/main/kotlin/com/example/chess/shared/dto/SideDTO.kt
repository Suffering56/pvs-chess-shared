package com.example.chess.shared.dto

import com.example.chess.shared.enums.Side
import java.lang.UnsupportedOperationException

/**
 * @author v.peschaniy
 *      Date: 22.07.2019
 */
enum class SideDTO {
    SIDE_WHITE,
    SIDE_BLACK,
    VIEWER,
    UNSELECTED;

    fun toSide(): Side {
        return when (this) {
            SIDE_WHITE -> Side.WHITE
            SIDE_BLACK -> Side.BLACK
            else -> throw UnsupportedOperationException("can't transform SideDTO to Side: $this")
        }
    }

    companion object {
        fun ofSide(side: Side): SideDTO {
            return when (side) {
                Side.WHITE -> SIDE_WHITE
                Side.BLACK -> SIDE_BLACK
            }
        }
    }
}