package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CartonOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 10f)
                horizontalLineTo(5f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, hf, 10f)
                arcToRelative(2f, 2f, 0f, false, false, vf, -1f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 22f)
                verticalLineToRelative(-9f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.902f, 8.245f)
                lineTo(16f, 6f)
                horizontalLineToRelative(-4.343f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 13.343f)
                verticalLineTo(10f)
                arcToRelative(2f, 2f, 0f, false, false, -1.367f, Lf)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.034f, 7.034f)
                lineTo(5.539f, 8.633f)
            }
}

public val LucideIcons.All.CartonOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CartonOff: ImageVector
    @Composable get() = CartonOffDefinition.asImageVector()
