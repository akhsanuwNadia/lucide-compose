package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Database") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(3.0221588611602783,20.6516170501709,7.045098781585693,21.986614227294922,12.0,21.986614227294922)
                curveTo(16.95490074157715,21.986614227294922,20.977840423583984,20.6516170501709,21.0,19.0)
                lineTo(21.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                curveTo(3.0221588611602783,13.651617050170898,7.045098781585693,14.986613273620605,12.0,14.986613273620605)
                curveTo(16.95490074157715,14.986613273620605,20.977840423583984,13.651617050170898,21.0,12.0)
            }
}

public val LucideIcons.All.DatabaseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Database: ImageVector
    @Composable get() = DatabaseDefinition.asImageVector()
