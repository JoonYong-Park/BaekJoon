import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    var n = sc.nextInt()
    var k = sc.nextInt()

    var arr = BooleanArray(n+1){false}
    var cnt = 0

    loop@ for(i in 2..n ){
        for(j in i .. n step i){
            if(!arr[j]){
                arr[j] = true
                cnt++
                
                if(cnt == k){
                    println(j)
                    break@loop
                }
            }
        }
    }
}