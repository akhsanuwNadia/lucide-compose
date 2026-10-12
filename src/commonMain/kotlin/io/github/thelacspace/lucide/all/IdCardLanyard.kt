package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("IdCardLanyard") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.5f, 8f)
                horizontalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 2f)
                lineToRelative(-1f, 2f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, false, vf, 14f)
                arcToRelative(2f, 2f, 0f, true, false, 2f, Hf)
                arcToRelative(7f, af, 2f, false, false, 01f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 22f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 2f)
                lineToRelative(3f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.IdCardLanyardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.IdCardLanyard: ImageVector
    @Composable get() = IdCardLanyardDefinition.asImageVector()
