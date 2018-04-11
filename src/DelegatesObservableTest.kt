import kotlin.properties.Delegates

val lazyData: Double by lazy {
    println("Initializing lazyData")
    2.0
}

var observableData: String by Delegates.observable("Initial value") {
    property, oldValue, newValue ->
    println("${property.name}: $oldValue -> $newValue")
}

var vetoableData: Int by Delegates.vetoable(0) {
    property, oldValue, newValue ->
    println("${property.name}: $oldValue -> $newValue")
    newValue >= 0
}

fun main(args: Array<String>) {
    println(lazyData)
    println(lazyData)

    println()

    observableData = "New value"
    observableData = "Another value"

    println()

    vetoableData = -1
    println("vetoableData = $vetoableData")
    vetoableData = 1
    println("vetoableData = $vetoableData")
}