package obrilotrade.com.app.di

import obrilotrade.com.app.ui.viewmodel.AppViewModel
import obrilotrade.com.app.ui.viewmodel.CartViewModel
import obrilotrade.com.app.ui.viewmodel.CheckoutViewModel
import obrilotrade.com.app.ui.viewmodel.RBLDROnboardingVM
import obrilotrade.com.app.ui.viewmodel.OrderViewModel
import obrilotrade.com.app.ui.viewmodel.ProductDetailsViewModel
import obrilotrade.com.app.ui.viewmodel.ProductViewModel
import obrilotrade.com.app.ui.viewmodel.RBLDRSplashVM
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModule = module {
    viewModel {
        AppViewModel(
            cartRepository = get()
        )
    }

    viewModel {
        RBLDRSplashVM(
            onboardingRepository = get()
        )
    }

    viewModel {
        RBLDROnboardingVM(
            onboardingRepository = get()
        )
    }

    viewModel {
        ProductViewModel(
            productRepository = get(),
            cartRepository = get(),
        )
    }

    viewModel {
        ProductDetailsViewModel(
            productRepository = get(),
            cartRepository = get(),
        )
    }

    viewModel {
        CheckoutViewModel(
            cartRepository = get(),
            productRepository = get(),
            orderRepository = get(),
        )
    }

    viewModel {
        CartViewModel(
            cartRepository = get(),
            productRepository = get(),
        )
    }

    viewModel {
        OrderViewModel(
            orderRepository = get(),
        )
    }
}