package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShieldKeyhole") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 13f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 13f)
                curveToRelative(0f, 5f, -3.5f, 7.5f, -7.66f, 8.95f)
                arcToRelative(1f, 1f, 0f, true, false, -.01f, Cf)
                arcToRelative(7.5f, 20.5f, 4f, false, false, 13f, Vf)
                arcToRelative(6f, af, 1f, true, false, 011f, -1f)
                curveToRelative(2f, 0f, 4.5f, -1.2f, 6.24f, -2.72f)
                arcToRelative(1.17f, 1.17f, 0f, false, false, Cf, 14.51f)
                arcToRelative(3.81f, 17f, 5f, false, false, af, 1f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.ShieldKeyholeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShieldKeyhole: ImageVector
    @Composable get() = ShieldKeyholeDefinition.asImageVector()
