package com.example.chess.shared.dto

import com.example.chess.shared.ArrayTable
import java.io.Serializable

/**
 * @author v.peschaniy
 *      Date: 22.07.2019
 */
data class ChessboardDTO(
    val position: Int,
    val matrix: ArrayTable<CellDTO>,
    val previousMove: MoveDTO?,
    val checkedPoint: PointDTO?
) : Serializable