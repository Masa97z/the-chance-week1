fun ipv4(ip: String): Boolean {
    val segments = ip.split('.')
    if (segments.size != 4) return false

    for (segment in segments) {
        if (segment.isEmpty()) return false

        if (segment.length > 1 && segment[0] == '0') return false

        if (segment.any { !it.isDigit() }) return false

        val num = segment.toInt()

        if (num !in 0..255) return false
    }

    return true
}