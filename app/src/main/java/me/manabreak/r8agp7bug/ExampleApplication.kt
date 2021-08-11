package me.manabreak.r8agp7bug

import android.app.Application
import android.util.Log
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import me.manabreak.r8agp7bug.data.Response

class ExampleApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        val objectMapper = ObjectMapper()
        objectMapper.registerModule(KotlinModule())

        val response = objectMapper.readValue("{\"result\": \"OK\"}", Response::class.java)
        Log.w("EXAMPLE", "Response is: $response")
    }
}