package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Podium") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,6.0f)
                lineTo(12.0f,2.0f)
                lineTo(11.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,15.0f)
                curveTo(9.0f,14.447715f,8.552285f,14.0f,8.0f,14.0f)
                lineTo(4.0f,14.0f)
                curveTo(3.4477153f,14.0f,3.0f,14.447715f,3.0f,15.0f)
                lineTo(3.0f,20.0f)
                curveTo(3.0f,20.552284f,3.4477153f,21.0f,4.0f,21.0f)
                lineTo(20.0f,21.0f)
                curveTo(20.552284f,21.0f,21.0f,20.552284f,21.0f,20.0f)
                lineTo(21.0f,17.0f)
                curveTo(21.0f,16.447716f,20.552284f,16.0f,20.0f,16.0f)
                lineTo(16.0f,16.0f)
                curveTo(15.447715f,16.0f,15.0f,16.447716f,15.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,21.0f)
                lineTo(9.0f,11.0f)
                curveTo(9.0f,10.447715f,9.447715f,10.0f,10.0f,10.0f)
                lineTo(14.0f,10.0f)
                curveTo(14.552285f,10.0f,15.0f,10.447715f,15.0f,11.0f)
                lineTo(15.0f,21.0f)
            }
}

public val LucideIcons.All.PodiumDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Podium: ImageVector
    @Composable get() = PodiumDefinition.asImageVector()
