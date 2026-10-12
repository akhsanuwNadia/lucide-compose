package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Balloon") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,16.0)
                lineTo(12.0,17.0)
                curveTo(12.0,18.104570388793945,12.895430564880371,19.0,14.0,19.0)
                lineTo(15.0,19.0)
                curveTo(16.104570388793945,19.0,17.0,19.895429611206055,17.0,21.0)
                lineTo(17.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,6.0)
                curveTo(13.104569435119629,6.0,14.0,6.895430564880371,14.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,8.0)
                curveTo(18.0,12.0,14.5,16.0,12.0,16.0)
                curveTo(9.5,16.0,6.0,12.0,6.0,8.0)
                curveTo(6.014772415161133,4.696765422821045,8.696732521057129,2.026772975921631,12.0,2.026772975921631)
                curveTo(15.303267478942871,2.026772975921631,17.985227584838867,4.696765422821045,18.0,8.0)
            }
}

public val LucideIcons.All.BalloonDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Balloon: ImageVector
    @Composable get() = BalloonDefinition.asImageVector()
