import kotlin.math.sqrt
fun main(){
    try{
        println("Введите значение a")
        var a= readLine()!!.toDouble()
        println("Введите значение b")
        var b= readLine()!!.toDouble()
        println("Введите значение c")
        var c= readLine()!!.toDouble()
        val p=(a+b+c)/2
        val r= sqrt(((p-a)*(p-b)*(p-c))/p)
        val R=(a*b*c)/(4* sqrt(p*(p-a)*(p-b)*(p-c)))
        println("Радиус вписанной окружности r: $r, радиус описанной окружности R: $R")
    }catch (e:Exception){println("Что то не то")}
}