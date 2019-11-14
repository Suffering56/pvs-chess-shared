package com.example.chess.shared.api

import com.example.chess.shared.dto.PointDTO

/**
 * @author v.peschaniy
 *      Date: 11.11.2019
 */

interface IPoint {
    val row: Int
    val col: Int

    fun toDTO(): PointDTO
}