fun main(){
    var input_num: Int = readln().toInt()
    var out_str: String = ""

    while (input_num != 0){
        out_str += "${input_num % 2}"
        input_num /= 2
    }
    println(out_str.reversed())



}