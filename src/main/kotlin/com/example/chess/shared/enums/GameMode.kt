package com.example.chess.shared.enums

import java.io.Serializable

/**
 * @author v.peschaniy
 *      Date: 22.07.2019
 */
enum class GameMode : Serializable {
    UNSELECTED,
    PVP,
    AI,
    SINGLE,
    CONSTRUCTOR
}