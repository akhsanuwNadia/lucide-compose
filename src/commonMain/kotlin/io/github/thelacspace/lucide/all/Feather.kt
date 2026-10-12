package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Feather") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.086f, 18.412f)
                arcTo(2f, 2f, 0f, false, false, Hf, 5f)
                verticalLineToRelative(-7.672f)
                arcToRelative(2f, 2f, 0f, true, false, Lf, 11.75f)
                arcToRelative(3.75f, af, 6f, false, false, 118.49f, 8.49f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 8f)
                lineTo(2f, 22f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.488f, 15f)
                horizontalLineTo(9f)
            }
}

public val LucideIcons.All.FeatherDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Feather: ImageVector
    @Composable get() = FeatherDefinition.asImageVector()
