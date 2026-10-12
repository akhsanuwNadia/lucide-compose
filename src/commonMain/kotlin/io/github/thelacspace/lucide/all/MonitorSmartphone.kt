package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MonitorSmartphone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,8.0f)
                lineTo(18.0f,6.0f)
                curveTo(18.0f,4.8954306f,17.10457f,4.0f,16.0f,4.0f)
                lineTo(4.0f,4.0f)
                curveTo(2.8954306f,4.0f,2.0f,4.8954306f,2.0f,6.0f)
                lineTo(2.0f,13.0f)
                curveTo(2.0f,14.104569f,2.8954306f,15.0f,4.0f,15.0f)
                lineTo(12.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,19.0f)
                lineTo(10.0f,15.04f)
                lineTo(10.0f,18.19f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,19.0f)
                lineTo(12.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,12.0f)
                lineTo(20.0f,12.0f)
                lineTo(22.0f,12.0f)
                lineTo(22.0f,22.0f)
                lineTo(20.0f,22.0f)
                lineTo(18.0f,22.0f)
                lineTo(16.0f,22.0f)
                lineTo(16.0f,12.0f)
                lineTo(18.0f,12.0f)
                close()
            }
}

public val LucideIcons.All.MonitorSmartphoneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MonitorSmartphone: ImageVector
    @Composable get() = MonitorSmartphoneDefinition.asImageVector()
