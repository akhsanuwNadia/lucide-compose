package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BuildingComplexPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 12f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 21f)
                verticalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 8f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 19f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 7f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, false, vf, 4.355f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 16f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 10f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, vf)
                arcToRelative(7f, af, 2f, false, false, 002f, 2f)
                horizontalLineToRelative(8.535f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 21f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, hf, 8f)
                arcToRelative(2f, 2f, 0f, false, false, vf, 7.126f)
            }
}

public val LucideIcons.All.BuildingComplexPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BuildingComplexPlus: ImageVector
    @Composable get() = BuildingComplexPlusDefinition.asImageVector()
