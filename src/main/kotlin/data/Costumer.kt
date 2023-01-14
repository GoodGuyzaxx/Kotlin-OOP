package data

open class Costumer(val name: String,val type: String, val balance:Long ) {
    constructor(name: String, type: String) : this(name, type , 0)
    constructor(name: String) : this(name, "Standard")
}

class PermiumCostumer : Costumer {
    constructor(name: String,type: String,balance: Long) : super(name,type, balance)
    constructor(name: String) : super(name, "Permium")
    constructor(name: String, balance: Long) : super(name,"Premium",0)
}

class ExecutiveCostumer(name: String, balance: Long) : Costumer(name,"Executive",balance){
    constructor(name: String) : this(name,0)
}
