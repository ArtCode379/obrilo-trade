package obrilotrade.com.app.data.repository

import obrilotrade.com.app.data.datastore.RBLDROnboardingPrefs
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

class RBLDROnboardingRepo(
    private val rbldrOnboardingStoreManager: RBLDROnboardingPrefs,
    private val coroutineDispatcher: CoroutineDispatcher,
) {

    fun observeOnboardingState(): Flow<Boolean?> {
        return rbldrOnboardingStoreManager.onboardedStateFlow
    }

    suspend fun setOnboardingState(state: Boolean) {
        withContext(coroutineDispatcher) {
            rbldrOnboardingStoreManager.setOnboardedState(state)
        }
    }
}