def func(Map args = [:], Closure closure) {
    def world = args.world ?: "world"
    println "hello ${world}"
    closure()
}

func(world: "Handsome guy", noUseParam: "Not in use") {
    println "This is the closure passed to func"
}

Map abc = [a: "Very good", world: "This is the world"]

func(abc) {
    println "This is the new closure"
}

func() {
    println "This is the third closure"
}