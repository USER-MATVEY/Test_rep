import kotlin.math.log

fun main(){
    val n:Double = readln().toDouble()
    val x:Double = readln().toDouble()

    val y = log(n, x)
    if (!y.isNaN()){
        println(y)
    }
    else{
        println("Целочисленный показатель не существет!")
    }
}