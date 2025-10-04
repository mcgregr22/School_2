class Person (
    var name: String,
    var address: String,
    var phoneNumber: String
    ){

    open fun display(){
        println("name = $name, " +
                "address = $address, " +
                "phoneNumber = $phoneNumber")
    }
}
