package com.example.chess.shared.dto

import java.io.Serializable

data class ChangesDTO(
    val position: Int,
    val lastMove: MoveDTO?,             // может быть null для constructorMove
    val additionalMove: MoveDTO?,       // в случае если произошла рокировка или взятие на проходе клиенту нужна дополнительная информация, чтобы корректно выполнить ход
    val checkedPoint: PointDTO?
) : Serializable