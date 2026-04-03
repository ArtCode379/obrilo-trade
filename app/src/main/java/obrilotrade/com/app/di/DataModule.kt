package obrilotrade.com.app.di

import obrilotrade.com.app.data.repository.CartRepository
import obrilotrade.com.app.data.repository.RBLDROnboardingRepo
import obrilotrade.com.app.data.repository.OrderRepository
import obrilotrade.com.app.data.repository.ProductRepository

import org.koin.core.qualifier.named
import org.koin.dsl.module

val dataModule = module {
    includes(databaseModule, dataStoreModule)

    single {
        RBLDROnboardingRepo(
            rbldrOnboardingStoreManager = get(),
            coroutineDispatcher = get(named("IO"))
        )
    }

    single { ProductRepository() }

    single {
        CartRepository(
            cartItemDao = get(),
            coroutineDispatcher = get(named("IO"))
        )
    }

    single {
        OrderRepository(
            orderDao = get(),
            coroutineDispatcher = get(named("IO"))
        )
    }
}