package com.example.chess.shared.dto

import com.fasterxml.jackson.annotation.JsonIgnore
import java.io.Serializable

data class ChangesDTO(
    val position: Int,
    val lastMove: MoveDTO,
    val additionalMove: MoveDTO?,       // в случае если произошла рокировка или взятие на проходе клиенту нужна дополнительная информация, чтобы корректно выполнить ход
    val checkedPoint: PointDTO?
) : Serializable {

    @JsonIgnore
    fun isEmpty() = position == EMPTY_CHANGES_POSITION

    companion object {

        private const val EMPTY_CHANGES_POSITION = -1

        @JsonIgnore
        val EMPTY: ChangesDTO = ChangesDTO(
            EMPTY_CHANGES_POSITION,
            MoveDTO(
                PointDTO(0, 0),
                PointDTO(0, 0),
                null
            ),
            null,
            null
        )
    }
}