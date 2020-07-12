void methodA(Object obj){
    println "Object method ${obj}"
}

void methodA(String obj){
    println "String method ${obj}"
}


Object a = "Hello world"
// "String method ${obj}"
methodA(a)
