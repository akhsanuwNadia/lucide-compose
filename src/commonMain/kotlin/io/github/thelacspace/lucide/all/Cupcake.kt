package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cupcake") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                verticalLineToRelative(-9f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 4f)
                horizontalLineToRelative(1f)
                arcToRelative(3f, 3f, 0f, false, false, lf, -.004f)
                arcToRelative(.125f, Af, 4f, false, false, 0121f, 11f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15.5f, 22f)
                lineToRelative(1.5f, -9f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 13f)
                arcToRelative(1f, 1f, 0f, true, true, lf, -2.74f)
                arcToRelative(6.394f, Af, 2f, false, false, 0117.34f, 22f)
                horizontalLineTo(6.659f)
                arcToRelative(2f, 2f, 0f, true, false, -1.212f, lf)
                arcToRelative(-2.74f, -6.394f, Af, true, true, 0f, 013f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 13f)
                verticalLineToRelative(-2f)
                arcToRelative(4f, 4f, 0f, false, false, Lf, 6f)
                arcToRelative(7f, af, 3f, false, false, 013f, -3f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f, 22f)
                lineTo(7f, 13f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.CupcakeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cupcake: ImageVector
    @Composable get() = CupcakeDefinition.asImageVector()
