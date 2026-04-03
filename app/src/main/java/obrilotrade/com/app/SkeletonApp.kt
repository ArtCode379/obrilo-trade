package obrilotrade.com.app

import android.app.Application
import obrilotrade.com.app.di.dataModule
import obrilotrade.com.app.di.dispatcherModule
import obrilotrade.com.app.di.viewModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class RBLDRApp : Application() {
    override fun onCreate() {
        super.onCreate()

        val appModules = dataModule + viewModule + dispatcherModule

        startKoin {
            androidLogger()
            androidContext(this@RBLDRApp)
            modules(appModules)
        }
    }
}