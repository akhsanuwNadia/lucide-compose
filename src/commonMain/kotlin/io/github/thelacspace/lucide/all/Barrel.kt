package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Barrel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,3.0f)
                curveTo(8.666667f,8.925926f,8.666667f,15.074074f,10.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,3.0f)
                curveTo(15.333333f,8.925926f,15.333333f,15.074074f,14.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.997f,21.0f)
                curveTo(17.676985f,20.998867f,18.309809f,20.65232f,18.677f,20.08f)
                curveTo(21.765633f,15.136077f,21.765633f,8.863923f,18.677f,3.92f)
                curveTo(18.309809f,3.3476796f,17.676985f,3.0011327f,16.997f,3.0f)
                lineTo(6.9969997f,3.0f)
                curveTo(6.3166604f,3.000793f,5.683383f,3.3473816f,5.316f,3.92f)
                curveTo(2.2273684f,8.863923f,2.2273684f,15.136077f,5.316f,20.08f)
                curveTo(5.683383f,20.652618f,6.3166604f,20.999207f,6.9969997f,21.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.54f,16.0f)
                lineTo(20.453999f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.54f,8.0f)
                lineTo(20.453999f,8.0f)
            }
}

public val LucideIcons.All.BarrelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Barrel: ImageVector
    @Composable get() = BarrelDefinition.asImageVector()
