package com.example.chess.shared.dto

import com.example.chess.shared.enums.GameMode
import java.io.Serializable

/**
 * @author v.peschaniy
 *      Date: 23.07.2019
 */
data class GameDTO(
    val id: Long,
    val position: Int,
    val mode: GameMode
) : Serializable