package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareBottomDashedScissors") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 21f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 17f)
                lineToRelative(-2.18f, -2.18f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 21f)
                arcToRelative(2f, 2f, 0f, true, false, -2f, Vf)
                arcToRelative(5f, af, 2f, false, false, 012f, -2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, vf, 14f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 21f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.56f, 14.44f)
                lineTo(17f, 7f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.56f, 9.56f)
                lineTo(12f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f, 15.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 3.0f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, -3.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 3.0f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, -3.0f, 0f)
            }
}

public val LucideIcons.All.SquareBottomDashedScissorsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareBottomDashedScissors: ImageVector
    @Composable get() = SquareBottomDashedScissorsDefinition.asImageVector()
