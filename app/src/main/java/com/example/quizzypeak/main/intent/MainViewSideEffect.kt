package com.example.quizzypeak.main.intent

import com.example.quizzypeak.common.mvicomponents.MviSideEffect

sealed class MainViewSideEffect() : MviSideEffect {

    data class ShowSnackBar(val snackBarMessage: String) : MainViewSideEffect()
}
