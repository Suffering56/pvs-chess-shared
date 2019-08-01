package com.example.chess.shared.dto

import java.io.Serializable

/**
 * @author v.peschaniy
 *      Date: 23.07.2019
 */
data class PointDTO(
    val rowIndex: Int,
    val columnIndex: Int
) : Serializable