fun ofAge(age: Int) {
	if (age >= 18) {
		println("You are of Age $age")
	} else {
		println("You don't of Age $age")
	}
}

fun shortOfAge(age: Int): Boolean = age >= 18


fun calculateBonus(office: String, salary: Float): Float {

    return if (office == "Developer") {
       salary * 1.2f
    } else if (office == "Analyst") {
        salary * 0.5f
    } else {
      salary * 2
    }
}

fun main() {

	ofAge(18)
    ofAge(11)
	ofAge(38)

    println("==============================")

    println("Salarinho com Bonus Developer Bonus " + calculateBonus("Developer", 1000f))
    println("Salarinho com Bonus Analyst Bonus " + calculateBonus("Analyst", 1000f))
    println("Salarinho com Bonus Young " + calculateBonus("Young", 1000f))

    println("==============================")

    val value = 10
    //Ternary at JAVA --  String str = value == 10 ? "Yes" : "No"

    val str = if (value == 10) "Yes" else "No"
    println(str)



}
