package lesson2

fun main() {
    val workersCount = 50
    val workerSalary = 30000

    val studentsCount = 30
    val studentSalary = 20000

    val totalWorkersAmount = workersCount * workerSalary
    val totalAmount = totalWorkersAmount + studentsCount * studentSalary
    val averageSalary = totalAmount / (workersCount + studentsCount)

    println("Total workers salary: $totalWorkersAmount roubles")
    println("Total salary: $totalAmount roubles")
    println("Average salary: $averageSalary roubles")
}