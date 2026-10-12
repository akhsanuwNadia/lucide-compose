package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LampCeiling") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.829f,15.998f)
                curveTo(15.267691f,17.24107f,14.843535f,18.624868f,13.783604f,19.408588f)
                curveTo(12.723673f,20.192308f,11.276328f,20.192308f,10.216397f,19.408588f)
                curveTo(9.156466f,18.624868f,8.73231f,17.24107f,9.1710005f,15.998f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.92f,14.606f)
                curveTo(21.05251f,14.915112f,21.020761f,15.270129f,20.83551f,15.550826f)
                curveTo(20.650259f,15.831523f,20.336317f,16.0003f,20.0f,16.0f)
                lineTo(4.0f,16.0f)
                curveTo(3.6636837f,16.0003f,3.3497415f,15.831523f,3.1644897f,15.550826f)
                curveTo(2.979238f,15.270129f,2.9474912f,14.915112f,3.08f,14.606f)
                lineTo(6.08f,7.606f)
                curveTo(6.2377257f,7.238062f,6.5996804f,6.999644f,7.0f,7.0f)
                lineTo(17.0f,7.0f)
                curveTo(17.40032f,6.999644f,17.762274f,7.238062f,17.92f,7.606f)
                close()
            }
}

public val LucideIcons.All.LampCeilingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LampCeiling: ImageVector
    @Composable get() = LampCeilingDefinition.asImageVector()
