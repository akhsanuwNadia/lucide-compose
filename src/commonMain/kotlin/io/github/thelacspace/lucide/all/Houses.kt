package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Houses") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(12.681f, 4.24f)
                lineToRelative(.834f, -.715f)
                arcToRelative(1.45f, 1.45f, 0f, false, false, lf, 5.09f)
                arcToRelative(4.364f, Af, 1.45f, true, false, 0121f, 9f)
                verticalLineToRelative(6.546f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.485f, 11.889f)
                arcTo(1.45f, 1.45f, 0f, false, false, vf, 6.546f)
                arcTo(1.454f, 1.454f, 0f, false, false, Hf, 4.364f)
                arcToRelative(1.454f, 1.454f, 0f, true, false, -1.454f, Vf)
                arcToRelative(13f, af, 1.45f, true, false, 01.515f, -1.111f)
                lineToRelative(5.09f, -4.364f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.41f, 20.546f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, false, hf, 2f)
                arcToRelative(1f, 1f, 0f, false, true, vf, 4f)
            }
}

public val LucideIcons.All.HousesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Houses: ImageVector
    @Composable get() = HousesDefinition.asImageVector()
