package obrilotrade.com.app.di

import androidx.room.Room
import obrilotrade.com.app.data.database.RBLDRDatabase
import org.koin.dsl.module

private const val DB_NAME = "rbldr_db"

val databaseModule = module {
    single {
        Room.databaseBuilder(
            context = get(),
            klass = RBLDRDatabase::class.java,
            name = DB_NAME
        ).build()
    }

    single { get<RBLDRDatabase>().cartItemDao() }

    single { get<RBLDRDatabase>().orderDao() }
}