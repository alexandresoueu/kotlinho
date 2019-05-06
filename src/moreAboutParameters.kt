fun address(street: String, city: String, state: String, zip: String, number: String = "") {
    println("Street: $street, $number")
    println("City: $city, State: $state - ZIP: $zip")
}

fun main() {
    address(city = "São Paulo", zip = "12345", state = "SP", number = "13", street = "")
    println("======================================")
    address(city = "São Paulo", zip = "54321", state = "SP", number = "14", street = "rainbow")
}