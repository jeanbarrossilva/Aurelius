object Metadata {
    const val ARTIFACT = "aurelius-android"
    const val GROUP = "com.jeanbarrossilva.aurelius"
    const val NAMESPACE = GROUP

    fun namespace(suffix: String): String {
        return "$NAMESPACE.$suffix"
    }
}
