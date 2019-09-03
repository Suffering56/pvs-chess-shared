package com.example.chess.shared.dto

import java.io.Serializable

data class ChangesDTO(
    val position: Int,
    val lastMove: MoveDTO,
    val checkedPoint: PointDTO?
) : Serializable