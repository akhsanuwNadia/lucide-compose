package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PlantPot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 8.536f)
                verticalLineTo(6f)
                arcToRelative(4f, 4f, 0f, false, false, hf, 1.5f)
                arcToRelative(.5f, .5f, 0f, true, false, Vf, 4f)
                arcToRelative(4f, 4f, 0f, true, false, 4f, 4f)
                arcToRelative(4f, 0f, 00f, false, false, 5f, 5f)
                arcToRelative(0f, 01f, -8f, false, false, 5f, 0f)
                arcToRelative(018f, 4f, cf, false, false, 1f, 3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18f, 17f)
                lineToRelative(-1.085f, 3.58f)
                arcTo(2f, 2f, 0f, false, false, Hf, 9.002f)
                arcToRelative(2f, 2f, 0f, true, false, -1.418f, Lf)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 17f)
                horizontalLineToRelative(14f)
            }
}

public val LucideIcons.All.PlantPotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PlantPot: ImageVector
    @Composable get() = PlantPotDefinition.asImageVector()
