interface Evaluable {
    fun evaluatePerformance()
}

abstract class Employee: Evaluable{
    abstract val name: String
    abstract  val salary: Double
    abstract fun work()
    abstract fun calculateAnnualBonus(): Double
    override fun evaluatePerformance() {
        println("Eployee is evaluated")
    }

}

class Developer: Employee() {
    override val name = "Developer"
    override val salary = 2000.0
    override fun work() {
        println("Writing and reviewing code.")
    }

    override fun calculateAnnualBonus(): Double {
        return salary*0.1
    }

    override fun evaluatePerformance() {
        println("Developer is evaluated")
    }
}

class Manager: Employee() {
    override val name = "Manager"
    override val salary = 3000.0
    override fun work() {
        println("Supervising the team and planning projects.")
    }

    override fun calculateAnnualBonus(): Double {
        return salary*0.2
    }

    override fun evaluatePerformance() {
        println("Manager can't be evaluated")
    }
}

class Designer: Employee() {
    override val name = "Designer"
    override val salary = 2500.0
    override fun work() {
        println("Creating and optimizing visual design.")
    }

    override fun calculateAnnualBonus(): Double {
        return salary*0.15
    }
// si no se implementa el metodo - se ejecuta el de Employee

//    override fun evaluatePerformance() {
//        println("Designer is evaluated")
//    }

}


