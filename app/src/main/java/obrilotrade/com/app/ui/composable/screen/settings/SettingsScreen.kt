package obrilotrade.com.app.ui.composable.screen.settings

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import obrilotrade.com.app.R
import obrilotrade.com.app.ui.theme.NavyPrimary
import obrilotrade.com.app.ui.theme.OrangeAccent

@Composable
fun SettingsScreen(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val supportUrl = stringResource(R.string.customer_support_link)

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
    ) {
        // Header
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    brush = androidx.compose.ui.graphics.Brush.horizontalGradient(
                        colors = listOf(NavyPrimary, Color(0xFF2c3e50)),
                    ),
                    shape = RoundedCornerShape(20.dp),
                )
                .padding(24.dp),
        ) {
            Column {
                Text(
                    text = stringResource(R.string.company_name),
                    color = Color.White,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Home & Appliance Specialists",
                    color = Color.White.copy(alpha = 0.75f),
                    fontSize = 13.sp,
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Settings card
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 3.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
        ) {
            Column {
                SettingsRow(
                    label = stringResource(R.string.settings_screen_company_label),
                    value = stringResource(R.string.company_name),
                )

                Divider(color = Color(0xFFE0E0E0), thickness = 0.5.dp)

                SettingsRow(
                    label = stringResource(R.string.settings_screen_version_label),
                    value = stringResource(R.string.app_version),
                )

                Divider(color = Color(0xFFE0E0E0), thickness = 0.5.dp)

                SettingsRow(
                    label = stringResource(R.string.settings_screen_customer_support_label),
                    value = supportUrl,
                    valueColor = OrangeAccent,
                    clickable = true,
                    onClick = {
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(supportUrl))
                        context.startActivity(intent)
                    },
                    trailingIcon = R.drawable.link_svgrepo_com,
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "© 2024 OBRILO UK LTD. All rights reserved.",
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.align(Alignment.CenterHorizontally),
        )
    }
}

@Composable
private fun SettingsRow(
    label: String,
    value: String,
    valueColor: Color = NavyPrimary,
    clickable: Boolean = false,
    onClick: () -> Unit = {},
    trailingIcon: Int? = null,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(enabled = clickable, onClick = onClick)
            .padding(horizontal = 20.dp, vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.weight(1f),
        )
        Text(
            text = value,
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.SemiBold,
            color = valueColor,
        )
        if (trailingIcon != null) {
            Spacer(modifier = Modifier.size(4.dp))
            Icon(
                painter = painterResource(trailingIcon),
                contentDescription = null,
                tint = OrangeAccent,
                modifier = Modifier
                    .padding(start = 4.dp)
                    .size(16.dp),
            )
        }
    }
}
