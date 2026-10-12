package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PhoneLog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.832f, 16.568f)
                arcToRelative(1f, 1f, 0f, true, false, lf, .355f)
                arcToRelative(-.465f, Af, 2f, false, false, 0117f, 15f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, false, vf, 3f)
                arcToRelative(2f, 2f, 0f, true, false, 2f, Af)
                arcToRelative(18f, 18f, 0f, false, false, af, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.396f, 4.171f)
                horizontalLineToRelative(7.171f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.343f, 8.17f)
                horizontalLineToRelative(4.224f)
            }
}

public val LucideIcons.All.PhoneLogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PhoneLog: ImageVector
    @Composable get() = PhoneLogDefinition.asImageVector()
