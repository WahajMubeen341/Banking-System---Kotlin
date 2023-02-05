
/** FINAL PROJECT*/

var accountType = ""
var userChoice = 0
var accountBalance = 0


fun main(){


    var accountType = ""
var userChoice = 0
var accountBalance = 0

       fun genUserInput(){
    while(accountType == ""){
        var n = (1..5).random()
        println("Selected option is = " + n)
          userChoice = n

        when(n){
            1 -> accountType = "debit"
            2 -> accountType = "credit"
            3 -> accountType = "checking"
            else -> continue
        }
    }
    println("You have created a $accountType account" )
}

       fun deposit(amount: Int): Int{
    accountBalance += amount
    println("You have deposited $amount dollars in your account, your new balance is $accountBalance dollars")
    return accountBalance
}


fun  creditDeposit(amount: Int): Int{
    if(accountBalance == 0){
        println("You don't have anything to pay, your credit balance is $accountBalance")
        return 0
    }
    else if ( amount > accountBalance){
        println("Deposit failed, you tried to pay off an amount greater than the credit balance. The checking balance is ${accountBalance} dollars" )
                return 0
    }
    else if (amount == accountBalance){
        return amount
    }
    else{
        deposit(amount)
        return amount
    }
}

    fun debitWithdraw(amount : Int) : Int{

    if(accountBalance == 0){
    println("Cannot withdraw money, no money in account!")
    return 0
    }
    else if(accountBalance < amount) {
        println("Not enough money on this account! The checking balance is ${accountBalance} dollars.")
        return 0
    }
    else{
        	accountBalance -= amount
            return accountBalance
    }

}



    //part 1 of final project
    println("Welcome to banking app")
    println("What type of account would you like to create?")
    println("1. Debit account")
    println("2. Credit account")
    println("3. Checking account")
    println("Choose an option(1 ,2 or 3)")
    genUserInput()


    //part 2 of final project

    accountBalance = (1..1000).random()
    println("Account balance = $accountBalance")

    val money = (0..1000).random()
    println("Amount to deposit/withdraw $money")


    var output = 0

//     output = withdraw(money)

    output = debitWithdraw(money)
    if(output != 0){
   	println("You have withdrawn $money dollars , you remaining account balance = $output)")}

    output = deposit(money)
    print(output)





    fun withdraw(amount : Int) : Int{
    accountBalance = accountBalance - amount

    return accountBalance
}

}



// fun main() {
//     var score = 0;
// println(score)
//     score += getPoints(10, 1)
// println(score)
//     score += getPoints(20, 2)
// println(score)
//     score += getPoints(-10, 1)
// println(score)
//     score += getPoints(5, 3)
// println(score)
//     score += getPoints(-15, 2)
// }

// //Add your function below this line

// fun getPoints(basePoints: Int, boost: Int) : Int{
//     return basePoints * boost
// }