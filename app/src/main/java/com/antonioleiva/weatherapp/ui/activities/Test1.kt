package com.antonioleiva.weatherapp.ui.activities

import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.yield
import org.jetbrains.anko.custom.async
import org.jetbrains.anko.doAsync
import java.io.File
import java.util.Arrays.asList
import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock
import kotlin.coroutines.experimental.buildSequence

object Test1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val world:String="a b c d a b c d"
        val x=1000_100
        val file: File?=  File(world).takeIf{
            it.exists()
        }?:null

//        for ((index,element) in args.withIndex()){
//
//        }
         val list= listOf<String>("abc","acd","bcd","cde","def")
        var count=0
       lo@for (element in list){
             println(element)
            if (element=="cde")break@lo
        }
        val sum2 = { x: Int, y: Int -> x + y }
        val sum1: (Int, Int) -> Int = { x, y -> x + y }

        val sum : Int.(other: Int) -> Int={
            other -> this+other
        }

       val o:Int=1
        o.sum(1)
        list.forEach {
            if (it.equals(""))return@forEach

        }

        list.forEach(fun(element:String){
          print(element)
        })


         list.filter { it.startsWith("a") }.sortedBy { it }.map { it.toUpperCase() }.forEach(::print)

        doAsync{



}


     val student=Student("xiaofei",23)
      with(student){
        print(name)
        print("$age")
     }


//        val image by bindRe

//      val boxS= Box("spf")
//        boxS.value


        val a:Int=15
        val b:Int=15
        val c:Int=a sha b

        abs(s1 = null,s3 = "")

        val list1= arrayOf("a","b","c")
        val list2= asList<String>("bc",*list1)

        val s4= a("spf")

        val ab= lock(body={lockBody()})


    }

    fun adsa(bs:Box<String>){

    }

    infix fun Int.sha(x:Int):Int{
         return this+x
    }

    fun abs(s1:String?=null,s2:String="spf",s3:String):String{
        return "$s1 $s2 $s3"
    }

    fun a(af:String) :String{
        fun b(bf:String):String{
            return bf
        }
    return    b(af)
    }

//    tailrec fun trick(x: Int):Int{
//     if(x==0){
//
//      }else{
//        x+trick(x-1)
//    }
//    }

    fun lockBody():String{
      return "abc"
    }

    fun <T> lock(lock:Lock=ReentrantLock(), body: () -> T): T {
        lock.lock()
        try {
            return body()
        }
        finally {
            lock.unlock()
        }
    }

    fun xiecheng(){
        val fibonacciSeq = buildSequence {
            var a = 0
            var b = 1
            yield(1)
            while (true) {
                yield(a + b)
                val tmp = a + b
                a = b
                b = tmp
            }
        }
        println(fibonacciSeq.take(8).toList())

    }


}

data class Student(var name:String,var age:Int)
