package com.example.quizzypeak.main.intent

import com.example.quizzypeak.common.mvicomponents.MviIntent

sealed class MainViewIntent : MviIntent {
    data object AskChat : MainViewIntent()
}
