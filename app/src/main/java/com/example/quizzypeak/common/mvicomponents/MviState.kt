package com.example.quizzypeak.common.mvicomponents

import com.example.quizzypeak.main.mvimodel.ResponseType

abstract class MviState {
    abstract val type: ResponseType
}
