package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BriefcasePlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.354f, 20f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, true, false, -2f, Vf)
                arcToRelative(8f, af, 2f, false, false, 012f, -2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, vf, 3.354f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 11.354f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, hf)
                arcToRelative(-4f, af, 2f, false, false, 00f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 17f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 14f)
                verticalLineToRelative(6f)
            }
}

public val LucideIcons.All.BriefcasePlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BriefcasePlus: ImageVector
    @Composable get() = BriefcasePlusDefinition.asImageVector()
