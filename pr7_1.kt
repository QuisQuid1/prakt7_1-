fun main() {
    try{
        println("Введите первый член прогрессии")
        var a= readLine()!!.toInt()
        println("Введите пятый член прогрессии")
        var b= readLine()!!.toInt()
        println("Введите номер члена прогрессии N")
        var n= readLine()!!.toInt()
        val d =(b-a)/4
        val m= a+(n-1)*d
        val sum=((a+m)*n)/2
        println("Величина члена прогрессии с номер N: $m, сумма N членов: $sum")
    }catch (e:Exception){println("Что то не то")}
}