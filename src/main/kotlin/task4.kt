fun main(){
    val task : List<String> = readln().split(" ")
    if (task[2] == "+"){
        println("${task[0].toInt() + task[1].toInt()}")
    }
    else if (task[2] == "-"){
        println("${task[0].toInt() - task[1].toInt()}")
    }
    else if (task[2] == "/"){
        println("${task[0].toInt() / task[1].toInt()}")
    }
    else if (task[2] == "*"){
        println("${task[0].toInt() * task[1].toInt()}")
    }
    else{
        println("${task[0].toInt()}, ${task[1].toInt()} + Неизвесная операция")
    }

}