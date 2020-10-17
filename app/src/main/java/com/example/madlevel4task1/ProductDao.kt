package com.example.madlevel4task1

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ProductDao {

    @Query("SELECT * FROM itemTable")
    suspend fun getAllProducts(): List<Item>

    @Insert
    suspend fun insertProduct(product: Item)

    @Delete
    suspend fun deleteProduct(product: Item)

    @Query("DELETE FROM itemTable")
    suspend fun deleteAllProducts()

}
