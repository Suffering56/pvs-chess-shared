package com.example.chess.shared.dto

import java.io.Serializable

/**
 * @author v.peschaniy
 *      Date: 23.07.2019
 */
data class PointDTO(
    val row: Int,
    val col: Int
) : Serializable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PointDTO

        if (row != other.row) return false
        if (col != other.col) return false

        return true
    }

    override fun hashCode(): Int {
        var result = row
        result = 31 * result + col
        return result
    }
}

