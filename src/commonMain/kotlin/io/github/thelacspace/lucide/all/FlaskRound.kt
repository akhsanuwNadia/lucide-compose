package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FlaskRound") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,2.0f)
                lineTo(10.0f,8.292f)
                curveTo(6.669246f,9.285039f,4.571557f,12.571566f,5.0733333f,16.01079f)
                curveTo(5.5751095f,19.450016f,8.5243635f,22.000204f,12.0f,22.000204f)
                curveTo(15.4756365f,22.000204f,18.42489f,19.450016f,18.926666f,16.01079f)
                curveTo(19.428444f,12.571566f,17.330753f,9.285039f,14.0f,8.292f)
                lineTo(14.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,15.0f)
                lineTo(19.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f,2.0f)
                lineTo(15.5f,2.0f)
            }
}

public val LucideIcons.All.FlaskRoundDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FlaskRound: ImageVector
    @Composable get() = FlaskRoundDefinition.asImageVector()
