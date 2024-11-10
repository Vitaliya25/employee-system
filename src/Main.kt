//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args:Array<String>) {

    val employees = arrayOf(Developer(),
                            Manager(),
                            Designer())

    for (item in employees){
        println(item.name + " information: ")
        println("Salario = " + item.salary)
        item.work()
        println("bonus = ${item.calculateAnnualBonus()}")
        if(item is Evaluable) {
            item.evaluatePerformance()
        }
        println()

        for (item in employees){
            if(item !is Manager){
                item.evaluatePerformance()
            }
        }
    }
}