package com.example.quizzypeak.common.apimodel

data class Usage(
    val completion_tokens: Int,
    val prompt_tokens: Int,
    val total_tokens: Int,
)