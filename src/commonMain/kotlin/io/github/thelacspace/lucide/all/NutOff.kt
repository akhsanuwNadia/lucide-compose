package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("NutOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.868f,11.868f)
                curveTo(11.736383f,12.00191f,11.565386f,12.090213f,11.38f,12.12f)
                curveTo(9.6f,12.4f,7.84f,11.95f,6.5f,11.5f)
                curveTo(6.5f,12.772f,6.271f,15.078f,5.847f,16.847f)
                curveTo(5.7405977f,17.310675f,5.601244f,17.766165f,5.4300003f,18.210001f)
                curveTo(5.2200003f,18.730001f,4.61f,18.76f,4.26f,18.330002f)
                curveTo(1.0153521f,14.353411f,1.3078921f,8.5661335f,4.9370003f,4.937002f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.14f,6.485f)
                curveTo(13.72451f,6.4089913f,15.299427f,6.1955223f,16.847f,5.847f)
                lineTo(20.0f,9.0f)
                curveTo(21.791618f,10.874118f,22.442554f,13.564099f,21.706f,16.05f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.707f,20.707f)
                curveTo(20.519508f,20.89455f,20.265196f,20.999945f,20.0f,21.0f)
                lineTo(19.0f,21.0f)
                curveTo(17.931f,21.0f,17.352f,21.242f,16.515f,21.552f)
                curveTo(13.920629f,22.52302f,10.999252f,21.919537f,9.002f,20.0f)
                lineTo(5.847f,16.847f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.356f,2.7f)
                curveTo(11.718413f,1.3805107f,15.531066f,1.976835f,18.33f,4.26f)
                curveTo(18.76f,4.61f,18.73f,5.2300005f,18.21f,5.4300003f)
                curveTo(17.766163f,5.601244f,17.310673f,5.7405977f,16.846998f,5.847f)
            }
}

public val LucideIcons.All.NutOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.NutOff: ImageVector
    @Composable get() = NutOffDefinition.asImageVector()
