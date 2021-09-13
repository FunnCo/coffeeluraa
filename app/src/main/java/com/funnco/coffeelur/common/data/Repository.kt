package com.funnco.coffeelur.common.data

import com.funnco.coffeelur.common.data.model.CategoryModel
import com.funnco.coffeelur.common.data.model.CoffeeModel

class Repository {
    companion object {

        val orders: MutableList<CoffeeModel> = mutableListOf()

        fun getCategories(): List<CategoryModel> {
            val list = mutableListOf<CategoryModel>()
            list.add(
                CategoryModel(
                    "Coffee",
                    "https://cstor.nn2.ru/forum/data/forum/images/2019-10/238883973-drinks_coffee_grain_cup_493728_3840x2400.jpg"
                )
            )
            list.add(
                CategoryModel(
                    "Coffee",
                    "https://cstor.nn2.ru/forum/data/forum/images/2019-10/238883973-drinks_coffee_grain_cup_493728_3840x2400.jpg"
                )
            )
            list.add(
                CategoryModel(
                    "Coffee",
                    "https://cstor.nn2.ru/forum/data/forum/images/2019-10/238883973-drinks_coffee_grain_cup_493728_3840x2400.jpg"
                )
            )
            list.add(
                CategoryModel(
                    "Coffee",
                    "https://cstor.nn2.ru/forum/data/forum/images/2019-10/238883973-drinks_coffee_grain_cup_493728_3840x2400.jpg"
                )
            )
            return list
        }

        fun getCoffeeList(): List<CoffeeModel> {
            val list = mutableListOf<CoffeeModel>()
            list.add(
                CoffeeModel(
                    "Latte art speciality",
                    "Expresso with milk, beans, roasted by Jerx roaster Indonesian fresh milk makes best latte ever",
                    "Expresso with milk",
                    35.0,
                    "https://e7.pngegg.com/pngimages/725/492/png-clipart-latte-art-white-coffee-drink-coffee-tea-coffee.png"
                )
            )
            list.add(
                CoffeeModel(
                    "Long Black",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra laoreet nisi, sit amet tincidunt ex sollicitudin eu.",
                    "Stronger Americano",
                    35.0,
                    "https://e7.pngegg.com/pngimages/725/492/png-clipart-latte-art-white-coffee-drink-coffee-tea-coffee.png"
                )
            )
            list.add(
                CoffeeModel(
                    "Americano",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra laoreet nisi, sit amet tincidunt ex sollicitudin eu.",
                    "Diluted espresso",
                    35.0,
                    "https://e7.pngegg.com/pngimages/725/492/png-clipart-latte-art-white-coffee-drink-coffee-tea-coffee.png"
                )
            )
            list.add(
                CoffeeModel(
                    "Espresso",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum pharetra laoreet nisi, sit amet tincidunt ex sollicitudin eu.",
                    "Classic espresso",
                    35.0,
                    "https://e7.pngegg.com/pngimages/725/492/png-clipart-latte-art-white-coffee-drink-coffee-tea-coffee.png"
                )
            )

            return list
        }
    }
}