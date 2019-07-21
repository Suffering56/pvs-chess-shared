package com.example.chess.shared.enums

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