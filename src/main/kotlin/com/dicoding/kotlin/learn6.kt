fun main() {
//    val rangeInt = 1..10 step 2
//    val rangeToInt = 1.rangeTo(10)
//
//    rangeInt.forEach {
//        println("$it")
//    }
//    print("===============")
//    rangeToInt.forEach {
//        println("$it")
//    }
//
//    for (i in 1.rangeTo(10) step 4) {
//        println(i)
//    }
    val listOfInt = listOf(1,2,3, null, 5, null, 7)
    for (i in listOfInt) {
        if (i == null) {
            continue
        }
        print(i)
    }
    println()
    // label
    loop@ for(i in 1..10) {
        println("outside")

        for (j in 1.rangeTo(10) ) {
            println("inside")
            if (j % 2 == 1 ) {
                println("hayoo")
                // contoh break loop using label identifier
                // break@loop
            }
        }
    }
}

