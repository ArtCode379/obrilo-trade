package obrilotrade.com.app.ui.composable.screen.order

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import obrilotrade.com.app.R
import obrilotrade.com.app.data.entity.OrderEntity
import obrilotrade.com.app.ui.composable.shared.RBLDRContentWrapper
import obrilotrade.com.app.ui.composable.shared.RBLDREmptyView
import obrilotrade.com.app.ui.state.DataUiState
import obrilotrade.com.app.ui.viewmodel.OrderViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun OrdersScreen(
    modifier: Modifier = Modifier,
    viewModel: OrderViewModel = koinViewModel(),
) {
    val ordersState by viewModel.ordersState.collectAsState()

    OrdersContent(
        ordersState = ordersState,
        modifier = modifier,
    )
}

@Composable
private fun OrdersContent(
    ordersState: DataUiState<List<OrderEntity>>,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {

        RBLDRContentWrapper(
            dataState = ordersState,

            dataPopulated = {

            },

            dataEmpty = {
                RBLDREmptyView(
                    primaryText = stringResource(R.string.orders_state_empty_primary_text),
                    modifier = Modifier.fillMaxSize(),
                )
            },
        )
    }
}