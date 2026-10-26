package com.dat

import androidx.compose.runtime.mutableStateOf

data class Product(
    val name:String,
    var count:Int,
    val cost:Int,
) {
}
fun Product.ProductName(): Product {
    return this.copy(name="Potato")
}

fun Product.ProductCount(): Product{
   return this.copy(count = 8)

}

fun Product.ProductCost(): Product{
    return   this.copy(cost=50)
}

fun Product.NewProduct(): Product{
    return Product(
        name = "cucumber",
        count =5,
        cost = 40
    )

}