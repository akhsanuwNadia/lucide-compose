package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClockArrowRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,6.0f)
                lineTo(12.0f,12.0f)
                lineTo(14.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.5f,21.885f)
                curveTo(9.365109f,22.512331f,5.276559f,20.500269f,3.2510571f,16.84128f)
                curveTo(1.2255554f,13.182289f,1.6909697f,8.649296f,4.417731f,5.478233f)
                curveTo(7.144492f,2.3071697f,11.556599f,1.1678926f,15.477746f,2.6223586f)
                curveTo(19.398893f,4.0768247f,22.000778f,7.8177915f,22.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,18.0f)
                lineTo(22.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,22.0f)
                lineTo(22.0f,18.0f)
                lineTo(18.0f,14.0f)
            }
}

public val LucideIcons.All.ClockArrowRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClockArrowRight: ImageVector
    @Composable get() = ClockArrowRightDefinition.asImageVector()
