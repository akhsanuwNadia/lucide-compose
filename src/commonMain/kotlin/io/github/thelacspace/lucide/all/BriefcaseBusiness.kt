package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BriefcaseBusiness") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(12.010000228881836,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,6.0)
                lineTo(16.0,4.0)
                curveTo(16.0,2.895430564880371,15.104569435119629,2.0,14.0,2.0)
                lineTo(10.0,2.0)
                curveTo(8.895430564880371,2.0,8.0,2.895430564880371,8.0,4.0)
                lineTo(8.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,13.0)
                curveTo(15.934654235839844,17.0044002532959,8.065345764160156,17.0044002532959,2.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,6.0)
                lineTo(20.0,6.0)
                lineTo(22.0,6.0)
                lineTo(22.0,20.0)
                lineTo(20.0,20.0)
                lineTo(4.0,20.0)
                lineTo(2.0,20.0)
                lineTo(2.0,6.0)
                lineTo(4.0,6.0)
                close()
            }
}

public val LucideIcons.All.BriefcaseBusinessDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BriefcaseBusiness: ImageVector
    @Composable get() = BriefcaseBusinessDefinition.asImageVector()
