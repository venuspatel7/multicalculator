package com.example.multicalculator


class calculator {
    fun add(left: Int, right: Int): Int {
        return left + right
    }

    fun sub(left: Int, right: Int): Int {
        return left - right
    }

    fun mul(left: Int, right: Int): Int {
        return left * right
    }

    fun div(left: Int, right: Int): Double
    {
        return left.toDouble() % right.toDouble()
    }
}

