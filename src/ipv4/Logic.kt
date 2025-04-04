fun ipv4(ip: String): Boolean {
    val segments = ip.split('.')
    if (segments.size != 4) return false

    for (segment in segments) {
        // Check for empty segments
        if (segment.isEmpty()) return false

        // Check for leading zeros (unless it's a single zero)
        if (segment.length > 1 && segment[0] == '0') return false

        // Check if segment contains any non-digit characters
        if (segment.any { !it.isDigit() }) return false

        // Convert to number and check range
        val num = segment.toInt()
        if (num < 0 || num > 255) return false
    }

    return true
}