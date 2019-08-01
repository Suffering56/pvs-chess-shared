package com.example.chess.shared.enums

import java.io.Serializable

/**
 * @author v.peschaniy
 *      Date: 22.07.2019
 */
enum class Side(
    val pawnMoveVector: Int
) : Serializable {

    WHITE(1),
    BLACK(-1);

    fun reverse() = when (this) {
        WHITE -> BLACK
        BLACK -> WHITE
    }
}