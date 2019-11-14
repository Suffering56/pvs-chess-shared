package com.example.chess.shared.dto

import com.example.chess.shared.api.IMove
import com.example.chess.shared.enums.PieceType
import java.io.Serializable

/**
 * @author v.peschaniy
 *      Date: 22.07.2019
 */
data class MoveDTO(
    override val from: PointDTO,
    override val to: PointDTO,
    override val pawnTransformationPieceType: PieceType? = null
) : Serializable, IMove {

    override fun toDTO() = this
}