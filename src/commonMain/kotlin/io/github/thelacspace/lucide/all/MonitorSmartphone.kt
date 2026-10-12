package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MonitorSmartphone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0,8.0)
                lineTo(18.0,6.0)
                curveTo(18.0,4.895430564880371,17.104570388793945,4.0,16.0,4.0)
                lineTo(4.0,4.0)
                curveTo(2.895430564880371,4.0,2.0,4.895430564880371,2.0,6.0)
                lineTo(2.0,13.0)
                curveTo(2.0,14.104569435119629,2.895430564880371,15.0,4.0,15.0)
                lineTo(12.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,19.0)
                lineTo(10.0,15.039999961853027)
                lineTo(10.0,18.190000534057617)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,19.0)
                lineTo(12.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,12.0)
                lineTo(20.0,12.0)
                lineTo(22.0,12.0)
                lineTo(22.0,22.0)
                lineTo(20.0,22.0)
                lineTo(18.0,22.0)
                lineTo(16.0,22.0)
                lineTo(16.0,12.0)
                lineTo(18.0,12.0)
                close()
            }
}

public val LucideIcons.All.MonitorSmartphoneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MonitorSmartphone: ImageVector
    @Composable get() = MonitorSmartphoneDefinition.asImageVector()
