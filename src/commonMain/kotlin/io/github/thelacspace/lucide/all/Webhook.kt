package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Webhook") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,16.98f)
                lineTo(12.01f,16.98f)
                curveTo(10.91f,16.98f,10.06f,17.92f,9.530001f,18.88f)
                curveTo(8.666757f,20.499804f,6.811878f,21.324234f,5.0310707f,20.879623f)
                curveTo(3.2502627f,20.435015f,2.000573f,18.83547f,2.0f,17.0f)
                curveTo(2.01f,16.3f,2.2f,15.6f,2.57f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,17.0f)
                lineTo(9.13f,11.219999f)
                curveTo(9.66f,10.249999f,9.2300005f,9.039999f,8.63f,8.119999f)
                curveTo(7.859055f,6.8870263f,7.8179717f,5.3327875f,8.522703f,4.060808f)
                curveTo(9.227435f,2.7888288f,10.566955f,1.9995041f,12.021113f,1.9993359f)
                curveTo(13.475272f,1.9991677f,14.814975f,2.7881827f,15.52f,4.059999f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,6.0f)
                lineTo(15.13f,11.73f)
                curveTo(15.66f,12.7f,16.9f,13.0f,18.0f,13.0f)
                curveTo(20.202156f,13.009849f,21.982151f,14.797822f,21.982151f,17.0f)
                curveTo(21.982151f,19.202179f,20.202156f,20.990152f,18.0f,21.0f)
            }
}

public val LucideIcons.All.WebhookDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Webhook: ImageVector
    @Composable get() = WebhookDefinition.asImageVector()
