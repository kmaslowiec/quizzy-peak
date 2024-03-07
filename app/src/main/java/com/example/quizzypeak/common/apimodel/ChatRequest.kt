package com.example.quizzypeak.common.apimodel

import com.example.quizzypeak.common.constant.CHAT_GPT_MODEL_ID
import com.example.quizzypeak.common.constant.CHAT_GPT_TEMPERATURE

data class ChatRequest(
    val messages: List<Message>,
    private val model: String = CHAT_GPT_MODEL_ID,
    private val temperature: Double = CHAT_GPT_TEMPERATURE,
)
