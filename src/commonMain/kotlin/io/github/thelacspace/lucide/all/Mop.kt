package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mop") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 22f)
                curveToRelative(2.761f, 0f, 5f, -1.79f, 5f, -4f)
                curveToRelative(-4.42f, 0f, -4.08f, -5f, -8.5f, -5f)
                arcToRelative(1f, 1f, 0f, false, false, zf, af)
            }
            lucidePath(strokeWidth) {
                moveTo(12.5f, 11.5f)
                lineTo(22f, 2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6.98f, 13.02f)
                lineToRelative(2.665f, -2.664f)
                arcToRelative(1.21f, 1.21f, 0f, false, false, lf, 2.29f)
                arcToRelative(2.288f, af, 1.21f, true, false, 010f, 1.712f)
                lineToRelative(-2.088f, 2.087f)
            }
}

public val LucideIcons.All.MopDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mop: ImageVector
    @Composable get() = MopDefinition.asImageVector()
