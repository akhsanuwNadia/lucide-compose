package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShieldLock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20f, 9.807f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, cf)
                arcToRelative(-2f, 0f, -4.49f, false, false, -2.72f, af)
                arcToRelative(1.17f, 1.17f, 0f, false, false, 0f, Cf)
                arcToRelative(9.5f, 3.8f, 7f, false, false, 5f, af)
                arcToRelative(1f, 1f, 0f, false, false, 1f, vf)
                arcToRelative(7f, cf, 0f, false, false, 6.254f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 17f)
                verticalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, vf)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f, 17.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.ShieldLockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShieldLock: ImageVector
    @Composable get() = ShieldLockDefinition.asImageVector()
