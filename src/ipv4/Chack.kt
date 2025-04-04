package ipv4

import ipv4


fun main() {
        println(check("when the passing", ipv4("0.0.0.0"), true))
        println(check("when is passing", ipv4("192.168.1.1"), true))
        println(check("when is passing", ipv4("255.255.255.255"), true))
        println(check("the digit upper 255", ipv4("256.256.256.256"), false))
        println(check("Contains a letter", ipv4("df.er.w.1c"), false))
        println(check("contains a special character", ipv4("192.10.12.1#"), false))
        println(check("out of range",ipv4 ("256.256.256.256"), false))
        println(check("entered 3 segment", ipv4("192.168.1."), false))
        println(check("entered negative value", ipv4("192.168.1.-1"), false))
        println(check("enter empty segment", ipv4("192..1.1"), false))
        println(check("more four segment",ipv4 ("192.168.1.1.1"), false))
        println(check("zero in first segment",ipv4 ("01.1.1.1"), false))
        println(check("empty",ipv4 (""), false))




    }
fun check(testCase: String, actual: Boolean, expected: Boolean) :String{
    val result = if (actual == expected) "True" else "False"
    return " $testCase --> $result"
}


