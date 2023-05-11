// let scope function
package _10_letScopeFunction

interface Department
class HumanResources : Department {
    fun doHire(): Boolean = TODO()
}
class SoftwareDevelopment : Department {
    fun doMakeNewSoftware(): Boolean = TODO()
}

class Employee {
    fun getDepartment(): Department = TODO()
}

fun askAboutAvailableJob(employees: List<Employee>) {
    for (employee in employees) {
        val department = employee.getDepartment()
        if (department is HumanResources && department.doHire()) {
            println("$employee do you have free positions?")
            break
        }
        // more code goes here
    }
}

// Any questions?
