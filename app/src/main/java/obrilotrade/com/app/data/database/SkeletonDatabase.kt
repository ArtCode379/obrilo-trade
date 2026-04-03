package obrilotrade.com.app.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import obrilotrade.com.app.data.dao.CartItemDao
import obrilotrade.com.app.data.dao.OrderDao
import obrilotrade.com.app.data.database.converter.Converters
import obrilotrade.com.app.data.entity.CartItemEntity
import obrilotrade.com.app.data.entity.OrderEntity

@Database(
    entities = [CartItemEntity::class, OrderEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class RBLDRDatabase : RoomDatabase() {

    abstract fun cartItemDao(): CartItemDao

    abstract fun orderDao(): OrderDao
}