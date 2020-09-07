package com.bennyhuo.kotlin.coroutines.context

import kotlin.coroutines.CoroutineContext

class CoroutineName(val name: String): CoroutineContext.Element {
    // I don't understand the key. How it's working?
    companion object Key: CoroutineContext.Key<CoroutineName>

    override val key = Key

    override fun toString(): String {
        return name
    }
}