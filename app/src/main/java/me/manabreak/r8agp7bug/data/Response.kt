package me.manabreak.r8agp7bug.data

import com.fasterxml.jackson.annotation.JsonSetter

open class Response {

    @JsonSetter
    fun setResult(result: Result?) {
        println("Not really setting, just testing.")
    }
}