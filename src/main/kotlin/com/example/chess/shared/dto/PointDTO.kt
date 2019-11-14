package com.example.chess.shared.dto

import com.example.chess.shared.api.IPoint
import java.io.Serializable

/**
 * @author v.peschaniy
 *      Date: 23.07.2019
 */
data class PointDTO(
    override val row: Int,
    override val col: Int
) : Serializable, IPoint {

    override fun toDTO() = this
}