package com.example.chess.shared.dto

import com.example.chess.shared.ArrayTable
import com.example.chess.shared.enums.Side
import java.io.Serializable

/**
 * @author v.peschaniy
 *      Date: 22.07.2019
 */
data class ChessboardDTO(
    val position: Int,
    val matrix: ArrayTable<CellDTO>,
    val underCheckSide: Side?
) : Serializable {
    
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ChessboardDTO

        if (position != other.position) return false
        if (!matrix.contentDeepEquals(other.matrix)) return false
        if (underCheckSide != other.underCheckSide) return false

        return true
    }

    override fun hashCode(): Int {
        var result = position
        result = 31 * result + matrix.contentDeepHashCode()
        result = 31 * result + (underCheckSide?.hashCode() ?: 0)
        return result
    }
}