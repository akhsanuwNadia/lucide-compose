package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShieldHouse") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 22f)
                arcToRelative(1f, 1f, 0f, true, false, -1f, vf)
                arcToRelative(-4f, af, 1f, true, false, 01.445f, -.832f)
                lineToRelative(3f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, lf, 3f)
                arcToRelative(2f, Af, 1f, true, false, 0122f, 17f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, true, false, 1f, zf)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 22f)
                verticalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 10.418f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, cf)
                arcToRelative(-2f, 0f, -4.49f, false, false, -2.72f, af)
                arcToRelative(1.17f, 1.17f, 0f, false, false, 0f, Cf)
                arcToRelative(9.5f, 3.8f, 7f, false, false, 5f, af)
                arcToRelative(1f, 1f, 0f, false, false, 1f, vf)
                arcToRelative(7f, cf, 0f, false, false, 7.1f, 6.037f)
            }
}

public val LucideIcons.All.ShieldHouseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShieldHouse: ImageVector
    @Composable get() = ShieldHouseDefinition.asImageVector()
