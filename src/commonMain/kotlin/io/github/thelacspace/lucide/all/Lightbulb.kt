package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Lightbulb") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,14.0)
                curveTo(15.199999809265137,13.0,15.699999809265137,12.300000190734863,16.5,11.5)
                curveTo(17.5,10.600000381469727,18.0,9.300000190734863,18.0,8.0)
                curveTo(17.985227584838867,4.696765422821045,15.303267478942871,2.026772975921631,12.0,2.026772975921631)
                curveTo(8.696732521057129,2.026772975921631,6.014772415161133,4.696765422821045,6.0,8.0)
                curveTo(6.0,9.0,6.199999809265137,10.199999809265137,7.5,11.5)
                curveTo(8.199999809265137,12.199999809265137,8.800000190734863,13.0,9.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,18.0)
                lineTo(15.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,22.0)
                lineTo(14.0,22.0)
            }
}

public val LucideIcons.All.LightbulbDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Lightbulb: ImageVector
    @Composable get() = LightbulbDefinition.asImageVector()
