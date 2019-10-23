fun main(){
    val options = arrayOf("rock", "paper", "scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}

fun getGameChoice(optionsParam: Array <String>) =
    optionsParam [( Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array <String>) :String {
    var badChoice = true
    var userChoice = ""
    while(badChoice) {
        print("Please enter one of the following:")
        for (item in optionsParam)
            print("$item")
        println(".")
        val userInput = readLine()
        if(userInput !=null && userInput in optionsParam) {
            badChoice = false
            userChoice = userInput
        }
        if(badChoice) println ("You must enter a valid choice")

    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice: String) {
    val result: String
    if (userChoice == gameChoice) result = "Tie!"
    else if ((userChoice == "rock" && gameChoice == "scissors") ||
            (userChoice == "paper" && gameChoice  == "rock")||
            (userChoice == "scissors" && gameChoice  == "paper")) result = "You win!"
    else result = "You lose!"
    println("You chose $userChoice. I chose $gameChoice. $result")
}