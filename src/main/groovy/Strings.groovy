String a = 'single quoted string'
String b = "double quoted string"
String c = "GString with ${1 + 3}"
String d = ''' multiple line string
line 2
lint 3
'''
String e = """
multi line GString ${1+4}
"""

// patten
String f = /[0-9]*/

println f
