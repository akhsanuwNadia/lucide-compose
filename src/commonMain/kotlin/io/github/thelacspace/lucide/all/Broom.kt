package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Broom") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.5f, 10.5f)
                lineTo(22f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.734f, 13.841f)
                arcToRelative(2f, 2f, 0f, false, false, -2.42f, Lf)
                arcToRelative(12.58f, 9.58f, af, false, false, 0f, 00f)
                arcToRelative(-2.421f, -.314f, lf, false, false, Af, 1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5f, 18f)
                lineToRelative(2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7.699f, 10.7f)
                lineToRelative(5.602f, 5.601f)
            }
}

public val LucideIcons.All.BroomDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Broom: ImageVector
    @Composable get() = BroomDefinition.asImageVector()
