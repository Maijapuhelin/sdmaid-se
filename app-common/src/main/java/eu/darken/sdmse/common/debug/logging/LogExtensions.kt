package eu.darken.sdmse.common.debug.logging

fun logTag(vararg tags: String): String {
    val sb = StringBuilder("\uD83E\uDDF9:")
    for (i in tags.indices) {
        sb.append(tags[i])
        if (i < tags.size - 1) sb.append(":")
    }
    return sb.toString()
}