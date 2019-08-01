package com.example.chess.shared.dto

import com.example.chess.shared.enums.Piece
import java.io.Serializable

/**
 * @author v.peschaniy
 *      Date: 22.07.2019
 */
data class CellDTO(
    val pointDTO: PointDTO,
    val piece: Piece?
) : Serializable