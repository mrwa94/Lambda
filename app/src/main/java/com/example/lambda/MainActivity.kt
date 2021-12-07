package com.example.lambda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    // 1 -> display
    val fun1 = { print("Hello world!") }
    fun function1(){
        print("Hello world!")
    }

    // 2.1 -> greeting
    val fun21 = {name: String -> print("Hello $name")}
    fun function21(name: String){
        print("Hello $name")
    }

    // 2.2 -> square the number
    val fun22 = {num: Float -> print("${num * num}")}
    fun function22(num: Float){
        print("${num * num}")
    }

    // 3.1 -> is it even ?
    val fun41 = {num: Int -> num % 2 == 0}
    fun function41(num: Int): Boolean {
        return num % 2 == 0
    }

    // 3.2 ->
    val fun42 = {str1: String, str2: String -> str1 == str2}
    fun function42(str1: String, str2: String): Boolean {
        return str1 == str2
    }


    class Player(val name: String, val age: Int, val height: Float)





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var players = listOf(
            Player("Abdulrahman", 24, 177F),
            Player("James", 20, 170F),
            Player("Robert", 49, 182F),
            Player("John", 12, 150F),
            Player("Michael", 44, 168F),
            Player("William", 60, 173F),
            Player("David", 25, 190F),
            Player("Richard", 7, 129F),
            Player("Joseph", 14, 144F),
            Player("Daniel", 29, 165F),
            Player("Thomas", 22, 160F),
            Player("Anthony", 54, 158F),
            Player("Mark", 45, 181F),
            Player("Donald", 40, 176F),
            Player("Steven", 28, 177F),
            Player("Paul", 37, 192F),
            Player("Andrew", 39, 183F),
            Player("Kevin", 42, 171F),
            Player("George", 53, 166F),
            Player("Ronald", 68, 167F),
        )

        val sort = {player: List<Player> -> player.sortedBy { p -> p.height}.filter { it.height < 150 || it.height > 160}}
        players = sort(players)
        val display = {players.map { p -> Log.d("List", "${p.name} | ${p.age} | ${p.height}") } }
        display()


    }
}