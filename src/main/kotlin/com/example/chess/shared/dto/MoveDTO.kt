package com.example.chess.shared.dto

import com.example.chess.shared.enums.PieceType
import java.io.Serializable

/**
 * @author v.peschaniy
 *      Date: 22.07.2019
 */
data class MoveDTO(
    val from: PointDTO,
    val to: PointDTO,
    val pawnTransformationPieceType: PieceType? = null
) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MoveDTO

        if (from != other.from) return false
        if (to != other.to) return false
        if (pawnTransformationPieceType != other.pawnTransformationPieceType) return false

        return true
    }

    override fun hashCode(): Int {
        var result = from.hashCode()
        result = 31 * result + to.hashCode()
        result = 31 * result + (pawnTransformationPieceType?.hashCode() ?: 0)
        return result
    }
}