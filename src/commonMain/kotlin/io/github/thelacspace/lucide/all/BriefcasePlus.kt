package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BriefcasePlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.354000091552734,20.0)
                lineTo(4.0,20.0)
                curveTo(2.895430564880371,20.0,2.0,19.104570388793945,2.0,18.0)
                lineTo(2.0,8.0)
                curveTo(2.0,6.895430564880371,2.895430564880371,6.0,4.0,6.0)
                lineTo(20.0,6.0)
                curveTo(21.104570388793945,6.0,22.0,6.895430564880371,22.0,8.0)
                lineTo(22.0,11.354000091552734)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,11.354000091552734)
                lineTo(16.0,4.0)
                curveTo(16.0,2.895430564880371,15.104569435119629,2.0,14.0,2.0)
                lineTo(10.0,2.0)
                curveTo(8.895430564880371,2.0,8.0,2.895430564880371,8.0,4.0)
                lineTo(8.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,17.0)
                lineTo(22.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,14.0)
                lineTo(19.0,20.0)
            }
}

public val LucideIcons.All.BriefcasePlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BriefcasePlus: ImageVector
    @Composable get() = BriefcasePlusDefinition.asImageVector()
