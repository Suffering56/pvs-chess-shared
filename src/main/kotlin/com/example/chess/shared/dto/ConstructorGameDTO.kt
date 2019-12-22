package com.example.chess.shared.dto

import com.example.chess.shared.ArrayTable
import java.io.Serializable

class ConstructorGameDTO(
    val gameId: Long,
    val position: Int,
    val matrix: ArrayTable<CellDTO>,
    val checkedPoint: PointDTO?
) : Serializable