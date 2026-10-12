package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Citrus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.66f,17.67f)
                curveTo(21.880707f,17.880308f,22.002249f,18.174099f,21.99463f,18.478867f)
                curveTo(21.987011f,18.783634f,21.850939f,19.070984f,21.619999f,19.27f)
                curveTo(16.849325f,23.190756f,9.88198f,22.850904f,5.5155373f,18.48446f)
                curveTo(1.1490948f,14.118018f,0.8092442f,7.150673f,4.73f,2.38f)
                curveTo(4.932475f,2.1512945f,5.2209315f,2.017078f,5.526292f,2.0094912f)
                curveTo(5.831652f,2.0019047f,6.1264176f,2.1216314f,6.34f,2.3400002f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(19.65f,15.66f)
                curveTo(16.502054f,18.64552f,11.54812f,18.577745f,8.483026f,15.507227f)
                curveTo(5.4179316f,12.4367075f,5.3589187f,7.4826612f,8.35f,4.34f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,10.0f)
                lineTo(8.5f,15.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,17.85f)
                lineTo(14.0f,10.0f)
                lineTo(6.15f,10.0f)
            }
}

public val LucideIcons.All.CitrusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Citrus: ImageVector
    @Composable get() = CitrusDefinition.asImageVector()
