String a = "5"
int b = 5
def c = "${b}"
assert c.getClass() in GString
assert a.getClass() in String
println c == a

