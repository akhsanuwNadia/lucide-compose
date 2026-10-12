package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mosque") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.268f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 5f)
                lineTo(14f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 22f)
                verticalLineToRelative(-3f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, vf)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 13f)
                curveToRelative(-.662f, -1.497f, -1.666f, -2.753f, -2.9f, -3.63f)
                curveTo(16.825f, 8.47f, 15.422f, 8f, 14f, 8f)
                reflectiveCurveToRelative(-2.826f, .47f, -4.1f, 1.37f)
                curveTo(8.668f, 10.248f, 7.663f, 11.504f, 7f, 13f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 9f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 22f)
                verticalLineTo(6f)
                arcToRelative(5f, 5f, 0f, false, false, -4f, 5f)
                arcToRelative(5f, 0f, 00f, false, false, vf, 14f)
                arcToRelative(2f, 2f, 0f, false, false, hf, 14f)
                arcToRelative(2f, 2f, 0f, false, false, vf, -7f)
            }
}

public val LucideIcons.All.MosqueDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mosque: ImageVector
    @Composable get() = MosqueDefinition.asImageVector()
