package com.example.quizzypeak.common.apimodel

data class Choice(
    val finish_reason: String,
    val index: Int,
    val logprobs: Any,
    val message: MessageResponse,
)