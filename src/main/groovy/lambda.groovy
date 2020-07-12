def lambdaWithClosure(Closure closure){
    println "Hello world"
    closure()
}


lambdaWithClosure { println "This is the lambda method"}