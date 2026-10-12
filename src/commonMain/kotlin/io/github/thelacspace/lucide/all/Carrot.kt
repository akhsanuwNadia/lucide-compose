package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Carrot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 16f)
                arcToRelative(1f, 1f, 0f, false, false, -7f, -7f)
                quadToRelative(-4f, 4f, -5.987f, 12.385f)
                arcToRelative(.5f, .5f, 0f, false, false, .602f, .602f)
                quadTo(11f, 20f, 15f, 16f)
                lineToRelative(-3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 9f)
                quadToRelative(4f, 4f, 7f, 0f)
                quadToRelative(-3f, -4f, -7f, 0f)
                quadToRelative(4f, -4f, 0f, -7f)
                quadToRelative(-4f, 3f, 0f, 7f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 15f)
                lineToRelative(-2.58f, -2.58f)
            }
}

public val LucideIcons.All.CarrotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Carrot: ImageVector
    @Composable get() = CarrotDefinition.asImageVector()
