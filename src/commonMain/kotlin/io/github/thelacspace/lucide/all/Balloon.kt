package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Balloon") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,16.0f)
                lineTo(12.0f,17.0f)
                curveTo(12.0f,18.10457f,12.895431f,19.0f,14.0f,19.0f)
                lineTo(15.0f,19.0f)
                curveTo(16.10457f,19.0f,17.0f,19.89543f,17.0f,21.0f)
                lineTo(17.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,6.0f)
                curveTo(13.104569f,6.0f,14.0f,6.8954306f,14.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,8.0f)
                curveTo(18.0f,12.0f,14.5f,16.0f,12.0f,16.0f)
                curveTo(9.5f,16.0f,6.0f,12.0f,6.0f,8.0f)
                curveTo(6.0147724f,4.6967654f,8.6967325f,2.026773f,12.0f,2.026773f)
                curveTo(15.3032675f,2.026773f,17.985228f,4.6967654f,18.0f,8.0f)
            }
}

public val LucideIcons.All.BalloonDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Balloon: ImageVector
    @Composable get() = BalloonDefinition.asImageVector()
