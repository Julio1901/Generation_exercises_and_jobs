import sun.beans.editors.FloatEditor

/*Enunciado
*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando
* dados sobre o salário e número de filhos. A prefeitura deseja saber:
*
* a) média do salário da população;
* b) média do número de filhos;
* c) maior salário;
* d) percentual de pessoas com salário até R$100,00.
*
* */

//Global variable
val validate = ValidatesUserInteractions()

fun main() {

    val NUMBER_OF_POPULATION = 3
    val LOW_INCOME_DELIMITER = 100.0f
    var individualSalary : Float
    var numberOfChildren : Int
    var totalChildrenPopulation = 0
    var higherSalary = 0.0f
    var sumSalaryPopulation = 0.0f
    var numberOfPeopleWithsalaryUpToOneHundred = 0
    var percentageOfPeopleWhithSalaryUpToOneHundred : Float
    var averageWage : Float
    var averageChildren : Int


    for (i in Numbers.ONE.number .. NUMBER_OF_POPULATION){

        individualSalary = validate.requestSalary()

        if (individualSalary > higherSalary){
            higherSalary = individualSalary
        }

        if (individualSalary <= LOW_INCOME_DELIMITER){
            numberOfPeopleWithsalaryUpToOneHundred++
        }

        sumSalaryPopulation+= individualSalary


        do {
            println("Please, enter the number of children you have. ")
            numberOfChildren = validate.requestNumber()
        }while (!validate.validatePositiveNumbers(numberOfChildren))

        totalChildrenPopulation+= numberOfChildren
    }

    averageWage = sumSalaryPopulation / NUMBER_OF_POPULATION
    percentageOfPeopleWhithSalaryUpToOneHundred = ((100 / NUMBER_OF_POPULATION) * numberOfPeopleWithsalaryUpToOneHundred).toFloat()
    averageChildren = totalChildrenPopulation / NUMBER_OF_POPULATION

    println("Search result: \n" +
            "Average salary of the population: R$$averageWage"+
            "\nAverage number of children is: $averageChildren children per inhabitant"+
            "\nHigher salary: $higherSalary"+
            "\nPercentage of people with a salary of up to R$ 100.00: $percentageOfPeopleWhithSalaryUpToOneHundred %"
    )

}





