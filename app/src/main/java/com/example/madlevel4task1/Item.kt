package com.example.madlevel4task1

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "itemTable")
data class Item(

    @ColumnInfo(name = "name")
    var productName: String,

    @ColumnInfo(name = "quantity")
    var productQuantity: Short, // Int

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null)