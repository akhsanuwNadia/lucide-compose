package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HikingStick") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.5f, 10.5f)
                lineTo(2f, 22f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.352f, 11.648f)
                arcToRelative(1.205f, 1.205f, 0f, true, false, 0f, lf)
                arcToRelative(-2.296f, -2.296f, af, true, true, 0f, 010f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6f, 21f)
                lineToRelative(-3f, -3f)
            }
}

public val LucideIcons.All.HikingStickDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HikingStick: ImageVector
    @Composable get() = HikingStickDefinition.asImageVector()
