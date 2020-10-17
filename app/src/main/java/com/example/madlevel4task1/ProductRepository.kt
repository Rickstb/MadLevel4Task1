package com.example.madlevel4task1

import android.content.Context

class ProductRepository(context: Context) {

    private val productDao: ProductDao

    init {
        val database = ShoppingListRoomDatabase.getDatabase(context)
        productDao = database!!.productDao()
    }

    suspend fun getAllProducts(): List<Item> {
        return productDao.getAllProducts()
    }

    suspend fun insertProduct(product: Item) {
        productDao.insertProduct(product)
    }

    suspend fun deleteProduct(product: Item) {
        productDao.deleteProduct(product)
    }

    suspend fun deleteAllProducts() {
        productDao.deleteAllProducts()
    }

}
