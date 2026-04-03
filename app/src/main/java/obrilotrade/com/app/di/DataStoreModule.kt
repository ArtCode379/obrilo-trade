package obrilotrade.com.app.di

import obrilotrade.com.app.data.datastore.RBLDROnboardingPrefs
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val dataStoreModule = module {
    single { RBLDROnboardingPrefs(androidContext()) }
}