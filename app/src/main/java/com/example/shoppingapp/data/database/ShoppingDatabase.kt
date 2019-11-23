package com.example.shoppingapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.shoppingapp.data.dao.ShoppingDao
import com.example.shoppingapp.data.entities.Item
import com.example.shoppingapp.data.entities.MyItems

@Database(entities = [MyItems::class, Item::class], version = 1, exportSchema = false)
abstract class ShoppingDatabase : RoomDatabase() {

    abstract fun ShoppingDao() : ShoppingDao
}