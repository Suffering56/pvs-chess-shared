package com.example.chess.shared.enums

/**
 * @author v.peschaniy
 *      Date: 22.07.2019
 */
enum class Side(
    val pawnMoveVector: Int
) {
    WHITE(1),
    BLACK(-1);

    fun reverse() = when (this) {
        WHITE -> BLACK
        BLACK -> WHITE
    }
}