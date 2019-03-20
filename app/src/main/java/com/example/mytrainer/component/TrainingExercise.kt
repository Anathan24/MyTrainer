package com.example.mytrainer.component

data class TrainingExercise(
    var series: Int,
    var reps: Int,
    var recoveryTime: Int
): Exercise() {

    constructor(): this(0, 0, 0)

    override fun toMap(): MutableMap<String, Any> {
        val map = mutableMapOf<String, Any>(
            "series" to series,
            "reps" to reps,
            "recoveryTime" to recoveryTime
        )
        map.putAll(super.toMap())
        return map
    }
}