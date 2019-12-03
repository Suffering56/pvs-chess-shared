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
}