import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    var n = sc.nextInt()
    var arr = Array(n){Array(2){0}}
    var end = 0
    var cnt = 0
    
    for(i in 0 until n){
        arr[i][0] = sc.nextInt() // 시작시간
        arr[i][1] = sc.nextInt() // 종료시간
    }
    arr.sortWith(compareBy({it[1]},{it[0]}))
    
    for(i in 0 until n){
        if(arr[i][0] >= end){
            end = arr[i][1]
            cnt++
        }
    }
    println(cnt)
}