package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("StarPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.013f, 18.582f)
                lineTo(6.396f, 21.01f)
                arcToRelative(.53f, .53f, 0f, false, true, -.77f, -.56f)
                lineToRelative(.881f, -5.139f)
                arcToRelative(2.12f, 2.12f, 0f, false, false, -.611f, -1.879f)
                lineTo(2.16f, 9.795f)
                arcToRelative(.53f, .53f, 0f, false, true, .294f, -.906f)
                lineToRelative(5.165f, -.755f)
                arcToRelative(2.12f, 2.12f, 0f, false, false, 1.597f, -1.16f)
                lineToRelative(2.309f, -4.679f)
                arcToRelative(.53f, .53f, 0f, false, true, .95f, 0f)
                lineToRelative(2.31f, 4.679f)
                arcToRelative(2.12f, 2.12f, 0f, false, false, 1.595f, 1.16f)
                lineToRelative(5.166f, .756f)
                arcToRelative(.53f, .53f, 0f, false, true, .294f, .904f)
                lineTo(20f, 11.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 18f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 15f)
                verticalLineToRelative(6f)
            }
}

public val LucideIcons.All.StarPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.StarPlus: ImageVector
    @Composable get() = StarPlusDefinition.asImageVector()
