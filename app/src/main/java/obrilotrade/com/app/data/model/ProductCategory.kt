package obrilotrade.com.app.data.model

import androidx.annotation.StringRes
import obrilotrade.com.app.R

enum class ProductCategory(@field:StringRes val titleRes: Int) {
    SMART_HOME(R.string.category_smart_home),
    KITCHEN(R.string.category_kitchen),
    CLEANING(R.string.category_cleaning),
    LIGHTING(R.string.category_lighting),
    BATHROOM(R.string.category_bathroom),
    STORAGE(R.string.category_storage),
}
