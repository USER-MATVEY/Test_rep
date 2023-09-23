fun main() {
    val input_str: String = readln()
    var count = 1
    var out_str = ""
    var cur_ch = input_str[0]
    println(input_str)
    for(item in 1..input_str.substring(1).length){
        if (cur_ch == input_str[item]){
            count++
        }
        else {
            if (count > 1) {
                out_str += "$cur_ch$count"
            } else {
                out_str += cur_ch
            }
            count = 1
            cur_ch = input_str[item]
        }
    }
    if (count > 1) {
        out_str += "$cur_ch$count"
    } else {
        out_str += cur_ch
    }
    println(out_str)



}