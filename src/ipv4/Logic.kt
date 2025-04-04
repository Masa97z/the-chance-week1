fun ipv4(ip: String): Boolean {
    val segments = ip.split('.')
    if (segments.size != 4) return false

    for (segment in segments) {
        if (segment.isEmpty()) return false

        if (segment.length > 1 && segment[0] == '0') return false

        for (char in segment) {
            if (!char.isDigit()) return false
        }

        val num = segment.toInt()
        if (num < 0 || num > 255) return false
    }

    return true
}