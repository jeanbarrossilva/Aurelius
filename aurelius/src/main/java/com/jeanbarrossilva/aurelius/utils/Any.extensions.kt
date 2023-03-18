package com.jeanbarrossilva.aurelius.utils // ktlint-disable filename

/**
 * Returns the result of the given [transform] if the result of [condition] is `true`; otherwise,
 * returns the receiver.
 *
 * @param condition Returns whether or not the result of [transform] will get returned.
 * @param transform Transformation to be made to the receiver.
 **/
inline fun <T> T.`if`(condition: T.() -> Boolean, transform: T.() -> T): T {
    return `if`(condition(), transform)
}

/**
 * Returns the result of the given [transform] if the [condition] is `true`; otherwise, returns the
 * receiver.
 *
 * @param condition Determines whether or not the result of [transform] will get returned.
 * @param transform Transformation to be made to the receiver.
 **/
inline fun <T> T.`if`(condition: Boolean, transform: T.() -> T): T {
    return if (condition) transform() else this
}

/**
 * Makes the property whose name equals [name] accessible and returns its value.
 *
 * @param name Name of the property whose value will be forcefully obtained.
 **/
@Suppress("UNCHECKED_CAST")
fun <T> Any.reflect(name: String): T {
    return this::class.java.getDeclaredField(name).apply { isAccessible = true }.get(this) as T
}
