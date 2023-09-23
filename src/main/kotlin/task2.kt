fun main() {
    val input_str: String = readln()
    val map = mutableMapOf<Char, Int>()
    var count = 1
    map[input_str[0]] = count

    for(item in 1..input_str.substring(1).length){
        if (input_str[item] in map.keys){
            count = map[input_str[item]]!!
            count++
            map[input_str[item]] = count
        }
        else{
            map[input_str[item]] = 1
        }
    }
    println(map)
}