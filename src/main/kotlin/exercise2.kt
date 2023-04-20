//write a program
//you enter your age
//it shows the year ou were born
import  java.time.Year

fun main(args: Array<String>) {
    println("___Enter your age___")

    var age = readln().toIntOrNull()

    if (age == null){
        println("Invalid Age")
    }else {
        var currentYear = Year.now().value
        var birthYear = currentYear - age
        println("Year of birth is $birthYear")
    }

    
}