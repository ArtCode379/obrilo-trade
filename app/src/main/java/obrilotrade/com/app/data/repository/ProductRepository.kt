package obrilotrade.com.app.data.repository

import obrilotrade.com.app.R
import obrilotrade.com.app.data.model.Product
import obrilotrade.com.app.data.model.ProductCategory
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class ProductRepository {
    private val products: List<Product> = listOf(
        Product(
            id = 1,
            title = "Smart LED Strip Lights",
            description = "Color-changing LED strip with app control and voice assistant compatibility. 5m length, 16 million colors, works with Alexa and Google Home.",
            category = ProductCategory.SMART_HOME,
            price = 24.99,
            imageRes = R.drawable.product_1_led_strip,
        ),
        Product(
            id = 2,
            title = "Robot Vacuum Cleaner Pro",
            description = "Laser navigation, 2500Pa suction, auto-emptying station. Maps your home intelligently and cleans in systematic rows for complete coverage.",
            category = ProductCategory.CLEANING,
            price = 189.99,
            imageRes = R.drawable.product_2_robot_vacuum,
        ),
        Product(
            id = 3,
            title = "Air Fryer 5.5L",
            description = "Digital touchscreen, 8 preset programs, rapid air technology. Cook healthier meals with up to 75% less fat than traditional frying methods.",
            category = ProductCategory.KITCHEN,
            price = 79.99,
            imageRes = R.drawable.product_3_air_fryer,
        ),
        Product(
            id = 4,
            title = "Smart Thermostat",
            description = "Wi-Fi enabled, learning algorithm, energy saving reports. Reduces heating and cooling costs by up to 23% annually by learning your schedule.",
            category = ProductCategory.SMART_HOME,
            price = 129.99,
            imageRes = R.drawable.product_4_thermostat,
        ),
        Product(
            id = 5,
            title = "Cordless Stick Vacuum",
            description = "40-min runtime, HEPA filter, lightweight design. Converts to handheld for versatile cleaning on any surface including hard floors and carpets.",
            category = ProductCategory.CLEANING,
            price = 149.99,
            imageRes = R.drawable.product_5_cordless_vacuum,
        ),
        Product(
            id = 6,
            title = "Electric Kettle 1.7L",
            description = "Temperature control, keep-warm function, boil-dry protection. Six temperature presets for perfect coffee, tea, hot chocolate and more.",
            category = ProductCategory.KITCHEN,
            price = 34.99,
            imageRes = R.drawable.product_6_kettle,
        ),
        Product(
            id = 7,
            title = "Smart Doorbell Camera",
            description = "1080p HD, two-way audio, motion detection, night vision. Get real-time alerts on your phone whenever someone approaches your front door.",
            category = ProductCategory.SMART_HOME,
            price = 89.99,
            imageRes = R.drawable.product_7_doorbell,
        ),
        Product(
            id = 8,
            title = "Digital Bathroom Scale",
            description = "Body composition analysis, Bluetooth sync, tempered glass platform. Tracks weight, BMI, body fat, muscle mass and hydration levels.",
            category = ProductCategory.BATHROOM,
            price = 29.99,
            imageRes = R.drawable.product_8_scale,
        ),
        Product(
            id = 9,
            title = "Desk Lamp LED",
            description = "Adjustable color temperature, USB charging port, touch control dimmer. Five brightness levels and three color modes for optimal task lighting.",
            category = ProductCategory.LIGHTING,
            price = 42.99,
            imageRes = R.drawable.product_9_desk_lamp,
        ),
        Product(
            id = 10,
            title = "Stackable Storage Bins Set",
            description = "Set of 4, transparent heavy-duty plastic with snap-lock lids. Perfect for organizing pantries, garages, closets and home offices.",
            category = ProductCategory.STORAGE,
            price = 19.99,
            imageRes = R.drawable.product_10_storage,
        ),
        Product(
            id = 11,
            title = "Espresso Machine",
            description = "15-bar pressure, built-in conical grinder, steam milk frother. Create barista-quality espresso, cappuccino and latte from the comfort of home.",
            category = ProductCategory.KITCHEN,
            price = 259.99,
            imageRes = R.drawable.product_11_espresso,
        ),
        Product(
            id = 12,
            title = "Smart Plug Wi-Fi",
            description = "Voice control, scheduling, real-time energy monitoring. Control any device remotely and set automatic schedules to save energy and money.",
            category = ProductCategory.SMART_HOME,
            price = 14.99,
            imageRes = R.drawable.product_12_smart_plug,
        ),
    )

    fun observeById(id: Int): Flow<Product?> {
        val item = products.find { it.id == id }
        return flowOf(item)
    }

    fun getById(id: Int): Product? {
        return products.find { it.id == id }
    }

    fun observeAll(): Flow<List<Product>> {
        return flowOf(products)
    }
}
