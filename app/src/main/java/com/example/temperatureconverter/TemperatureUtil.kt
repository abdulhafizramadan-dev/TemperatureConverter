package com.example.temperatureconverter

fun convertToFahrenheit(celsius: String): String {
    return celsius.toDoubleOrNull()?.let {
        (it * 9 / 5) + 32
    } . toString()
}

fun convertToCelsius(fahrenheit: String): String {
    return fahrenheit.toDoubleOrNull()?.let {
        (it - 32) * 5 / 9
    } . toString()
}