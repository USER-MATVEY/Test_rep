fun main(){
    val num1 = readln()
    val num2 = readln()
    val num_str = num1 + num2
    if (num_str.toInt() % 2 == 0 && num_str.reversed().toInt() % 2 == 0){
        println("Создать нечётное число невозможно")
    }
    else{
        println("Можно создать нечётное число")
    }
}