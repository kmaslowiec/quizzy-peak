package com.example.quizzypeak.main.mvimodel

import com.example.quizzypeak.common.mvicomponents.MviState
import com.example.quizzypeak.main.mvimodel.ResponseType.IDLE

data class MainViewState(
    val chatResponse: String = "",
    val triviaSubject: String = "",
    val isTriviaSubjectTooLong: Boolean = false,
    override val type: ResponseType = IDLE
) : MviState()
